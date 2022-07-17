public class Mobile {
    public static void main(String[] args) {

            int balance = 100; // баланс на телефоне
            int add = 1100; // пополнение баланса на телефоне
            int bonus = (add) / (100); // бонус
            int total = (balance + add + bonus); // сумма баланса и пополнения

            if (add >= 1000) {
                System.out.println((add) / (100) + " рублей вам дарит оператор");
                System.out.println((total) + " рублей итоговый баланс  ");
            } else {
                System.out.println(" нет бонусных рублей  ");
                System.out.println((add + balance) + " рублей ваш баланс  ");
            }
        }
    }

