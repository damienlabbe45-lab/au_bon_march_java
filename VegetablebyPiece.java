import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class VegetableByPiece extends Product implements Consumable{
    int unit;

    public  VegetableByPiece(double price, String nameProduct, LocalDate pickingDate, int shelfLifeDays, int unit) {
        super(price, nameProduct, pickingDate, shelfLifeDays);
        this.unit = unit;
    }
    
    public void weight_minus(int unit){
        if (this.unit >= unit) this.unit = this.unit - unit;
        else System.out.println("il me reste juste que " + unit + ".");

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

    public long daysRemaingBeforeExpiration(LocalDate dateVerification){
        return ChronoUnit.DAYS.between(pickingDate.plusDays(shelfLifeDays), dateVerification);
    }

    public double weightpay(int unit){
        if ( this.unit>= unit){
            weight_minus(unit);
            return (price * unit);
        }
        return -0.90;
    
    }

    @Override
    public String toString(){
        return unit + super.toString() + " pièces.";
    
    }
}
