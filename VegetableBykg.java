import java.time.LocalDate;

public class VegetableBykg extends Product implements Consumable{
    double weight;

    public VegetableBykg(double price, String nameProduct, LocalDate pickingDate, int shelfLifeDays, double weight) {
        super(price, nameProduct, pickingDate, shelfLifeDays);
        this.weight = weight;
    }

    
        




    
    
}
