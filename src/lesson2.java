import java.util.Arrays;
//Задать целочисленный массив, состоящий из элементов
//        0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;
public class lesson2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }

    }


//        2. Задать пустой целочисленный массив размером 8. С помощью
//        цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void Umnog() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }

    }


//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//        пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void Main1() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + ", ");
        }
    }


//        4. Создать квадратный двумерный целочисленный массив
//        (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
//        заполнить его диагональные элементы единицами;
//


    public static void fillDiagonal() {
        int a = 4;
        int[][] arr = new int[a][a];
        printSqrArr(arr);
        int i = 0;
        for (i = 0; i < a; i++) {
            arr[i][i] = 1;
        }
    }



    public static void printSqrArr ( int[][] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                System.out.println(massiv[i][j] + " ");
            }
            System.out.println();
        }
    }


}