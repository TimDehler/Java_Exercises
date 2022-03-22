package person;

public class Persons {

    public static void main(String[] args) {

        Person person1 = new Person("Tim");
        person1.setWeight(70);
        System.out.println(person1);

        Person person2 = new Person("Max", 87);
        System.out.println(person2);

    }
}
