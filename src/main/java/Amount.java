import java.text.DecimalFormat;

public class Amount {

    private double amount;
    private double balance = 0;

    public Amount(double amount) {
        this.amount = amount;
    }

    private Amount amountOf(double amount){
        return new Amount(amount);
    }
}
