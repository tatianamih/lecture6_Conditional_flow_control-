package by.jrr.service;

import by.jrr.bean.SignComparato;

public class SignComparatoService {

    public SignComparatoService() {
//  no args constructor
    }

       public String determineTheSign(SignComparato signComparato) {
        if (signComparato.getNumber() > 0) {
            return "Number is positive";
        } else if (signComparato.getNumber() < 0) {
            return "Number is negative";
        } else {
            return "Number is equal to zero";
        }
    }
}
