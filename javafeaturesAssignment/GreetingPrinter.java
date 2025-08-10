package javafeaturesAssignment;

interface MessagePrinter {
    void printMessage(String message);
}

class GreetingsPrinter {
    public static void showMessage(MessagePrinter printer, String message) {
        printer.printMessage(message);
    }

    public static void main(String[] args) {
        showMessage(msg -> System.out.println(msg), "Hello, Welcome!");
    }
}
