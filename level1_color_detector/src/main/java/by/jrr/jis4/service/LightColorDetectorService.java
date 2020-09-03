package by.jrr.jis4.service;

import by.jrr.jis4.bean.LightColorDetector;

public class LightColorDetectorService {
    LightColorDetector lightColorDetector = new  LightColorDetector();
      public String detect(LightColorDetector lightColorDetector){
        
        if(lightColorDetector.getWavelength() > 379 && lightColorDetector.getWavelength() < 450){
            return "Violet";
            
        } else if(lightColorDetector.getWavelength() > 449 && lightColorDetector.getWavelength() < 495){
            return "Blue";
            
        } else if(lightColorDetector.getWavelength() > 494 && lightColorDetector.getWavelength() < 570){
            return "Green";
            
        }else if(lightColorDetector.getWavelength() > 569 && lightColorDetector.getWavelength() < 590){
            return "Yellow";
            
        }else if(lightColorDetector.getWavelength() > 589 && lightColorDetector.getWavelength() < 620){
            return "Orange"
                    ;
        }else if(lightColorDetector.getWavelength() > 619 && lightColorDetector.getWavelength() < 751){
            return "Red";
            
        }else{
            return "Invisible Light";
        }
    }
}
//380 ... 449 - Фиолетовый ("Violet")
//450 ... 494 - Синий ("Blue")
//495 ... 569 - Зеленый ("Green")
//570 ... 589 - Желтый ("Yellow")
//590 ... 619 - Оранжевый ("Orange")
//620 ... 750 - Красный ("Red")
//Вне диапазонов - невидимый спектр ("Invisible Light")