import Account.CheckingAccount;
import Account.CreditAccount;
import Account.SavingsAccount;
import clients.Client;

public class Main {
    public static void main(String[] args) {

        SavingsAccount savAcc = new SavingsAccount();
        CheckingAccount checkAcc = new CheckingAccount();
        CreditAccount credAcc = new CreditAccount();

        credAcc.setAccHolder("Pavel");
        credAcc.setBalance(-300);
        savAcc.setBalance(600);
        savAcc.setMinBalance(50);
        checkAcc.setBalance(500);

        Client client = new Client("Olya", 4);
        client.add(credAcc);

        savAcc.transfer(checkAcc, 300);

        System.out.println(credAcc.pay(900));
        System.out.println(client.pay(900));
        System.out.println(savAcc.getBalance());
        System.out.println(checkAcc.getBalance());

    }
}

