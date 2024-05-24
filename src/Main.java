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

        depositBank = 0;
        int deposit = 29000;
        int percent = 12;

        for (int i = 1; i <= 12; i += 1) {
            float depositPercent = depositBank * ( (float) percent / 100);
            depositBank += (int) (deposit + depositPercent);
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\r\n", i, depositBank);
        }

        System.out.println("Задача 10");

        for (int i = 1; i <= 10; i++) {
            int multiTotal = 2 * i;
            System.out.println("2*" + i + "=" + multiTotal);
        }

    }
}