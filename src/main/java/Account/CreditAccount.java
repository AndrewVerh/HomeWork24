package Account;

public class CreditAccount extends Account {

    @Override
    public boolean pay(long amount) {
        return false;
    }

    @Override
    public boolean add(long amount) {
        if ((balance + amount) > 0) {
            return false;
        } else {
            balance += amount;
            return true;
        }
    }

}
