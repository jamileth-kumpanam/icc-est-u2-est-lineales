import controllers.Stack;
import models.Node;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        runStackExample();
        
    //     Node <Person> node1 = 
    //     new Node <Person>(new Person("Juan", 30));

    //     Node <Person> node2= 
    //     new Node <Person>(new Person("Maria", 35));

    //     Node <Person> node3 = 
    //     new Node <Person>(new Person("Pepito", 0));

    //     Node <Person> node4 = 
    //     new Node <Person>(new Person("Diego", 0));

    //     node1.setNext(node2); //J -> M
    //     node2.setNext(node3); //M -> P
    //     node3.setNext(node4); // P -> D

    //     System.out.println(node1);
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
}
