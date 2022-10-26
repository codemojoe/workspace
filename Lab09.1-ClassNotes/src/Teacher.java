public interface Teacher {
    void teacher(String subject);
    double gradeHW();

    void teach(String courseTitle);
}

class Trainer implements Teacher {

    @Override
    public void teacher(String subject) {

    }

    @Override
    public double gradeHW() {
        return 0;
    }

    @Override
    public void teach(String courseTitle) {

    }
}

class SubTrainer extends Trainer {

}

class OnlineTutorial implements Teacher {

    @Override
    public void teacher(String subject) {

    }

    @Override
    public double gradeHW() {
        return 0;
    }

    @Override
    public void teach(String courseTitle) {

    }
}

class Main {
    public static void main(String[] args) {
        //Reference variable type could be Interface
        Teacher liveOne = new Trainer();
        SubTrainer subTrainer = new SubTrainer();
        Teacher remoteOne = new OnlineTutorial();

        //Method argument type could be Interface type
        Trainer liveOne2 = new Trainer();
        beginClass("Java", liveOne2);

        //is SubTrainer object IS-a Teacher?
        beginClass("Python", subTrainer);

        //Interface type is used as a return type
        Teacher teacher = getTeacher();

        endClass("Java", liveOne2);

        //Interface type is used as a return type
        //ITeacher ITeacher = getTeacher();

    }

    //Is this method going to provide polymorphic behavior? Yes, Teacher can be Trainer or OnlineTutorial
    public static void beginClass(String courseTitle,
                                  Teacher teacher) {

        teacher.teach("Java");
        teacher.gradeHW();
    }

    //Is this method going to provide polymorphic behavior?
    public static void endClass(String courseTitle, Trainer trainer) {
        trainer.teach("Java");
        trainer.gradeHW();
    }

    public static Teacher getTeacher() {
        return new OnlineTutorial();
    }
}