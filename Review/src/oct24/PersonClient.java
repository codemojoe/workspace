package oct24;

public class PersonClient {
    public static void main(String[] args) {
        Person joe = new Person("Joe", 29);
        String personInfo = joe.getPersonInfo();
        System.out.println(personInfo);

        Person person = new Person();
        person.setAge(45);
        person.setName("Chris");
        String personInfo1 = person.getPersonInfo();
        System.out.println(personInfo1);
    }
}
