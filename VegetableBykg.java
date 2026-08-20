import java.time.LocalDate;

public class VegetableBykg extends Product implements Consumable{
    double weight;

    public VegetableBykg(double price, String nameProduct, LocalDate pickingDate, int shelfLifeDays, double weight) {
        super(price, nameProduct, pickingDate, shelfLifeDays);
        this.weight = weight;
    }

    public void weight_minus(double weightminus){
        if (weight >= weightminus) weight = weight - weightminus;
        else System.out.println("il me reste juste que " + weight + ".");

    }

    public void calculateExpirationDate(){
        System.out.println("le produit " + nameProduct +" est à consommer avant le " + pickingDate.plusDays(shelfLifeDays).toString());
    }

    public boolean isExpired(LocalDate dateVerification){
        return pickingDate.plusDays(shelfLifeDays).isAfter(dateVerification);
    }
    
    public boolean isRipe(LocalDate dateVerification){
        return pickingDate.plusDays(4).isEqual(dateVerification);
    }
    
}
