import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

enum Department{
    PLASTIC, EXCHANGE, SERVICE
}

class Person{
    private final String name;
    private final int queue;
    private final Department department;

    public Person(String name, int queue, Department department){
        this.name = name;
        this.queue = queue;
        this.department = department;
    }

    @Override
    public String toString() {
        return this.queue + "-> " + this.name;
    }

    public Department getDepartment() {
        return this.department;
    }
}

public class Navbat {
    private static Scanner scanner;
    private static Queue<Person> people;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        people = new ArrayDeque<>();
        people.add(new Person("Xudoyshukur", people.size()+1, Department.PLASTIC));
        people.add(new Person("Akmal", people.size()+1, Department.PLASTIC));
        people.add(new Person("Shoxrux", people.size()+1, Department.PLASTIC));
        people.add(new Person("Asad", people.size()+1, Department.PLASTIC));

        people.add(new Person("Donyor", people.size()+1, Department.EXCHANGE));
        people.add(new Person("Otabek", people.size()+1, Department.EXCHANGE));

        people.add(new Person("Yorqinjon", people.size()+1, Department.SERVICE));


        while (true) {
            System.out.println("Tanlang\n1->Xodim\n2->Navbat olish\n3->Navbatlarni ko'rish");
            int tanlov = scanner.nextInt();
            switch (tanlov) {
                case 1: {
                    System.out.println("Siz xodimsiz");
                    break;
                }
                case 2: {
                    mijozTanlandi();
                    break;
                }
                case 3: {
                    navbatlarniKorsat();
                    break;
                }
                default: {
                    System.out.println("To'g'ri tanlov qiling");
                }
            }
        }

    }

    private static void navbatlarniKorsat() {
        boolean backToChoice;
        do{
            System.out.println("Tanlang\n1->Plastik olish\n2->Ayirboshlash\n3->Xizmat ko'rsatish");
            int tanlov = scanner.nextInt();
            switch (tanlov){
                case 1: {
                    System.out.println("Navbat ->");
                    for(Person person: people){
                        if(person.getDepartment() == Department.PLASTIC){
                            System.out.println(person);
                        }
                    }
                    backToChoice = false;
                    break;
                }
                case 2:{
                    System.out.println("Navbat ->");
                    for(Person person: people){
                        if(person.getDepartment() == Department.EXCHANGE){
                            System.out.println(person);
                        }
                    }
                    backToChoice = false;
                    break;
                }
                case 3:{
                    System.out.println("Navbat ->");
                    for(Person person: people){
                        if(person.getDepartment() == Department.SERVICE){
                            System.out.println(person);
                        }
                    }
                    backToChoice = false;
                    break;
                }
                default:{
                    System.out.println("To'g'ri tanlov qiling");
                    backToChoice = true;
                }
            }
        }while (backToChoice);

        System.out.println("Davom etish uchun istalgan belgi kiriting");
        scanner.next();
    }

    private static void mijozTanlandi() {
        boolean backToChoice;
        do{
            System.out.println("Tanlang\n1->Plastik olish\n2->Ayirboshlash\n3->Xizmat ko'rsatish");
            int tanlov = scanner.nextInt();
            switch (tanlov){
                case 1: {
                    System.out.println("Ismingizni kiriting");
                    scanner.nextLine();
                    String me = scanner.nextLine().trim();
                    people.add(new Person(me, people.size() + 1, Department.PLASTIC));
                    backToChoice = false;
                    break;
                }
                case 2:{
                    System.out.println("Ismingizni kiriting");
                    scanner.nextLine();
                    String me = scanner.nextLine().trim();
                    people.add(new Person(me, people.size() + 1, Department.EXCHANGE));
                    backToChoice = false;
                    break;
                }
                case 3:{
                    System.out.println("Ismingizni kiriting");
                    scanner.nextLine();
                    String me = scanner.nextLine().trim();
                    people.add(new Person(me, people.size() + 1, Department.SERVICE));
                    backToChoice = false;
                    break;
                }
                default:{
                    System.out.println("To'g'ri tanlov qiling");
                    backToChoice = true;
                }
            }
        }while (backToChoice);

        System.out.println("Davom etish uchun istalgan belgi kiriting");
        scanner.next();
    }
}
