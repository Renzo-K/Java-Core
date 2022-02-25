import java.util.Random;

public class ls2 {
    public static void main(String[] args) {
        oneZero();
        System.out.println();
        emptyArray();
        System.out.println();
        numbersLessThenSix();
        System.out.println();
        System.out.println("'''''''''''''''''''''''''''''''''''''''''''");
        twoDemesionalArray();
        System.out.println();
        minMax();

    }

    public static void oneZero() {
        int array[] = new int[]{1, 0, 0, 1, 1, 0, 1, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) array[i] = 0;
             else array[i] = 1;
            System.out.print(array[i] + " ");
        }

    }

    public static void emptyArray() {
        int arr[] = new int[8];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count;
            count += 3;
            System.out.print(arr[i] + " ");
        }

    }

    public static void numbersLessThenSix() {
        int arr[] = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }

    public static void twoDemesionalArray() {
        int arr[][] = new int[4][4];
        int x = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i == x - j) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
    public static void minMax() {
        Random random = new Random();
        int max = 0;
        int min = 0;
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(70);
            System.out.print("[" + i + "]-" + array[i] + " ");
        }
        System.out.println();
        max = array[0];
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
            else if (min > array[i]) min = array[i];
        }
        System.out.printf("\nМаксимальный элемент массива: %d\nМинимальный элемент массива: %d\n",max,min);
    }
}