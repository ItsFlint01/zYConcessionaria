import java.util.List;

public class Car extends Vehicle{

    private int doors;
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Car(String model, String brand, int year, double price, int doors) {
        this.setModel(model);
        this.setBrand(brand);
        this.setYear(year);
        this.setPrice(price);
        this.setDoors(doors);
    }

    public void infos() {
        System.out.println("INFORMAÇÕES DO CARRO:");
        System.out.println("- Modelo: " + this.getModel());
        System.out.println("- Marca: " + this.getBrand());
        System.out.println("- Ano: " + this.getYear());
        System.out.println("- Preço: R$" + this.getPrice());
        System.out.println("- Portas: " + this.getDoors());
        System.out.println();
    }

}
