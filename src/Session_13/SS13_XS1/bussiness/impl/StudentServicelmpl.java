package Session_13.SS13_XS1.bussiness.impl;

import Session_13.SS13_XS1.bussiness.IStudentService;
import Session_13.SS13_XS1.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServicelmpl implements IStudentService<Student> {
    private final List<Student> students = new ArrayList<>();

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> findByName(String name) {
        List<Student> result = new ArrayList<>();

        String keyword = name.trim().toLowerCase();

        for (Student student : students) {
            String fullName = student.getName().trim().toLowerCase();
            String[] parts = fullName.split("\\s+");

            String ho = parts[0];
            String ten = parts[parts.length - 1];

            if (ho.equals(keyword) || ten.equals(keyword)) {
                result.add(student);
            }
        }

        return result;
    }

    @Override
    public List<Student> rank(int n) {
        return students;
    }

    @Override
    public List<Student> display() {
        return students;
    }
}
