package Session_15.SS15_LT2;

import java.util.ArrayList;
import java.util.List;

public class SubjectManager implements Manage<Subject> {
    private final List<Subject> subjects = new ArrayList<>();

    @Override
    public void add(Subject item) {
        subjects.add(item);
    }

    @Override
    public void delete(String code) {
        int id = getIndex(code);

        if (id == -1) {
            System.out.println("❌ Không tìm thấy môn học!");
        } else {
            subjects.remove(id);
            System.out.println("Xoá thành công môn học");
        }
    }

    @Override
    public List<Subject> display() {
        return subjects;
    }

    @Override
    public List<Subject> findByName(String name) {
        List<Subject> result = new ArrayList<>();

        for (Subject subject : subjects) {
            if(subject.getName().toLowerCase().contains(name.trim().toLowerCase())){
                result.add(subject);
            }
        }

        return result;
    }

    @Override
    public List<Subject> filterByCredits(int credits) {
        List<Subject> result = new ArrayList<>();

        for (Subject subject : subjects) {
            if (subject.getCredits() >= credits) {
                result.add(subject);
            }
        }

        return result;
    }

    private int getIndex(String code){
        for (int i = 0; i < subjects.size(); i++) {
            if(subjects.get(i).getCode().equals(code)){
                return i;
            }
        }
        return -1;
    }
}
