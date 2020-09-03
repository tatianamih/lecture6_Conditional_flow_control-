package by.jrr.jis4.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhraseAnalyserTest {

    @Test
    public void getFirstPartOfTheText() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        phraseAnalyser.setFirstPartOfTheText("Made");

        String expected = "Made";
        String actual = phraseAnalyser.getFirstPartOfTheText();
        assertEquals(expected, actual);
    }

    @Test
    public void getMiddlePartOfTheText() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        phraseAnalyser.setMiddlePartOfTheText("Made");

        String expected = "Made";
        String actual = phraseAnalyser.getMiddlePartOfTheText();
        assertEquals(expected, actual);
    }

    @Test
    public void getPastPartOfTheText() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        phraseAnalyser.setPastPartOfTheText("great again");

        String expected = "great again";
        String actual = phraseAnalyser.getPastPartOfTheText();
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsTrue() {
        PhraseAnalyser firstPhraseAnalyser = new PhraseAnalyser();
        firstPhraseAnalyser.setFirstPartOfTheText("Made");
        firstPhraseAnalyser.setMiddlePartOfTheText("world");
        firstPhraseAnalyser.setPastPartOfTheText("great again");

        PhraseAnalyser secondPhraseAnalyser = new PhraseAnalyser();
        secondPhraseAnalyser.setFirstPartOfTheText("Made");
        secondPhraseAnalyser.setMiddlePartOfTheText("world");
        secondPhraseAnalyser.setPastPartOfTheText("great again");

        Boolean expected = true;
        Boolean actual = firstPhraseAnalyser.equals(secondPhraseAnalyser);
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsFalse() {
        PhraseAnalyser firstPhraseAnalyser = new PhraseAnalyser();
        firstPhraseAnalyser.setFirstPartOfTheText("Made");
        firstPhraseAnalyser.setMiddlePartOfTheText("world");
        firstPhraseAnalyser.setPastPartOfTheText("great again");

        PhraseAnalyser secondPhraseAnalyser = new PhraseAnalyser();
        secondPhraseAnalyser.setFirstPartOfTheText("You only live once, ");
        secondPhraseAnalyser.setMiddlePartOfTheText("but if you do it right, ");
        secondPhraseAnalyser.setPastPartOfTheText(" once is enough");

        Boolean expected = false;
        Boolean actual = firstPhraseAnalyser.equals(secondPhraseAnalyser);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        phraseAnalyser.setFirstPartOfTheText("Made");
        phraseAnalyser.setMiddlePartOfTheText("world");
        phraseAnalyser.setPastPartOfTheText("great again");

        Integer expected = 449643279;
        Integer actual = phraseAnalyser.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        phraseAnalyser.setFirstPartOfTheText("Made");
        phraseAnalyser.setMiddlePartOfTheText("world");
        phraseAnalyser.setPastPartOfTheText("great again");

        String expected = "PhraseAnalyser{firstPartOfTheText='Made', middlePartOfTheText='world', pastPartOfTheText='great again'}";
        String actual = phraseAnalyser.toString();
        assertEquals(expected, actual);
    }
}