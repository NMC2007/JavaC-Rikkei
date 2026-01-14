package Session_4;

import java.util.Scanner;

public class SS4_g2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ dài mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            System.out.printf("Nhập phần tử thứ [%d] của mảng: ", i);
            arr[i] = sc.nextInt();
        }

        int l = 0, r = arr.length - 1;
        System.out.println("Mảng sau khi sắp xếp: ");
        while(r > l){
            while (r > l && arr[l] % 2 == 0) l++;
            while (r > l && arr[r] % 2 != 0) r--;

            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
