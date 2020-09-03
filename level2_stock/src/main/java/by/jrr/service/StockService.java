package by.jrr.service;

import by.jrr.bean.Stock;

public class StockService {
    private Stock stock;

    public StockService(Stock stock) {
        this.stock = stock;
    }
   

    public void updatePrice(double newPrice) {
        if (newPrice < stock.getMinPrice()) {
            stock.setMinPrice(newPrice);
            stock.setCurrentPrice(newPrice);
        } else if (newPrice > stock.getMaxPrice()) {
           stock.setMaxPrice(newPrice);
           stock.setCurrentPrice(newPrice);
        } else{
            stock.setCurrentPrice(newPrice);
        }
    }

      public String printInformation() {

        return "Company = " + stock.getNameCompany() + ", Current Price = " + stock.getCurrentPrice() + ", Min Price = " + stock.getMinPrice() + " Max Price = " + stock.getMaxPrice();
    }
}


