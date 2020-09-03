package by.jrr.jis4.service;

import by.jrr.jis4.bean.PhraseAnalyser;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhraseAnalyserServiceTest {

    @Test
    public void analyseFirstVariant() {
       PhraseAnalyser text = new PhraseAnalyser();
       PhraseAnalyserService textService = new PhraseAnalyserService();
       text.setFirstPartOfTheText("Make");
       text.setMiddlePartOfTheText(" the world");
       text.setPastPartOfTheText("great again");
      
        String expected = "It stands no chance";
        String actual;
        actual =textService.analyse(text);
        assertEquals(expected, actual);
    }

    @Test
    public void analyseSecondVariant() {
        PhraseAnalyser text = new PhraseAnalyser();
        PhraseAnalyserService textService = new PhraseAnalyserService();
        text.setFirstPartOfTheText("Make");
        text.setMiddlePartOfTheText(" the world");
        text.setPastPartOfTheText(" a better place");
       
        String expected = "It could be worse";
        String actual;
        actual =textService.analyse(text);
        assertEquals(expected, actual);
    }
    @Test
    public void analyseThirdVariant() {
        PhraseAnalyser text = new PhraseAnalyser();
        PhraseAnalyserService textService = new PhraseAnalyserService();
        text.setFirstPartOfTheText(" We mad");
        text.setMiddlePartOfTheText(" the world");
        text.setPastPartOfTheText("great again");

        String expected = "It could be worse";
        String actual;
        actual =textService.analyse(text);
        assertEquals(expected, actual);
    }
    @Test
    public void analyseFourthVariant() {
        PhraseAnalyser text = new PhraseAnalyser();
        PhraseAnalyserService textService = new PhraseAnalyserService();
        text.setFirstPartOfTheText("Life");
        text.setMiddlePartOfTheText("is");
        text.setPastPartOfTheText("beautiful");

        String expected = "It is fine, really";
        String actual;
        actual =textService.analyse(text);
        assertEquals(expected, actual);
    }
}