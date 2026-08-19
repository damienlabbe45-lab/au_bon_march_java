import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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




    

    
}
