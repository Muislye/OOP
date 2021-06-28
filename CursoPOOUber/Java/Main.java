package Java;
class Main {
    public static void main(String[] args) {

        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123","asd@hotmail.com","asd"), "Chevrolet", "Spark");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan car2 = new UberVan("QWE567", new Account("Andrea Herrera", "AND876", "asd@gmail.com","asdqwe"));
        car2.setPassenger(6);
        car2.printDataCar();
        

    }
}