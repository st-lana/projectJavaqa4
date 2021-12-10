public class Main {
    public static void main(String[] args) {
        int currentCount = 100;
        int refillSumm = 1200;
        int bonusLim = 1000;
        int bonus = refillSumm / 100;

        if (refillSumm < bonusLim) {

            bonus = 0;

        }
        int finalCount = currentCount + refillSumm + bonus;

        System.out.println("Пополнение счета. Бонус "  + bonus + " руб. " + "Текущий баланс " + finalCount + " руб.");

    }
}
