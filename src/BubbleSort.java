import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] list = {8,6,34,22,23};

        System.out.println("Your input lista; ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");
        }
        System.out.println();
        System.out.println("Sort arrat");
        bubbleSort(list);
    }

    private static void bubbleSort(int[] list) {
        boolean needNextPass;
        for (int k = 1; k < list.length ; k++) {
            needNextPass = false;
            System.out.println("Sort pass " + k);
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i+1]){
                    System.out.println("swap " + list[i] + " with " + list[i+1]);
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    System.out.println(Arrays.toString(list));
                    needNextPass = true;
                }
            }
            System.out.println(Arrays.toString(list));
            if (!needNextPass) break;
        }
    }
}
