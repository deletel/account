
public class Main {
    public static void main(String[] args) {

        Account savingAccount = new SavingsAccount();
        Account creditAccount = new CreditAccount();
        Account checkingAccount = new CheckingAccount();

        savingAccount.addMoney(1000);
        savingAccount.addMoney(1000);
        savingAccount.addMoney(1000);
        savingAccount.transfer(creditAccount, 500);
        savingAccount.transfer(checkingAccount, 500);
        creditAccount.addMoney(1000);
        savingAccount.addMoney(1000);
        savingAccount.pay(5);
        checkingAccount.pay(6000);
        checkingAccount.addMoney(1000);

        System.out.println("На расчетном " + checkingAccount.getAmount());

    }
}