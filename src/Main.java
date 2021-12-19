public class Main {
    public static void main(String[] args) {
        int currentCount = 0;
        int refillSumm = 100;
        int bonusLim = 1000;
        int bonus;

        if (refillSumm > bonusLim) {
            bonus = refillSumm / 100;
        } else {
            bonus = 0;
        }
        int finalCount = currentCount + refillSumm + bonus;

        System.out.println("Пополнение счета. Бонус "  + bonus + " руб. " + "Текущий баланс " + finalCount + " руб.");

    }
}
