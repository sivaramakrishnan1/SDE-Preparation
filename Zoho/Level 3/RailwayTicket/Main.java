import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Boolean loop = true;

        while(loop){

            System.out.println(" 1. Book Tickets \n 2. Cancel Ticket \n 3. Availabe Tickets \n 4. Booked Tickets \n 5. Exit");
            int choice = s.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Passenger name: ");
                    String name = s.next();
                    System.out.println("Enter age: ");
                    int age = s.nextInt();
                    System.out.println("Enter Berth Preference (L, M or U)");
                    String berthPreference = s.next();

                    Passenger p = new Passenger(name,age,berthPreference);
                    bookTicket(p);
                    break;
                case 2:
                    System.out.println("Enter Passenger Id to Cancel: ");
                    int id = s.nextInt();
                    cancelTicket(id);
                    break;
                case 3:
                    TicketBooker booker = new TicketBooker();
                    booker.printAvailable();
                    break;
                case 4:
                    TicketBooker booker1 = new TicketBooker();
                    booker1.printPassengers();
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Enter the choice correctly");
                    break;
            }
        }
    }
    public static void bookTicket(Passenger p){
        TicketBooker booker  = new TicketBooker();

        if(TicketBooker.availableWaitingList==0){
            System.out.println("No Tickets Available");
            return;
        }

        if((p.birthPreference.equals("L") && TicketBooker.availableLowerBerth > 0) ||
           (p.birthPreference.equals("M") && TicketBooker.availableMiddleBerth > 0) ||
            (p.birthPreference.equals("U") && TicketBooker.availableUpperBerth > 0))
        {
            System.out.println("Preffered Berth Available \n");
            if(p.birthPreference.equals("L")){
                System.out.println("Lower Berth is alloted to you");
                booker.bookTicket(p,TicketBooker.lowerBerthPositions.get(0),"L");

                TicketBooker.lowerBerthPositions.remove(0);
                TicketBooker.availableLowerBerth--;
            }
            else if(p.birthPreference.equals("M")){
                System.out.println("Middle Berth is alloted to you");
                booker.bookTicket(p,TicketBooker.middleBerthPositions.get(0),"M");

                TicketBooker.middleBerthPositions.remove(0);
                TicketBooker.availableMiddleBerth--;
            }
            else if(p.birthPreference.equals("U")){
                System.out.println("Upper Berth is alloted to you");
                booker.bookTicket(p,TicketBooker.upperBerthPositions.get(0),"U");

                TicketBooker.upperBerthPositions.remove(0);
                TicketBooker.availableUpperBerth--;
            }
            else if(TicketBooker.availableRACTicket > 0){
                System.out.println("RAC Ticket Available");
                booker.addToRac(p,TicketBooker.racPositions.get(0), "RAC");

            }
            else if(TicketBooker.availableWaitingList>0){
                System.out.println("Added to Waiting List");
                booker.addToWaitingList(p,TicketBooker.waitingListPositions.get(0),"WL");

            }
        }
    }

    public static void cancelTicket(int id){
        TicketBooker booker = new TicketBooker();

        if(!booker.passengers.containsKey(id)){
            System.out.println("Passengers detail unknown, Enter the detaail properly");
        }
        else{
            booker.cancelTicket(id);
        }
    }
}
