package Session_4;

import java.util.Scanner;

public class SS4_g1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ dài mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            System.out.printf("Nhập phần tử thứ [%d] của mảng: ", i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Mảng sau khi sắp xếp theo thứ tự tăng dần dần: ");
        for(int i = arr.length - 1; i > 0 ; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nNhập số cần tìm: ");
        int x = sc.nextInt();

        int LinearSearch = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                LinearSearch = i;
                break;
            }
        }
        System.out.printf("Tìm kếm tuyến tính vị trí số %d: %d\n", x, LinearSearch);

        int BinarySearch = 0;
        int l = 0, r = arr.length - 1;
        while(r > l){
            int mid = (l + r) / 2;
            if(arr[mid] == x){
                BinarySearch = mid;
                break;
            } else if(arr[mid] < x){
                l = mid + 1;
            }  else if(arr[mid] > x) {
                r = mid - 1;
            }
        }

        System.out.printf("Tìm kếm nhị phân vị trí số %d: %d\n", x, BinarySearch);
    }
}
