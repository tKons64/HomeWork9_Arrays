import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1_1();
        //task1_2();
        //task1_3();
        //task1_4();

        //task1_5();
        //task1_6();
        //task1_7();
        //task1_8();
        task1_9();

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
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
            if (arr[i] < minValue) {
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

        averageValueInMonth = (double) totalSum / arr.length;

        System.out.println("Средняя сумма трат за месяц составила - " + averageValueInMonth + " рублей");
    }

    public static void task1_4() {
        System.out.println();
        System.out.println("Задание №1.4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] correctFullName = new char[reverseFullName.length];

        for (int i = reverseFullName.length; i > 0; i--) {
            correctFullName[correctFullName.length - i] = reverseFullName[i - 1];
        }

        for (int i = 0; i < correctFullName.length; i++) {
            System.out.print(correctFullName[i]);
        }

    }

    public static void task1_5() {
        System.out.println();
        System.out.println("Задание №1.5. Повышенная сложность");

        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task1_6() {
        System.out.println();
        System.out.println("Задание №1.6. Повышенная сложность");

        int[] arr = {5, 4, 3, 2, 1};
        int[] corectArr = new int[5];

        for (int i : arr) {
            corectArr[i - 1] = arr[arr.length - i];
        } // не понял почему отсчет идет в обратном порядке? но в целом работает

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(corectArr));
    }

    public static void task1_7() {
        System.out.println();
        System.out.println("Задание №1.7. Повышенная сложность");

        int storage = 0;
        int middleArray = 0;
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));

        middleArray = (int) (arr.length / 2) + 1;

        for (int i : arr) {
            storage = arr[i - 1];
            arr[i - 1] = arr[arr.length - i];
            arr[arr.length - i] = storage;
            if (i == middleArray) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task1_8() {
        System.out.println();
        System.out.println("Задание №1.8. Повышенная сложность");

        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        //int[] arr = {5, 4, 3, 2, 1};
        int sum = -2;
        int number1 = 0;
        int number2 = 0;
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                total = arr[i] + arr[j];
                if (total == sum) {
                    number1 = arr[i];
                    number2 = arr[j];
                }
            }
        }
        System.out.println(number1);
        System.out.println(number2);
    }

    public static void task1_9() {
        System.out.println();
        System.out.println("Задание №1.9. Повышенная сложность");

        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum = -2;
        int number1 = 0;
        int number2 = 0;
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                total = arr[i] + arr[j];
                if (total == sum) {
                    number1 = arr[i];
                    number2 = arr[j];
                    System.out.print(number1 + " + ");
                    System.out.println(number2 + " = " + sum);
                }
            }
        }

    }


}