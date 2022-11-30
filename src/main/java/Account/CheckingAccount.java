package Account;

public class CheckingAccount extends Account {
    protected long minBalance = 0;

    //public CheckingAccount(String accHolder, long balance) {
    //    super(accHolder, balance);
    //}

    public void setMinBalance(int minBalance) {
        this.minBalance = minBalance;
    }

    public long getMinBalance() {
        return minBalance;
    }

    @Override
    public boolean pay(long amount) {
        if ((balance - amount) < minBalance) {
            System.out.println("Баланс после оплаты не может быть меньше, чем минимальная сумма =" + " " + minBalance);
            return false;
        } else {
            balance -= amount;
            System.out.println("оплата прошла успешно");
            return true;
        }
    }

    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }
}

