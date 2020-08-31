package by.jrr.service;

import by.jrr.bean.SignComparato;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class SignComparatoServiceTest {
    public SignComparatoServiceTest() {
// no args constructor
    }
    Logger logger = LoggerFactory.getLogger(SignComparatoServiceTest.class);

    @Test
    public void determineThePositiveSign() {
        SignComparato signComparato = new SignComparato();
        SignComparatoService signComparatoService = new SignComparatoService();
        signComparato.setNumber(5000);

        logger.info("Determining where the number belongs");

        String expected = "Number is positive";
        String actual = signComparatoService.determineTheSign(signComparato);
        assertEquals(expected, actual);
    }

    @Test
    public void determineTheNegativeSign() {
        SignComparato signComparato = new SignComparato();
        SignComparatoService signComparatoService = new SignComparatoService();
        signComparato.setNumber(-5000);

        logger.info("Determining where the number belongs");

        String expected = "Number is negative";
        String actual = signComparatoService.determineTheSign(signComparato);
        assertEquals(expected, actual);
    }

    @Test
    public void determineTheSignNumberIsEqualToZero() {
        SignComparato signComparato = new SignComparato();
        SignComparatoService signComparatoService = new SignComparatoService();
        signComparato.setNumber(0);

        logger.info("Determining where the number belongs");

        String expected = "Number is equal to zero";
        String actual = signComparatoService.determineTheSign(signComparato);
        assertEquals(expected, actual);
    }
}