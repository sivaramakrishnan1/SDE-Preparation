public class Passenger {
    static int id=1;
    String name;
    int age;
    String birthPreference;
    int passengerId;
    String alloted;
    int number;

    Passenger(String name, int age, String birthPreference){
        this.name = name;
        this.age = age;
        this.birthPreference = birthPreference;
        this.passengerId = id++;
        alloted= "";
        number = 0;
    }


}
