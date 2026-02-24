package Session_15.SS15_LT2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Subject implements IBaseSubject {
    private String code;
    private String name;
    private int credits;
    private LocalDate startDate;


//    Hàm khởi tạo
    public Subject() {
    }

    public Subject(String code, String name, int credits, LocalDate startDate) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.startDate = startDate;
    }

// getter and setter
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }


//    Ghi đè các phương thức trừu tượng cần có
    @Override
    public void inputSubject(Scanner sc) {
    // ===== nhập code =====
        while (true) {
            System.out.print("Nhập mã môn học: ");
            String code = sc.nextLine().trim();

            if (code.isEmpty()) {
                System.out.println("❌ Mã môn học không được để trống!");
                continue;
            }

            this.code = code;
            break;
        }


        // ===== nhập name =====
        while (true) {
            System.out.print("Nhập tên môn học: ");
            String name = sc.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("❌ Tên môn học không được để trống!");
                continue;
            }

            this.name = name;
            break;
        }


        // ===== nhập credits =====
        while (true) {
            try {
                System.out.print("Nhập số tín chỉ: ");
                int credits = Integer.parseInt(sc.nextLine());

                if (credits <= 0) {
                    System.out.println("❌ Số tín chỉ phải lớn hơn 0!");
                    continue;
                }

                this.credits = credits;
                break;

            } catch (NumberFormatException e) {
                System.out.println("❌ Số tín chỉ phải là số nguyên hợp lệ!");
            }
        }


        // ===== nhập startDate =====
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        while (true) {
            try {
                System.out.print("Nhập ngày bắt đầu (dd-MM-yyyy): ");
                String inputDate = sc.nextLine().trim();

                LocalDate startDate = LocalDate.parse(inputDate, formatter);
                this.startDate = startDate;
                break;

            } catch (DateTimeParseException e) {
                System.out.println("❌ Ngày không hợp lệ hoặc sai định dạng! Nhập đúng dd-MM-yyyy.");
            }
        }
    }

    @Override
    public void displayData() {
        System.out.printf("Code: %s | Name: %s | Credit: %s | Start date: %s", code, name, credits, startDate);
    }
}
