public abstract class Animal {
    private String name;

    public Animal(String name) {
        setName(name);
    }

    public abstract void breathe();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " Breathe by cat");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " Breathe by dog");
    }
}

class Bird extends Animal {
    public Bird (String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " Breathe by bird");
    }
}

class AnimalHospital {
    Animal[] animals;
    int numberOfValidAnimals;

    public AnimalHospital(Animal[] animals, int numberOfValidAnimals) {
        this.animals = animals;
        this.numberOfValidAnimals = numberOfValidAnimals;
    }

    public void letAllAnimalsBreathe() {
        for (int i = 0; i < numberOfValidAnimals; i++) {
            animals[i].breathe();
        }
    }
}


class AnimalHospitalClient {
    private static Animal[] animals = new Animal[100];
    private static int currentIndex = 0;

    public static void main(String[] args) {
        Cat cat1 = new Cat("Meow");
        animals[currentIndex++] = cat1;
        Cat cat2 = new Cat("Swiper");
        animals[currentIndex++] = cat2;
        Dog dog1 = new Dog("Charley");
        animals[currentIndex++] = dog1;
        Bird paul = new Bird("Paul");
        animals[currentIndex++] = paul;
        AnimalHospital animalHospital = new AnimalHospital(animals, currentIndex);
        animalHospital.letAllAnimalsBreathe();
    }
}