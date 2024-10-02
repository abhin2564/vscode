abstract class Animal {
    abstract void Walk();
}

class Horse extends Animal {
    @Override
    public void Walk() {
        System.out.println("4 legs");
    }
}

class Hen extends Animal {
    @Override
    public void Walk() {
        System.out.println("2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.Walk();

        Hen hen1 = new Hen();
        hen1.Walk();
    }
}
