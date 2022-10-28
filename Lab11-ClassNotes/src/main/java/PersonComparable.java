import java.util.ArrayList;

public class PersonComparable implements Comparable <PersonComparable> {

    int age;

    public PersonComparable(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(PersonComparable person) {
        int returnInt = 0;
        if (this.age > person.getAge()) {
            returnInt = 1;
        }
        else if (this.age < person.getAge()) {
            returnInt = -1;
        }
        return returnInt;
    }
}

class Main {
    public static void main(String[] args) {

        ArrayList<PersonComparable> people = new ArrayList<>();

        PersonComparable p10 = new PersonComparable(10);
        PersonComparable p6 = new PersonComparable(6);

        people.add(p6);
        people.add(p10);
        System.out.println(people);

        int i = p6.compareTo(p10);
        System.out.println(i);
    }
}
