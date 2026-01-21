package Session_7.SS7_K1;

public class Student {
    private String StudentID;
    private String StudentName;
    private String StudentBirth;
    private String StudentEmail;
    private String StudentPhoneNumber;

//    hàm khởi tạo
    public Student() {

    }

    public Student(String studentID, String studentName, String studentBirth, String studentEmail, String studentPhoneNumber) {
        StudentID = studentID;
        StudentName = studentName;
        StudentBirth = studentBirth;
        StudentEmail = studentEmail;
        StudentPhoneNumber = studentPhoneNumber;
    }


//      getter setter
    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentBirth() {
        return StudentBirth;
    }

    public void setStudentBirth(String studentBirth) {
        StudentBirth = studentBirth;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
    }

    public String getStudentPhoneNumber() {
        return StudentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        StudentPhoneNumber = studentPhoneNumber;
    }

    // phương thức khác
    public static void courseRegistration() {

    }
    public static void viewScores() {

    }
    public static void updateInformation() {

    }
}
