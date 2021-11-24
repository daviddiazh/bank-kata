public class Transaction {

    private double balance = 0;
    private StatementLine statementLine = new StatementLine();

    public double amountOf(double amount){
        return amount;
    }

    public double credit(double amount, String date) {
        this.balance = this.balance + amount;
        statementLine.saveCreditLine(date,amount, this.balance);
        return this.balance;
    }

    public double debit(double amount, String date) {
        this.balance = this.balance - amount;
        statementLine.saveDebitLine(date,amount, this.balance);
        return this.balance;
    }

}