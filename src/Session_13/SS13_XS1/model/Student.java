package Session_13.SS13_XS1.model;

import java.util.Scanner;

public class Student implements IBaseStudent {
    private int id;
    private String name;
    private double gpa;

    public Student() {
    }

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }


//    getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


//    Override
    @Override
    public void inputStudent(Scanner sc) {
        // nhập tên
        String name;
        do {
            System.out.print("Nhập tên sinh viên: ");
            name = sc.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("❌ Tên không được để trống!");
            }
        } while (name.isEmpty());
        this.name = name;

        // nhập GPA
        double gpa;
        while (true) {
            try {
                System.out.print("Nhập GPA: ");
                gpa = Double.parseDouble(sc.nextLine());
                if (gpa < 0 || gpa > 10) {
                    System.out.println("❌ GPA phải nằm trong khoảng 0 - 10!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("❌ GPA phải là số!");
            }
        }
        this.gpa = gpa;
    }

    @Override
    public void displayData() {
        System.out.printf("ID: %d | Name: %s | GPA: %f\n", this.id, this.name, this.gpa);
    }
}
