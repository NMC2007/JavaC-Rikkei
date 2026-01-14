package Session_4;

import java.util.Scanner;

public class SS4_k2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số hàng: ");
        int x = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int y = sc.nextInt();

        int[][] Arr2D = new int[x][y];
        for(int i = 0; i < Arr2D.length; i++){
            for(int j = 0; j < Arr2D[i].length; j++){
                System.out.printf("Nhập số cột %d vị trí %d: ", i, j);
                Arr2D[i][j] = sc.nextInt();
            }
        }

        int totalEven = 0;
        int totalOdd = 0;
        for(int i = 0; i < Arr2D.length; i++){
            for(int j = 0; j < Arr2D[i].length; j++){
                if (Arr2D[i][j] % 2 == 0){
                    totalEven += Arr2D[i][j];
                } else{
                    totalOdd += Arr2D[i][j];
                }
            }
        }
        System.out.printf("Tổng các số chẵn: %d\n", totalEven);
        System.out.printf("Tổng các số lẻ: %d\n", totalOdd);
    }
}
