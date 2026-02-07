package Session_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SS14_K2 {
/*
cho nhập chuỗi
khai báo chỗi sẵn
nếu chuyển đổi được thêm vào chuỗi sẵn
không chuyển đổi được ++ biến đếm
* */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = -1;
        while (n <= 0) {
            try {
                System.out.print("Nhập vào số cần kiểm tra: ");
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0) {
                    System.out.println("Lỗi! số nhập vào phải lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi! Cần nhập vào số nguyên hợp lệ");
            }
        }

        int count = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập lần %d: ", i);
            try {
                int newNumber = Integer.parseInt(sc.nextLine());
                list.add(newNumber);
            } catch (NumberFormatException e) {
                count++;
            }
        }

        System.out.printf("Số phần tử không hợp lệ: %d\n", count);
        System.out.printf("Số phần tử hợp lệ: %d\n", list.size());
        System.out.print("Bao gồm: ");
        System.out.print(list);
    }
}
