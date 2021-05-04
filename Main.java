public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.firstName = "Emre";
        student.secondName = "Atalay";
        student.eMail = "emreatalayp@gmail.com";
        student.id = 464;
        student.password = "44444";
        student.courseName = " Java & React";

        Instructor instructor = new Instructor();
        instructor.firstName = "Engin";
        instructor.secondName = " Demirog";
        instructor.eMail = "engin.demirog@kodlama.io";
        instructor.description = " Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarına sahibim ";
        instructor.id = 365;
        instructor.password = "1236465";
        instructor.courseName = " Java & React";

        UserManager userManager = new UserManager();
        User[] users = {student, instructor};
        userManager.multiEnter(users);
        userManager.delete(student);
        userManager.change(instructor);
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);

        StudentManager studentManager = new StudentManager();
        studentManager.keepGoing(student);
        studentManager.backStep(student);

        PersonManager personManager = new PersonManager();
        personManager.work(new StudentManager());
    }
}
