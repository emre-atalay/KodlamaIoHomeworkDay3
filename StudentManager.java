public class StudentManager extends UserManager {
    public void keepGoing(Student student) {
        System.out.println("Finished and keep going next step for " + student.courseName);
    }

    public void backStep(Student student) {
        System.out.println("Look before lesseon for " + student.courseName);
    }
    public void delete(User user) {
        System.out.println(user.firstName + " " + user.secondName + " Account deleted");
    }
    @Override
    public void log(){
        System.out.println("Student Logged");
    }
}
