import org.w3c.dom.ls.LSOutput;

class CarClient {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMake("Chevy");
        car1.setModel("Aveo");
        car1.setMpg(33);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setMake("Mazda");
        car2.setModel("3");
        car2.setMpg(32);
        System.out.println(car2);

        MyOwnPrintln testPrintln = new MyOwnPrintln();
        String testString = car1.getModel();
        int testInt = car1.getMpg();
        testPrintln.myOwnPrintln(testString);
        testPrintln.myOwnPrintln(testInt);

        Car whatever = new Car("whatever", new Engine(), new Transmission()){

        };

    }


}
