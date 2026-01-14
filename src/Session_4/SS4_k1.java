package Session_4;

import java.util.Scanner;

public class SS4_k1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ dài mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            System.out.printf("Nhập phần tử thứ [%d] của mảng: ", i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Mảng sau khi sắp xếp theo thứ tự giảm dần: ");
        for(int i = arr.length - 1; i > 0 ; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
