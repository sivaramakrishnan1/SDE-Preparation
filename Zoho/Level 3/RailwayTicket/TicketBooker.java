import java.util.*;

public class TicketBooker {

    static int availableLowerBerth = 1;
    static int availableMiddleBerth = 1;
    static int availableUpperBerth = 1;
    static int availableRACTicket = 1;
    static int availableWaitingList = 1;

    static Queue<Integer> waitingList = new LinkedList<>();
    static Queue<Integer> racList = new LinkedList<>();
    static List<Integer> BookedTicketList = new ArrayList<>();

    static List<Integer> lowerBerthPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> middleBerthPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> upperBerthPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> racPositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> waitingListPositions = new ArrayList<>(Arrays.asList(1));

    public static Map<Integer,Passenger> passengers = new HashMap<>();


    public static void bookTicket(Passenger p, int berthInfo, String allotedBerth){
        p.number = berthInfo;
        p.alloted = allotedBerth;

        passengers.put(p.passengerId,p);
        BookedTicketList.add(p.passengerId);
        System.out.println("-------------------Booked Ticket Successfully");
    }

    public  void addToRac(Passenger p, int racInfo, String allotedRac){
        p.number = racInfo;
        p.alloted = allotedRac;

        passengers.put(p.passengerId,p);
        racList.add(p.passengerId);

        availableRACTicket--;
        racPositions.remove(0);

        System.out.println("-------------------Added to RAC Successfully");

    }

    public void addToWaitingList(Passenger p,int waitingInfo, String allotedBerth){
        p.number = waitingInfo;
        p.alloted = allotedBerth;

        passengers.put(p.passengerId,p);

        waitingList.add(p.passengerId);
        availableWaitingList--;
        waitingListPositions.remove(0);

        System.out.println("--------------------Added to Waiting List Successfully");
    }

    public void cancelTicket(int passengersId){

        Passenger p =passengers.get(passengersId);
        passengers.remove(Integer.valueOf(passengersId));
        BookedTicketList.remove(Integer.valueOf(passengersId));

        int positionBooked = p.number;
        System.out.println("---------------Cancelled Successfully");

        if(p.alloted.equals("L")){
            availableLowerBerth++;
            lowerBerthPositions.add(positionBooked);
        }
        else if(p.alloted.equals("M")){
            availableMiddleBerth++;
            middleBerthPositions.add(positionBooked);
        }
        else if(p.alloted.equals("U")){
            availableUpperBerth++;
            upperBerthPositions.add(positionBooked);
        }

        if(racList.size()>0){
            Passenger passengerFromRac = passengers.get(racList.poll());
            int posiionRac = passengerFromRac.number;
            racPositions.add(posiionRac);
            racList.remove(passengerFromRac.passengerId);
            availableRACTicket++;

           if(waitingList.size()>0){

               Passenger passengerFromWaaitingList = passengers.get(waitingList.poll());
               int positionWL = passengerFromWaaitingList.number;
               waitingListPositions.add(positionWL);
               waitingList.remove(passengerFromWaaitingList.passengerId);
               racList.add(passengerFromWaaitingList.passengerId);

               availableWaitingList++;
               availableRACTicket--;
           }

           Main.bookTicket(passengerFromRac);
        }
    }

    public void printAvailable(){
        System.out.println("Available Lower Berths - " + availableLowerBerth);
        System.out.println("Available Middle Berths - " + availableMiddleBerth);
        System.out.println("Available Upper Berths - " + availableUpperBerth);
        System.out.println("Available RAC - " + availableRACTicket);
        System.out.println("Available Waiting List - " + availableWaitingList);
        System.out.println("----------------------------");
    }

    public void printPassengers(){
        if(passengers.size()==0){
            System.out.println("No details of passengers");
            return;
        }
        for(Passenger p : passengers.values()){
            System.out.println("Passengers Id - " + p.passengerId);
            System.out.println("Name - " + p.name);
            System.out.println("Age - " + p.age);
            System.out.println("Status" + p.number+p.alloted);
            System.out.println("----------------------------------");
        }
    }

}
