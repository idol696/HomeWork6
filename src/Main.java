public class Main {
    public static void main(String[] args) {


        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println("Задача 8");


        int depositBank = 0;


        for (int i = 1; i <= 12; i += 1) {

            depositBank += 29000;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\r\n", i, depositBank);
        }


        System.out.println("Задача 9");

        // Поскольку первоначального вклада на депозит нет, будем считать что условия банка позволяют
        // вносить его ежемесячно без штрафа.
        // Для расчета доходности от простых процентов
        // обычно используется следующая формула:
        // (Сумма вклада х Годовая ставка х (Количество дней вклада / Количество дней в году)) / 100

        depositBank = 0;
        int depositPercent = 12;
        int dayInYear = 365;
        int depositPeriod = 365;
        int depositPercentAmount;


        for (int i = 1; i <= 12; i += 1) {


            depositPercentAmount = (depositBank * depositPercent * (depositPeriod / dayInYear)) / 100;
            int depositTotal = depositBank + depositPercentAmount;

            depositBank += 29000;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\r\n", i, depositTotal);
        }

        System.out.println("Задача 10");

        for (int i = 1; i <= 10; i++) {

            int multiTotal = 2 * i;
            System.out.println("2*" + i + "=" + multiTotal);
        }

    }
}