public class StatementLine {

    Statement statement = new Statement();

    private String date;
    private double credit;
    private double debit;
    private double balance;

    public StatementLine() {
    }

    public StatementLine(String date, double credit, double debit, double balance) {
        this.date = date;
        this.credit = credit;
        this.debit = debit;
        this.balance = balance;
    }

    public void saveCreditLine(String date, double credit, double balance) {
        String line = ("|" + date + "| " + String.valueOf(credit) + " |       " + "  |  " + String.valueOf(balance) + "   |");
        statement.addStatementLine(line);
    }

    public void saveDebitLine(String date, double debit, double balance) {
        String line = ("|" + date + "| " + "       |  " + String.valueOf(debit) + "  |  " + String.valueOf(balance) + "   |");
        statement.addStatementLine(line);
    }

}
