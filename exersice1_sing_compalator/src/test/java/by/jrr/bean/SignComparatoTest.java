package by.jrr.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class SignComparatoTest {

    @Test
    public void getNumberPositive() {
        SignComparato signComparato = new SignComparato();
        signComparato.setNumber(1000);

        int expected = 1000;
        int actual = signComparato.getNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void getNumberNegative() {
        SignComparato signComparato = new SignComparato();
        signComparato.setNumber(-1000);

        int expected = -1000;
        int actual = signComparato.getNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void getNumberIsZero() {
        SignComparato signComparato = new SignComparato();
        signComparato.setNumber(0);

        int expected = 0;
        int actual = signComparato.getNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsFalseOfTwoNumbers() {
        SignComparato firstNumber = new SignComparato();
        firstNumber.setNumber(500);

        SignComparato secondNumber = new SignComparato();
        secondNumber.setNumber(1400);

        boolean expected = false;
        boolean actual = firstNumber.equals(secondNumber);
        assertEquals(expected, actual);
    }
    @Test
    public void testEqualsTrueOfTwoNumbers() {
        SignComparato firstNumber = new SignComparato();
        firstNumber.setNumber(1400);

        SignComparato secondNumber = new SignComparato();
        secondNumber.setNumber(1400);

        boolean expected = true;
        boolean actual = firstNumber.equals(secondNumber);
        assertEquals(expected, actual);
    }
    @Test
    public void testEqualsTrue() {
        SignComparato number = new SignComparato();
        number.setNumber(500);

        boolean expected = true;
        boolean actual = number.equals(number);
        assertEquals(expected, actual);
    }
    @Test
    public void testEqualsFalse() {
        SignComparato number = new SignComparato();
        number.setNumber(500);

        boolean expected = false;
        boolean actual = number.equals(false);
        assertEquals(expected, actual);
    }


    @Test
    public void testHashCode() {
        SignComparato number = new SignComparato();
        number.setNumber(500);

        Integer expected = 531;
        Integer actual = number.hashCode();
        assertEquals(expected, actual);

    }

    @Test
    public void testToString() {
        SignComparato number = new SignComparato();
        number.setNumber(500);

        String expected = "SignComparato{number=500}";
        String actual = number.toString();
        assertEquals(expected, actual);
    }
}