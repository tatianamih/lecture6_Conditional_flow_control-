package by.jrr.jis4.bean;

import java.util.Objects;

public class LightColorDetector {

    private int wavelength;


    public LightColorDetector() {
        // no args constructor
    }

    public int getWavelength() {
        return wavelength;
    }

    public void setWavelength(int wavelength) {
        this.wavelength = wavelength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightColorDetector that = (LightColorDetector) o;
        return wavelength == that.wavelength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wavelength);
    }

    @Override
    public String toString() {
        return "LightColorDetector{" +
                "wavelength=" + wavelength +
                '}';
    }
}
