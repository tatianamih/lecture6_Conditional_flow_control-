package by.jrr.jis4.service;

import by.jrr.jis4.bean.PhraseAnalyser;

public class PhraseAnalyserService {

    public PhraseAnalyserService() {
// no args constructor
    }

    public String analyse(PhraseAnalyser text) {
       

        if (text.getFirstPartOfTheText().equals("Make") && text.getPastPartOfTheText().equals("great again")) {
            return "It stands no chance";
        } else if (text.getFirstPartOfTheText().equals("Make") || text.getPastPartOfTheText().equals("great again")) {
            return "It could be worse";
        } else {
            return "It is fine, really";
        }
    }
}

   