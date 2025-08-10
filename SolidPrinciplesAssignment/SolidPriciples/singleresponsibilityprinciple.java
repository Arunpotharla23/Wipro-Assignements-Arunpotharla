package SolidProperties;


class Chef {
    void cookFood() {
        System.out.println("Chef is cooking food.");
    }
}

class Deliveryman {
    void deliverFood() {
        System.out.println("Deliveryman is delivering food.");
    }
}

public class singleresponsibilityprinciple {
    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.cookFood();

        Deliveryman deliveryman = new Deliveryman();
        deliveryman.deliverFood();
    }
}
