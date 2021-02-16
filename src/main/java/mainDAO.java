import entity.User;
import entity.UserDao;

public class mainDAO {

    public static void main(String[] args) {

        UserDao userDao = new UserDao();

        /*User user1 = new User("Władysław", "wladek@wp.pl", "wladeczek"); // 1st option add

        User user = new User(); // 2nd option add
        user.setUserName("Stefan");
        user.setEmail("stef@wp.pl");
        user.setPassword("stefciu1");
        userDao.createUser(user);*/


       /* userDao.readUser(9);
        System.out.println(userDao.readUser(9));*/
       /* userDao.deleteUser(10);*/


        User user = new User(); // 2nd option add
        user.setUserName("Stefan");
        user.setEmail("stefan@onet.pl");
        user.setPassword("stefciu1");
        user.setId(3);
        userDao.updateUser(user);
    }
}
