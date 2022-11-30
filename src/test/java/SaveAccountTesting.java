import Account.*;
import org.junit.jupiter.api.*;


public class SaveAccountTesting {

    @BeforeAll
    public static void BeforeAll(){
        System.out.println("Начало тестирования:");
    }
    @AfterAll
    public static void AfterAll(){
        System.out.println("Окончание тестирования");
    }
    @BeforeEach
    public void BeforeEach(){
        System.out.println("---Перед началом каждого теста---");
    }
    @AfterEach
    public void AfterEach(){
        System.out.println("---После каждого теста---" + '\n');
    }

    //Тестируем с минимальным балансом для платежа
    SavingsAccount testedSavAcc = new SavingsAccount();

    //Необходимые предопределенные значения
    int testMinBalance = 100;
    long testAmount = 50;
    long testBalance = 500;
    long transferedAmount = 100;

    @Test
    public void testPayWithMinBalance () {

        //Задаем начальные значения
        testedSavAcc.setBalance(testBalance);
        testedSavAcc.setMinBalance(testMinBalance);

        //Вызываем целевой метод оплаты
        boolean result = testedSavAcc.pay(testAmount);

        //Проверка ожидаемого результата
        Assertions.assertTrue(result);
        //System.out.println(result);
    }


    @Test
    public void testWithAddAmount () {

        //Задаем баланс
        testedSavAcc.setBalance(testBalance);

        //Вызываем целевой метод зачисления суммы
        boolean result = testedSavAcc.add(testAmount);

        //Проверка ожидаемого результата
        Assertions.assertTrue(result);
        //System.out.println(result);
    }

    @Test
    public void testTransfer2CheckAcc() {

        //Предопределяем значения для экземпляра класса checkAcc
        //которому переводят сумму transferedAmount
        checkAcc.setBalance(500);
        checkAcc.setAccHolder("checkAcc");
        checkAcc.setMinBalance(150);

        testedSavAcc.setBalance(testBalance);
        testedSavAcc.setMinBalance(testMinBalance);
        testedSavAcc.setAccHolder("testedSavAcc");

        boolean result = testedSavAcc.transfer(checkAcc, transferedAmount);
        Assertions.assertTrue(result);
        //System.out.println(result);
    }

    //Создаем экземпляр класса CheckingAccount
    CheckingAccount checkAcc = new CheckingAccount();
}
