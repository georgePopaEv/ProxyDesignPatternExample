public class Client {
    public static void main(String[] args) {
        System.out.println("*** Proxy Pattern Demo *** ");

        Image image = new ProxyImage("someFilename.jpg");
        image.display();
        System.out.println("");

        image.display();

    }
}