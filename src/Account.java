public abstract class Account {

    protected int amount;

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract boolean addMoney(int amount);

    //public abstract int getAmount();

    public int getAmount() {
        return amount;
    }

}
