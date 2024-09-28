public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int refillAmount = 1100;

        int bonus = 0;

        if (refillAmount > 1000) {

            bonus = refillAmount / 100;
        }


        int finalBalance = initialBalance + refillAmount + bonus;

        System.out.println("Итоговый счёт: " + finalBalance + " рублей");
        System.out.println("Количество бонусов: " + bonus + " рублей");
    }
}
