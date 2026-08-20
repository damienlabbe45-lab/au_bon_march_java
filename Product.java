import java.time.LocalDate;

public abstract class Product {
    double price;
    String nameProduct ;
    LocalDate pickingDate;
    int shelfLifeDays;

    protected Product(double price, String nameProduct, LocalDate pickingDate, int shelfLifeDays) {
        this.price = price;
        this.nameProduct = nameProduct;
        this.pickingDate = pickingDate;
        this.shelfLifeDays = shelfLifeDays;
    }

    public double getPrice() {
        return price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public LocalDate getPickingDate() {
        return pickingDate;
    }

    public int getShelfLifeDays() {
        return shelfLifeDays;
    }

    @Override
    public String toString() {
        return nameProduct + " à " + price ;
    }

    public String conso(){
        return "récolté il y a " + pickingDate.toString() + ". C'est comestible pendant " + shelfLifeDays;
    }

    public abstract void calculateExpirationDate();

}
