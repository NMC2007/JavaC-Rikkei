package Session_13.SS13_XS1.presentation;

import Session_13.SS13_XS1.bussiness.impl.StudentServicelmpl;
import Session_13.SS13_XS1.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    private static final StudentServicelmpl studentServicelmpl = new StudentServicelmpl();

    public static void showMenu(Scanner sc) {
        while (true) {
            System.out.println("""
                    -------------------STUDENT MENU------------------------
                    1. Nhập danh sách sinh viên
                    2. Hiển thị danh sách sinh viên
                    3. Tìm kiếm sinh viên theo tên
                    4. Phân loai sinh viên theo GPA
                    0. Thoát
                    """);
            System.out.print("Nhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    showAllStudents();
                    break;
                case 3:
                    findStudentWithName(sc);
                    break;
                case 4:

                    break;
                case 0:
                    System.out.println("Kết thúc chương trình");
                    sc.close();
                    return;
                default:
                    System.out.println("Không tồn tại lựa chọn");
            }
        }
    }


//    thêm sinh viên
    private static void addStudent(Scanner sc) {
        System.out.print("Nhập số lượng sinh viên cần thêm: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("\n👉 Thông tin sinh viên thứ " + i);

            // id tự tăng
            Student student = new Student();
            student.setId(findMaxId() + 1);

            // nhập thông tin
            student.inputStudent(sc);

            studentServicelmpl.add(student);
            System.out.println("✅ Thêm sinh viên thành công!");
        }

        System.out.println("\nĐã thêm thành công " + n + " sinh viên!\n");
    }

// Hiển thị thông tin
    private static void showAllStudents() {
        List<Student> list = studentServicelmpl.display();
        if(list.isEmpty()) {
            System.out.println("Danh sách rỗng");
        } else {
            System.out.println("\nDanh sách sinh viên");
            for (Student student : list) {
                student.displayData();
            }
        }
    }

//    tìm sinh viên theo tên
    private static void findStudentWithName(Scanner sc) {
        String name;
        do {
            System.out.print("Nhập tên sinh viên cần tìm: ");
            name = sc.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("❌ Không được để trống!");
            }
        } while (name.isEmpty());

        List<Student> find = studentServicelmpl.findByName(name);

        if(find.isEmpty()) {
            System.out.println("Không tìm thấy sinh viên này!");
        } else {
            for(Student student : find) {
                student.displayData();
            }
        }
    }

//    tìm kiếm id lớn nhất
    private static int findMaxId() {
        int maxId = 0;
        for (Student student : studentServicelmpl.display()) {
            if (student.getId() > maxId) {
                maxId = student.getId();
            }
        }
        return maxId;
    }
}
