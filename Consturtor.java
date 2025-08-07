public class Consturtor {

    Consturtor() {
        System.out.println("Constructor called");
    }
    public void displayMessage() {
        System.out.println("Display message method called");
    }

    public static void main(String[] args) {
        Consturtor cs = new Consturtor();
        cs.displayMessage();
        
    }
}