import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Student> studentHashMap = new HashMap<>();

        studentHashMap.put("student2", new Student("Joe"));
        studentHashMap.put("student1", new Student("Chris"));
        studentHashMap.put("student3", new Student("Cheese"));

        Student student3 = studentHashMap.get("student3");
        System.out.println(student3);

        studentHashMap.put("student3", new Student("Abby"));
        student3 = studentHashMap.get("student3");
        System.out.println(student3);

        boolean student2 = studentHashMap.containsKey("student2");
        System.out.println(student2);

        System.out.println(studentHashMap.size());

        for (var studentEntry :
                studentHashMap.entrySet()) {
            String key = studentEntry.getKey();
            Student value = studentEntry.getValue();
            System.out.println(key + " " + value);
        }

        List<Integer> integers = List.of(1,2,3,4);
        integers.add(6);

        Set<Integer> integerSet = Set.copyOf(integers);
        integerSet.add(10);
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
