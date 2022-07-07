public class CreditAccount extends Account {
    private int amount;
    private Account account;
    boolean succes;

    @Override
    public void pay(int amount) {
        this.amount -= amount;
        System.out.println("Оплата на " + amount + " со счета " + toString());
        System.out.println("Теперь на " + toString() + " " + this.amount);
        System.out.println();
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("C " + toString() + " переведено " + amount + " на " + account.toString());
        succes = account.addMoney(amount);
        this.amount -= amount;
    }

    @Override
    public boolean addMoney(int amount) {
        if (this.amount + amount > 0) {
            System.out.println("На кредитном не может быть больше нуля");
            System.out.println();
            return false;
        }
        this.amount += amount;
        System.out.println(toString() + " пополнился на " + amount);
        System.out.println("Теперь на " + toString() + " " + this.amount);

        System.out.println();
        return true;
    }

    public String toString() {
        return "Кредитный";
    }

//    public int getAmount() {
//        return amount;
//    }
}