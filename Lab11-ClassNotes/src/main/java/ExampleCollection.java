import java.lang.reflect.Array;
import java.util.*;

public class ExampleCollection {
    static private Collection<EmployeeCollection> myCollection = new ArrayList<>();

    //pre-Java8
    static private Collection myCollectionNotUsingGenerics = new ArrayList();

    static private List<String> names = new ArrayList<>();

    public static void main(String[] args) {
        myCollection.add(new EmployeeCollection("Joe"));

        //ArrayList<String> names = new ArrayList<>();

        names.add("Amy");
        names.add("Joe");

        //with index
        //names.add(0, "Joe");
        System.out.println("Names: " + names);

        names.set(1, "Chris");
        System.out.println("Names: " + names);

        String name = names.get(0);
        System.out.println(name);

        Set<String> cities = new HashSet<>();

        cities.add("New York");
        cities.add("Boston");
        //won't be allowed, duplicate
        //cities.add("New York");

        System.out.println(cities);

        List<String> states1 = new ArrayList<>();
        states1.add("WA");
        states1.add("NY");
        //allowed duplicate
        states1.add("WA");

        System.out.println(states1);

        //converted set of cities to list of cities
        List<String> setCitiesToList= new ArrayList<String>(cities);
        setCitiesToList.add("New York");
        System.out.println(setCitiesToList);

        //will remove duplicate from list passed in constructor
        Set<String> states2 = new HashSet<>(states1);
        System.out.println(states2);

        if (new Integer(10) > new Integer(4)) {
            System.out.println("10 is great than 4");
        }

        //will return - if less value, + if move value, 0 if equal
        int stringCompare = new String("abc").compareTo(new String("xyz"));
        System.out.println(stringCompare);
    }
}

class EmployeeCollection {
    String name;

    public EmployeeCollection(String name) {
        this.name = name;
    }
}
