package by.jrr.service;

import by.jrr.bean.User;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {

    @Test
    public void passwordVerification() {
        User user = new User("Jeck", "2222");
        UserService userService = new UserService();
        user.setPassword("2222");

        boolean expected = true;
        boolean actual = userService.passwordVerification(user, "2222");
        assertEquals(expected, actual);
    }

    @Test
    public void dropNumberOfAttempts() {
        User user = new User("Jeck", "2222");
        UserService userService = new UserService();
        user.setNumberOfAttempts(3);

        int expected = 3;
        int actual = userService.dropNumberOfAttempts(user);
        assertEquals(expected, actual);

    }

    @Test
    public void isUserBlocked() {
        User user = new User("Jeck", "2222");
        UserService userService = new UserService();


        boolean expected = false;
        boolean actual = userService.isUserBlocked(user);
        assertEquals(expected, actual);
    }

    @Test
    public void reduceNumberOfAttempts() {
        User user = new User("Tanya", "2222");
        UserService userService = new UserService();
        userService.login(user, "1111");
        userService.login(user, "0909");

        int expected = 1;
        int actual = user.getNumberOfAttempts();
        assertEquals(expected, actual);
    }

    @Test
    public void ifNumberOfAttemptsIsDrop() {
        User user = new User("Jeck", "2222");
        UserService userService = new UserService();

        boolean expected = false;
        boolean actual = userService.ifNumberOfAttemptsIsDrop(user);
        assertEquals(expected, actual);
    }

    @Test
    public void blockUser() {
        User user = new User("Jeck", "2222");
        UserService userService = new UserService();
        userService.blockUser(user);

        boolean expected = true;
        boolean actual = user.isBlock();
        assertEquals(expected, actual);

    }

    @Test
    public void loginTrue() {
        User user = new User("Jeck", "5555");
        UserService userService = new UserService();


        boolean expected = true;
        boolean actual = userService.login(user, "5555");
        assertEquals(expected, actual);
    }

    @Test
    public void loginFalse() {
        User user = new User("Jeck", "5555");
        UserService userService = new UserService();

        boolean expected = false;
        boolean actual = userService.login(user, "2222");
        assertEquals(expected, actual);
    }
    @Test
    public void testLoginBlockUserAfterAllAttepts() {
        User user = new User("Kate", "8989");
        UserService userService = new UserService();
        userService.login(user, "9898");
        userService.login(user, "8888");
        userService.login(user, "9999");

        boolean expected = true;
        boolean actual = user.isBlock();
        assertEquals(expected, actual);

    }
    @Test
    public void testLoginFirstAttepts() {
        User user = new User("Kate", "8989");
        UserService userService = new UserService();
        userService.login(user, "8989");

        boolean expected = false;
        boolean actual = user.isBlock();
        assertEquals(expected, actual);

    }
}
