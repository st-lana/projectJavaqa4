public class Main {

    public static void main(String[] args) {

        int currentCount = 1000;
        int refillSumm = 2580;
        int bonusLim = 1000;

        if (refillSumm > bonusLim) {
            int bonus = refillSumm /100;
            int finalCount = currentCount + refillSumm + bonus;

            System.out.println("Ура! Вам начислен бонус: " + bonus + " руб." +  " Текущий счет " + finalCount + " руб.");

        } else {
            int finalCount = currentCount + refillSumm;
            System.out.println("Пополнение. Сумма на счету - " + finalCount + " руб.");
        }




        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
