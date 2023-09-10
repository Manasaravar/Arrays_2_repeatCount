import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static int[] copyArray(int[][] arr2, int rows,int cols) {
        int[] copyArr2 = new int[rows*cols];
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                copyArr2[k] = arr2[i][j];
                k++;
            }
        }
        return copyArr2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(0);
        System.out.println("Введите строк: ");
        int rows = scanner.nextInt();
        System.out.println("Введите кол-во элементов строки: ");
        int cols = scanner.nextInt();
        int[][] arr2 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = random.nextInt(0, 10);
            }
        }
        System.out.print(Arrays.deepToString(arr2));
        System.out.println();
        //System.out.println(Arrays.toString(copyArray(arr2, rows, cols)));
        int[] copyArray = copyArray(arr2,rows,cols);

        System.out.println();

        for (int i = 0; i < copyArray.length; i++) {
            boolean meet = false;
            for (int j = 0; j < i; j++) {
                if (copyArray[i] == copyArray[j]) {
                            meet = true;
                            break;
                }
            }
                        if (meet)
                            continue;
                        int count = 0;
                        for (int j  = i; j < copyArray.length; j++) {
                                if (copyArray[i] == copyArray[j])
                                    count++;
                        }
                        if (count > 0) {
                            String str = String.format(" Значение %d повторяется %d", copyArray[i], count);
                            System.out.println(str);
                        }
            }
        }
    }


