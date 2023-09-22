public class Motorcycle extends Vehicle{

    public Motorcycle(String model, String brand, int year, double price) {
        this.setModel(model);
        this.setBrand(brand);
        this.setYear(year);
        this.setPrice(price);
    }

    public void infos() {
        System.out.println("INFORMAÇÕES DA MOTO:");
        System.out.println("- Modelo: " + this.getModel());
        System.out.println("- Marca: " + this.getBrand());
        System.out.println("- Ano: " + this.getYear());
        System.out.println("- Preço: R$" + this.getPrice());
        System.out.println();
    }

}
