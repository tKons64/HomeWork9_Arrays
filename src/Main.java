public class Main {
    public static void main(String[] args) {
        task1_1();
        task1_2();
        task1_3();
        task1_4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1_1() {
        System.out.println();
        System.out.println("Задание №1.1");

        int[] arr = generateRandomArray();
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }

        System.out.println("Сумма трат за месяц составила - " + totalSum + " рублей");
    }

    public static void task1_2() {
        System.out.println();
        System.out.println("Задание №1.2");

        int[] arr = generateRandomArray();
        int minValue = 200000;
        int maxValue = 100000;

        for (int i = 0; i < arr.length; i++) {
           if (arr[i] > maxValue){
               maxValue = arr[i];
           }
           if (arr[i] < minValue){
               minValue = arr[i];
           }
        }

        System.out.println("Минимальная сумма трат за день составила - " + minValue + " рублей");
        System.out.println("Максимальная сумма трат за день составила - " + maxValue + " рублей");
    }

    public static void task1_3() {
        System.out.println();
        System.out.println("Задание №1.3");

        int[] arr = generateRandomArray();
        int totalSum = 0;
        double averageValueInMonth = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }

        averageValueInMonth = (double)totalSum / arr.length;

        System.out.println("Средняя сумма трат за месяц составила - " + averageValueInMonth + " рублей");
    }

    public static void task1_4() {
        System.out.println();
        System.out.println("Задание №1.4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] correctFullName = new char[reverseFullName.length];

        for (int i = reverseFullName.length; i > 0; i--) {
            correctFullName[correctFullName.length-i] = reverseFullName[i-1];
        }

        for (int i = 0; i < correctFullName.length; i++) {
            System.out.print(correctFullName[i]);
        }

    }
}