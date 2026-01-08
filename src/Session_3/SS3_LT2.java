package Session_3;

import java.util.Scanner;

public class SS3_LT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        // biến đếm sinh viên
        int count = 0;
        // điểm cao, thấp nhất, trung bình, tổng
        float point = 0f;
        float maxPoint = 0f;
        float minPoint = 0f;
        float totalPoint = 0f;


        do {
            System.out.println("******************** MENU ********************");
            System.out.println("1. Nhập điểm: ");
            System.out.println("2. Hiển thị thống kê: ");
            System.out.println("3. Thoát: ");

            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();

            // kiểm tra nhập lựa chọn
            while (choice < 1 || choice > 3) {
                System.out.print("Lựa chọn sai vui lòng nhập lại: ");
                choice = sc.nextInt();
            }


            if (choice == 1) {
                System.out.println("------------- Nhập điểm học viên (nhập -1 để dừng) -------------");
                do {
                    System.out.print("Nhập điểm: ");
                    point = sc.nextFloat();
                    while (point < -1 || point > 10) {
                        System.out.print("Điểm không hợp lệ, vui lòng nhập lại: ");
                        point = sc.nextFloat();
                    }

                    // nếu điểm khác -1
                    if (point != -1) {
                        // tăng đếm
                        count++;
                        // cộng dồn tổng điểm
                        totalPoint += point;

                        // kiểm tra nếu điểm cao nhất bé hơn điểm vừa nhập thì gán điểm cao nhất = điểm vừa nhập
                        if (maxPoint < point) {
                            maxPoint = point;
                        }

                        // kiểm tra ở lần đầu nếu điểm thấp nhất vẫn = 0 thì gán điểm thấp nhất = điểm vừa nhập
                        if (minPoint == 0) {
                            minPoint = point;
                        } else {
                            // kể tử lần sau điểm vừa nhập bé hơn điểm thấp nhất thì gán điểm thấp nhất = điểm vừa nhập
                            if (point < minPoint) {
                                minPoint = point;
                            }
                        }

                        if (point >= 0 && point < 5) {
                            System.out.println("Học lực: Yếu");
                        } else if (point >= 5 && point < 7) {
                            System.out.println("Học lực: Trung bình");
                        } else if (point >= 7 && point < 8) {
                            System.out.println("Học lực: Khá");
                        } else if (point >= 8 && point < 9) {
                            System.out.println("Học lực: Giỏi");
                        } else if (point >= 9 && point <= 10) {
                            System.out.println("Học lực: Xuất sắc");
                        }


                    } else {
                        System.out.println("Kết thúc nhập \n\n");
                    }
                } while (point != -1);

            } else if (choice == 2) {
                if (count == 0) {
                    System.out.println("Chưa có dữ liệu");
                } else {
                    System.out.println("------------- Kết quả -------------");

                    float mediumPoint = totalPoint / count;

                    System.out.printf("Số học viên đã nhập: %d \n", count);
                    System.out.printf("Điểm trung bình: %f \n", mediumPoint);
                    System.out.printf("Điểm cao nhất: %f \n", maxPoint);
                    System.out.printf("Điểm thấp nhất: %f \n", minPoint);
                }
            } else if (choice == 3) {
                System.out.println("\n\n------------- Kết thúc chương trình -------------");
            }
        } while (choice != 3);
    }
}
