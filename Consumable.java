import java.time.LocalDate;

public interface Consumable {

    public boolean isRipe();

    public boolean isExpired(LocalDate dateVerification);

    public long daysRemaingBeforeExpiration(LocalDate dateVerification);
}
