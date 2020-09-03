package by.jrr.bean;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void getLogin() {
        User user = new User("Alex","5555");

        String expected = "Alex";
        String actual = user.getLogin();
        assertEquals(expected, actual);
    }

    @Test
    public void getPassword() {
        User user = new User("Alex","5555");

        String expected = "5555";
        String actual = user.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void isBlock() {
        User user = new User("Alex","5555");
        user.setBlock(false);

        boolean expected = false;
        boolean actual = user.isBlock();
        assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfAttempts() {
        User user = new User("Alex","5555");
        user.setNumberOfAttempts(3);

        int expected = 3;
        int actual = user.getNumberOfAttempts();
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsFalse() {
        User firstUser = new User("Alex","5555");
        User secondUser = new User("Den","7777");

        boolean expected = false;
        boolean actual = firstUser.equals(secondUser);
        assertEquals(expected, actual);

    }
    @Test
    public void testEqualsTrue() {
        User firstUser = new User("Alex","5555");
        User secondUser = new User("Alex","5555");

        boolean expected = true;
        boolean actual = firstUser.equals(secondUser);
        assertEquals(expected, actual);

    }

    @Test
    public void testHashCode() {
        User user = new User("Ann","8888");

        Integer expected = -671574546;
        Integer actual = user.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        User user = new User("Ann","8888");

        String expected = "User{login='Ann', password='8888', isBlock=false, numberOfAttempts=3}";
        String actual = user.toString();
        assertEquals(expected, actual);
    }
}