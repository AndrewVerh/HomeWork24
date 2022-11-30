package Account;

public abstract class Account implements MoneyTarget {
    protected String accHolder;
    protected long balance; //счет или баланс

    public abstract boolean pay(long amount);

    public abstract boolean add(long amount);

    public boolean transfer(Account accountTo, long amount) {
        if (pay(amount)) {
            if (accountTo.add(amount)) {
                return true;
            } else {
                this.balance += amount;
                return false;
            }
        } else {
            return false;
        }
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }
    @Override
    public boolean accept (int money){
        return add(money);
    }
}
