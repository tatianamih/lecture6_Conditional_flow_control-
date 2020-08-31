package by.jrr.bean;

import java.util.Objects;

public class SignComparato {
    private int number;

    public SignComparato() {
       // no args constructor
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SignComparato that = (SignComparato) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "SignComparato{" +
                "number=" + number +
                '}';
    }
}
