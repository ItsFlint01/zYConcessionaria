public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Saveiro", "Volkswagen",2020, 98000, 4);
        Motorcycle moto1 = new Motorcycle("Scooter", "Honda", 2021, 9000);

        car1.infos();
        moto1.infos();
    }
}