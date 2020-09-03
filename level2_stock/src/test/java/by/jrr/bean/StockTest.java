package by.jrr.bean;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockTest {

    @Test
    public void getNameCompany() {
        Stock stock = new Stock();
        stock.setNameCompany("Apple");

        String expected = "Apple";
        String actual = stock.getNameCompany();
        assertEquals(expected, actual);
    }

    @Test
    public void getCurrentPrice() {
        Stock stock = new Stock();
        stock.setCurrentPrice(372);

        double expected = 372;
        double actual = stock.getCurrentPrice();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void getMinPrice() {
        Stock stock = new Stock();
        stock.setMinPrice(371);

        double expected = 371;
        double actual = stock.getMinPrice();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void getMaxPrice() {
        Stock stock = new Stock();
        stock.setMaxPrice(373);

        double expected = 373;
        double actual = stock.getMaxPrice();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testEqualsCurrentPrice() {
            Stock firstStock = new Stock();
            firstStock.setCurrentPrice(49.16);

            Stock secondStock = new Stock();
            secondStock.setCurrentPrice(372);

            boolean expected = false;
            boolean actual = firstStock.equals(secondStock);
            assertEquals(expected, actual);
    }

    @Test
    public void testEqualsNamesCompany() {
        Stock firstStock = new Stock();
        firstStock.setNameCompany("Amazon");

        Stock secondStock = new Stock();
        secondStock.setNameCompany("Apple");

        boolean expected = false;
        boolean actual = firstStock.equals(secondStock);
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsMinPrice() {
        Stock firstStock = new Stock();
        firstStock.setMinPrice(48);

        Stock secondStock = new Stock();
        secondStock.setMinPrice(371);

        boolean expected = false;
        boolean actual = firstStock.equals(secondStock);
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsMaxPrice() {
        Stock firstStock = new Stock();
        firstStock.setMaxPrice(50);

        Stock secondStock = new Stock();
        secondStock.setMaxPrice(373);

        boolean expected = false;
        boolean actual = firstStock.equals(secondStock);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        Stock stock = new Stock();
        stock.setNameCompany("Amazon");
        stock.setCurrentPrice(49.16);
        stock.setMinPrice(49);
        stock.setMaxPrice(49.5);

        Integer expected = 1698879947;
        Integer actual = stock.hashCode();
        assertEquals(expected, actual);

    }

    @Test
    public void testToString() {
        Stock stock = new Stock();
        stock.setNameCompany("Amazon");
        stock.setCurrentPrice(49.16);
        stock.setMinPrice(49);
        stock.setMaxPrice(49.5);

        String expected = "Stock{nameCompany='Amazon', currentPrice=49.16, minPrice=49.0, maxPrice=49.5}";
        String actual = stock.toString();
        assertEquals(expected, actual);
    }
}

