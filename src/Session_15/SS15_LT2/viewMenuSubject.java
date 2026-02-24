package Session_15.SS15_LT2;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class viewMenuSubject {
    private static final SubjectManager subjectManager = new SubjectManager();

    public static void showMenu(Scanner sc) {
        while (true) {
            System.out.println("""
                    -------------------MOVIE MENU------------------------
                    1. Hiển thị danh sách môn học
                    2. Thêm môn học
                    3. Xoá môn học
                    4. Tìm kiếm môn học theo tên
                    5. Lọc môn học theo tín chỉ
                    0. Thoát
                    """);
            System.out.print("Nhập lựa chọn: ");
            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());

                if (choice < 0 || choice > 5) {
                    System.out.println("Lựa chon không hợp lệ vui lòng nhập lại");
                    continue;
                }
            }  catch (NumberFormatException e) {
                System.out.println("Số nhập vào không hợp lệ vui lòng nhập lại");
                continue;
            }

            switch (choice) {
                case 1:
                    showSubject();
                    break;
                case 2:
                    addSubject(sc);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:
                    System.out.println("Kết thúc chương trình");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }



//    hiển thị
    private static void showSubject() {
        List<Subject> list = subjectManager.display();
        if (list.isEmpty()) {
            System.out.println("Danh sách chưa có môn học");
        } else {
            System.out.println("Danh sách các môn học");
            for (Subject subject : list) {
                subject.displayData();
            }
        }
        System.out.println("\n\n");
    }

//    thêm
    private static void addSubject(Scanner sc) {
        Subject subject = new Subject();

        subject.inputSubject(sc);

        subjectManager.add(subject);

        System.out.println("Thêm thành công sinh viên");
    }

//    xoá
    private static void deleteSubject(Scanner sc) {
        String code;
        do {
            System.out.print("Nhập code môn học cần xoá");
            code = sc.nextLine().trim();

            if (code.isEmpty()) {
                System.out.println("Không được để rống mục này");
            }

        } while (code.isEmpty());

        subjectManager.delete(code);
    }


}
