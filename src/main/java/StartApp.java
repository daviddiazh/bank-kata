public class StartApp {

    public static void main(String[] args) {

        Account account = new Account();
        Transaction transaction = new Transaction();
        Filter filter = new Filter();


        account.deposit(transaction.amountOf(1000), account.date("10/01/2021"));
        account.deposit(transaction.amountOf(2000), account.date("13/01/2021"));
        account.withdraw(transaction.amountOf(500), account.date("14/01/2021"));
        account.sendMoney(transaction.amountOf(500), account.date("14/01/2021"));

        System.out.println("** Registro de Movimientos Bancarios*** ");
        System.out.println("----------------------------------------------");
        account.printStatement(System.out);
        System.out.println("----------------------------------------------");

        System.out.println("----------------------------------------------");
        System.out.println("*** Filtros por Credit, Debit y Date. ***");
        filter.printOnlyCredit(System.out);
        filter.printOnlyDebit(System.out);
        filter.printByDate(System.out, "15/01/2021");
    }

}