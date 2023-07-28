public class Phone {

    String make;
    String model;
    String color;
    int ram;

    public static void main(String[] args) {
        Phone mobile1 = new Phone();
        mobile1.make = "Apple";
        mobile1.model = "iPhone XS";
        mobile1.color = "Space Grey";
        mobile1.ram = 8;

        mobile1.call();

        Phone mobile2 = new Phone();
        mobile2.make = "Samsung";
        mobile2.model = "Galaxy S5";
        mobile2.color = "Pitch Black";
        mobile2.ram = 8;

        mobile2.browseInternet();
    }

    public void call() {
        System.out.println("Dialing... Treeeeem Treeem...... from " + make + " " + model);
    }

    public void browseInternet() {
        System.out.println("Browsing Internet..... from " + make + " " + model);
    }
}