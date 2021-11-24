import java.text.DecimalFormat;

public class StatementLine {

    Statement statement = new Statement();

    private String date;
    private double credit;
    private double debit;
    private double balance;

    public StatementLine() {
    }

    public String decimalFormatter(double amount){
        DecimalFormat df = new DecimalFormat("########.00");
        return df.format(amount);
    }


    public StatementLine(String date, double credit, double debit, double balance) {
        this.date = date;
        this.credit = credit;
        this.debit = debit;
        this.balance = balance;
    }

    public void saveCreditLine(String date, double credit, double balance) {
        String line = ("|" + date + "| " + decimalFormatter(credit) + " |        " + "  |  " + decimalFormatter(balance) + "   |");
        statement.addStatementLine(line);
    }
    public void saveDebitLine(String date, double debit, double balance) {
        String line = ("|" + date + "| " + "        |  " + decimalFormatter(debit) + "  |  " + decimalFormatter(balance) + "   |");
        statement.addStatementLine(line);
    }

}