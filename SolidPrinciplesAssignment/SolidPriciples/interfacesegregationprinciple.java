package SolidProperties;
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }
}

class Robot implements Workable {
    public void work() {
        System.out.println("Robot working");
    }
}

public class interfacesegregationprinciple {
    public static void main(String[] args) {
        Human human = new Human();
        human.work();
        human.eat();

        Robot robot = new Robot();
        robot.work();
    }
}
