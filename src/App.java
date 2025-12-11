import controllers.ListaEnlazada;
import controllers.Queue;
import controllers.Stack;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        runStackExample();
        runQueueExample();
    }

    public static void runStackExample(){
        Stack<Person> persons = new Stack<Person>();
        persons.push(new Person ("Juan", 30));
        persons.push(new Person ("Maria", 35));
        persons.push(new Person ("Pepito", 32));
        persons.push(new Person ("Diego", 31));

        System.out.println("Size = " + persons.size());
        persons.printAllNodes();
        System.out.println(persons.pop());
        System.out.println("Size = " + persons.size());
        persons.printAllNodes();
    }

    public static void runQueueExample(){
        Queue<Person> persons = new Queue<Person>();

        persons.enqueue(new Person ("Juan", 30));
        persons.enqueue(new Person ("Maria", 35));
        persons.enqueue(new Person ("Pepito", 32));
        persons.enqueue(new Person ("Diego", 31));

        System.out.println("Size = " + persons.size());
        persons.printAllNodes();

        System.out.println(persons.dequeue());
        System.out.println("Primera: " + persons.getFirst());
        System.out.println("Última: " + persons.getLast());

        System.out.println("Size = " + persons.size());
        persons.printAllNodes();


            //runLinkedListExample();
        Person personA = new Person("Pepito", 32);
        Person personB = new Person("Pepito", 32);
        System.out.println(personA);
        System.out.println(personB);
        System.out.println(personA.equals(personB));
    }

    public static void runLinkedListExample() {
        ListaEnlazada<Person> persons = new ListaEnlazada<Person>();
        persons.append(new Person("Juan", 30));
        persons.append(new Person("Maria", 35));
        persons.append(new Person("Pepito", 32));
        persons.append(new Person("Diego", 31));
        System.out.println("Size=" + persons.size());
        persons.printAllNodes();
        persons.deleteNode(new Person("Pepito", 32));
        persons.printAllNodes();
        persons.deleteFirst();
        persons.printAllNodes();
        persons.deleteLast();
        persons.printAllNodes();
        System.out.println("Size=" + persons.size());

        runStackExample();
        runQueueExample();

        runLinkedListExample();
        Person personA = new Person("Pepito", 32);
        Person personB = new Person("Pepito", 32);
        System.out.println(personA);
        System.out.println(personB);
        System.out.println(personA.equals(personB));
    }
}
