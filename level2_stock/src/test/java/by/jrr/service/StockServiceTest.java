package by.jrr.service;

import by.jrr.bean.Stock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StockServiceTest {

    @Test
    public void updateMaxPrice() {
        Stock stock = new Stock("Amazon",50);
        StockService stockService = new StockService(stock);
        stockService.updatePrice(50);


        boolean maxPriceExpected = true;
        boolean actualMaxPrice = (stock.getMaxPrice() == 50 ) && (stock.getCurrentPrice() == 50);
        assertEquals(maxPriceExpected, actualMaxPrice);
    }

    @Test
    public void updateMinPrice() {
        Stock stock = new Stock("Amazon", 48);
        StockService stockService = new StockService(stock);
        stockService.updatePrice(48);

        boolean minPriceExpected =true;
        boolean actualMinPrice = (stock.getMaxPrice() == 48 ) && (stock.getCurrentPrice() == 48);
        assertEquals(minPriceExpected, actualMinPrice);

    }
    @Test
    public void updatePriceTestNewPriceBetweenMinPriceAndMaxPrice() {
        Stock stock = new Stock("Amazon",48);//5
        StockService stockService = new StockService(stock);
        stockService.updatePrice(46);
        stockService.updatePrice(50);
        stockService.updatePrice(49.16);

        boolean expected = true;
        boolean actual = (stock.getCurrentPrice() == 49.16);
        assertEquals(expected, actual);


    }

    @Test
    public void printInformation() {
        Stock stock = new Stock();
        StockService stockService = new StockService(stock);
        stock.setNameCompany("Apple");
        stock.setCurrentPrice(372);
        stock.setMinPrice(372);
        stock.setMaxPrice(455);

        String informationExpected = "Company = Apple, Current Price = 372.0, Min Price = 372.0, Max Price = 455.0";
        String actualInformation ="Company = " + stock.getNameCompany() + ", Current Price = " + stock.getCurrentPrice() + ", Min Price = " + stock.getMinPrice() + ", Max Price = " + stock.getMaxPrice();
        assertEquals(informationExpected, actualInformation);
    }
}


