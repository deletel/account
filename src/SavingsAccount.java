public class SavingsAccount extends Account {
    private int amount;
    private Account account;
    boolean succes;

    @Override
    public void pay(int amount) {
        this.amount -= amount;
        System.out.println("Нельзя платить со сберегательного счета");
    }

    @Override
    public void transfer(Account account, int amount) {
        if (amount > this.amount) {
            System.out.println("На сберегательном не может быть минуса");
            System.out.println();
        } else {
            succes = account.addMoney(amount);
            if (succes) {
                System.out.println("C " + toString() + " переведено " + amount + " на " + account.toString());
                this.amount -= amount;
            }

        }
    }

    @Override
    public boolean addMoney(int amount) {
        this.amount += amount;
        System.out.println(toString() + " пополнился на " + amount);
        System.out.println("Теперь на " + toString() + " " + this.amount);
        System.out.println();
        return true;
    }

    public String toString() {
        return "Сберегательный";
    }

//    public int getAmount() {
//        return amount;
//    }

}