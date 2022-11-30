package clients;
import Account.Account;
import Account.MoneyTarget;

public class Client implements MoneyTarget {
    protected String nameClient; // имя клиента
    protected int maxAccounts; //максимальное количество счетов
    protected Account[] accounts;

    public Client(String nameClient, int maxAccounts) {
        this.nameClient = nameClient;
        this.maxAccounts = maxAccounts;
        this.accounts = new Account[maxAccounts];
    }

    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Мест для добавления нового счёта нет!");
    }

    public boolean pay(long amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].pay(amount)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(int money) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].add(money)) {
                return true;
            }
        }
        return false;
    }
}