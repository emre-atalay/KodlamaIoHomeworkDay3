public class InstructorManager extends UserManager {
    public void add(Instructor instructor) {
        System.out.println("Added new homeworks for" + instructor.courseName);
    }

    public void update(Instructor instructor) {
        System.out.println("Update course " + instructor.courseName);
    }
    @Override
    public void log(){
        System.out.println("Instructor Logged");

    }
}
