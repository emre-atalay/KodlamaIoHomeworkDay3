public class UserManager {
    public void enter(User user) {
        System.out.println(user.firstName + " " + user.secondName + " " + user.id + " eMail adress : " + user.eMail +
                "Password : " + user.password + " " + " Sign In");
    }

    public void multiEnter(User[] users) {
        for (User user1 : users) {
            enter(user1);
        }
    }

    public void delete(User user) {
        System.out.println(user.firstName + " " + user.secondName + " Account deleted");
    }

    public void change(User user) {
        System.out.println(user.id + " Change User Account's Image ");
    }

    public void log() {

    }

}
