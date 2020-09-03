package by.jrr.jis4.service;

import by.jrr.jis4.bean.LightColorDetector;
import org.junit.Test;

import static org.junit.Assert.*;

public class LightColorDetectorServiceTest {

    @Test
    public void detectTheColorOfTheSpectrumViolet() { //380 ... 449 - "Violet"
        LightColorDetector lightColorDetector = new LightColorDetector();
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        lightColorDetector.setWavelength(449);

        String expected = "Violet";
        String actual = lightColorDetectorService.detect(lightColorDetector);
        assertEquals(expected, actual);
    }
    @Test
    public void detectTheColorOfTheSpectrumBlue() { //450 ... 494 - "Blue"
        LightColorDetector lightColorDetector = new LightColorDetector();
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        lightColorDetector.setWavelength(494);

        String expected = "Blue";
        String actual = lightColorDetectorService.detect(lightColorDetector);
        assertEquals(expected, actual);
    }
    
    @Test
    public void detectTheColorOfTheSpectrumGreen() { //495 ... 569 - "Green"
        LightColorDetector lightColorDetector = new LightColorDetector();
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        lightColorDetector.setWavelength(569);

        String expected = "Green";
        String actual = lightColorDetectorService.detect(lightColorDetector);
        assertEquals(expected, actual);
    }

    @Test
    public void detectTheColorOfTheSpectrumYellow() { //570 ... 589 - "Yellow"
        LightColorDetector lightColorDetector = new LightColorDetector();
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        lightColorDetector.setWavelength(589);

        String expected = "Yellow";
        String actual = lightColorDetectorService.detect(lightColorDetector);
        assertEquals(expected, actual);
    }

    @Test
    public void detectTheColorOfTheSpectrumOrange() { //590 ... 619 - "Orange"
        LightColorDetector lightColorDetector = new LightColorDetector();
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        lightColorDetector.setWavelength(595);

        String expected = "Orange";
        String actual = lightColorDetectorService.detect(lightColorDetector);
        assertEquals(expected, actual);
    }

    @Test
    public void detectTheColorOfTheSpectrumRed() { //620 ... 750 - "Red"
        LightColorDetector lightColorDetector = new LightColorDetector();
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        lightColorDetector.setWavelength(745);

        String expected = "Red";
        String actual = lightColorDetectorService.detect(lightColorDetector);
        assertEquals(expected, actual);
    }
    @Test
    public void detectTheColorOfTheSpectrumInvisibleLight() { //Out of range -   "Invisible Light"
        LightColorDetector lightColorDetector = new LightColorDetector();
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
        lightColorDetector.setWavelength(751);

        String expected = "Invisible Light";
        String actual = lightColorDetectorService.detect(lightColorDetector);
        assertEquals(expected, actual);
    }
}









