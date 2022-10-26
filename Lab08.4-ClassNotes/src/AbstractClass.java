public abstract class AbstractClass {
    private int myInstanceInt;

    public AbstractClass(int myInstanceInt) {
        this.myInstanceInt = myInstanceInt;
    }

    public static void main(String[] args) {

    }

    public abstract void myMethod();
}

class ChildClass extends AbstractClass {
    public ChildClass(int myInstanceInt) {
        super(myInstanceInt);
    }

    @Override
    public void myMethod() {}
}

