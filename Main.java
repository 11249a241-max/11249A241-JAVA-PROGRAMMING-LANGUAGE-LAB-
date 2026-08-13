// ==========================================
// CODE 1: Basic Multiple Inheritance
// ==========================================
interface Walkable {
    void walk();
}

interface Swimmable {
    void swim();
}

class Duck implements Walkable, Swimmable {
    @Override
    public void walk() {
        System.out.println("The duck is walking on land.");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming in the pond.");
    }
}

// ==========================================
// CODE 2: Resolving Default Method Conflicts
// ==========================================
interface InterfaceA {
    default void logMessage() {
        System.out.println("Message from InterfaceA");
    }
}

interface InterfaceB {
    default void logMessage() {
        System.out.println("Message from InterfaceB");
    }
}

class Logger implements InterfaceA, InterfaceB {
    @Override
    public void logMessage() {
        // Explicitly choosing InterfaceA's implementation
        InterfaceA.super.logMessage();
    }
}

// ==========================================
// SINGLE EXECUTION POINT
// ==========================================
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Running Code 1 ---");
        Duck myDuck = new Duck();
        myDuck.walk();
        myDuck.swim();

        System.out.println("\n--- Running Code 2 ---");
        Logger myLogger = new Logger();
        myLogger.logMessage();
    }
}
