# Тестирование Аккаунтов из ДЗ по теме «Абстракции и интерфейсы»


В этом задании предлагалось создать три объекта счетов **(CheckingAccount, CreditAccount, SavingsAccount)**, различающиеся реализацией методов оплаты и добавления поступающих сумм. Также есть метод *transfer*, зачисляющий определенную сумму на один из счетов путем списания с текущего. Все тесты реализованы в классе **SaveAccountTesting**. Репозиторий содержит три теста аккаунта *SaveAccount*:

## Тест№1 - testPayWithMinBalance()
Оплата с минимальным балансом на счету. Списание средств со счета не может быть списана, если при оплате остаток будет ниже, чем минимальный баланс.

## Тест№2 - testWithAddAmount()
Проверка зачисления на счет денежных средств.

## Тест№3 - testTransfer2CheckAcc()
Проверка перевода средств с объекта класса *SavingsAccount* на наш тестируемый объект.