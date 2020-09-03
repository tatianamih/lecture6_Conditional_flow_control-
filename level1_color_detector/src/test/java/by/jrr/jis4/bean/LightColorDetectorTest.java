package by.jrr.jis4.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class LightColorDetectorTest {


    @Test
    public void getWavelength() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        lightColorDetector.setWavelength(455);

        int expected = 455;
        int actual = lightColorDetector.getWavelength();
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsTrue() {
        LightColorDetector firstLightColorDetector = new LightColorDetector();
        firstLightColorDetector.setWavelength(455);

        LightColorDetector secondLightColorDetector = new LightColorDetector();
        secondLightColorDetector.setWavelength(455);

        Boolean expected = true;
        Boolean actual = firstLightColorDetector.equals(secondLightColorDetector);
        assertEquals(expected, actual);
    }
    @Test
    public void testEqualsFalse() {
        LightColorDetector firstLightColorDetector = new LightColorDetector();
        firstLightColorDetector.setWavelength(455);

        LightColorDetector secondLightColorDetector = new LightColorDetector();
        secondLightColorDetector.setWavelength(780);

        Boolean expected = false;
        Boolean actual = firstLightColorDetector.equals(secondLightColorDetector);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        lightColorDetector.setWavelength(455);

        Integer expected = 486;
        Integer actual = lightColorDetector.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        lightColorDetector.setWavelength(455);

        String expected = "LightColorDetector{wavelength=455}";
        String actual = lightColorDetector.toString();
        assertEquals(expected, actual); }
}