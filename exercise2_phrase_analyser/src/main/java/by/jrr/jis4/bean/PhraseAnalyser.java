package by.jrr.jis4.bean;


import java.util.Objects;

public class PhraseAnalyser {
    private String firstPartOfTheText;
    private String middlePartOfTheText;
    private String pastPartOfTheText;


    public PhraseAnalyser() {
        // no args constructor
    }

    public String getFirstPartOfTheText() {
        return firstPartOfTheText;
    }

    public void setFirstPartOfTheText(String firstPartOfTheText) {
        this.firstPartOfTheText = firstPartOfTheText;
    }

    public String getMiddlePartOfTheText() {
        return middlePartOfTheText;
    }

    public void setMiddlePartOfTheText(String middlePartOfTheText) {
        this.middlePartOfTheText = middlePartOfTheText;
    }

    public String getPastPartOfTheText() {
        return pastPartOfTheText;
    }

    public void setPastPartOfTheText(String pastPartOfTheText) {
        this.pastPartOfTheText = pastPartOfTheText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhraseAnalyser that = (PhraseAnalyser) o;
        return firstPartOfTheText.equals(that.firstPartOfTheText) &&
                middlePartOfTheText.equals(that.middlePartOfTheText) &&
                pastPartOfTheText.equals(that.pastPartOfTheText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstPartOfTheText, middlePartOfTheText, pastPartOfTheText);
    }

    @Override
    public String toString() {
        return "PhraseAnalyser{" +
                "firstPartOfTheText='" + firstPartOfTheText + '\'' +
                ", middlePartOfTheText='" + middlePartOfTheText + '\'' +
                ", pastPartOfTheText='" + pastPartOfTheText + '\'' +
                '}';
    }
}
    

   