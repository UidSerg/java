package oop.seminar1.zd2;
//Создайте систему управления банковскими счетами, где каждый счёт имеет свой номер, владельца и баланс.
//
//У него должны быть:
//- Аккаунт (включает в себя номер Аккаунта, имя владельца, баланс)
//- Унаследованные от аккаунта счета(аккаунты) (сберегательный, кредитный)
//- Main - класс, который и будет являться системой управления счетами.
//- реализовать методы:
//	- deposit(amount) - метод для добавления денежных средств на счет. Принимает один аргумент - сумму депозита.
//- withdraw(amount) - метод для снятия денежных средств со счета. Принимает один аргумент - сумму снятия.
//(Выше реализованы представлены сигнатуры общих методов)
//
//Для сберегательного счёта:
//- addInterest() - метод для добавления процентов к балансу. Рассчитывает процентную ставку от текущего баланса и добавляет полученную сумму к балансу.
//
//Для кредитного счёта:
//- calculate_interest() - метод для расчета процентов по кредиту. Должен рассчитывать процентную ставку от текущего баланса и вычитать полученную сумму из баланса. Если баланс отрицательный, то проценты начисляются на отрицательный баланс.
public class Main {
    public static void main(String[] args) {
        CreditAccount credit = new CreditAccount("Ivan Ivanov", 123451, 1000, 10.0);
        SafeAccount safe = new SafeAccount("Ivan Ivanov", 123451, 1000, 5.0);
        System.out.println("credit.getBalance() = " + credit.getBalance());
        credit.calcInterest();
        System.out.println("safe.getBalance() = " + safe.getBalance());
        safe.addInterest();
    }
}
