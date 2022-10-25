public class MyPizzaHouse {
    public void prepare() {
        System.out.println("MyPizzaHouse is preparing your food!");
    }

    private void addTopping() {
        System.out.println("What toppings would you like to add to your pizza?");
    }

    private void bake() {
        System.out.println("MyPizzaHouse is baking your pizza!");
    }

    public void makePizza() {
        prepare();
        addTopping();
        bake();
    }
}
