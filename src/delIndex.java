import java.util.Arrays;
import java.util.Scanner;

public class delIndex {
    public static int[] Delindex(int[] array, int n) {
        int[] arr = new int[array.length];
        for (int i = 0, j = 0; i < array.length; i++) {

            if (array[i] != n) {
                arr[j] = array[i];
                j++;
                }
            } return arr;
        }


        public static void main(String[] args){
            int[] array = {1, 1, 1, 5, 5, 4, 4, 9, 9, 9, 7, 7, 8};
            int[] arr;
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap so can kiem tra trong mang: ");
            n = sc.nextInt();
            arr = Delindex(array,n);
            System.out.println(Arrays.toString(arr));
                }
            }