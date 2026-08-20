import java.time.LocalDate;

public interface Consumable {

    public boolean isRipe(LocalDate dateVerification);

    public boolean isExpired(LocalDate dateVerification);

    public long daysRemaingBeforeExpiration(LocalDate dateVerification);
}
