package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test

    public void testSum() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);

        long expected = 180;

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void testAverage() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);

        long expected = 180 / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMonthMaxSale() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMaxSale(sales);

        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMonthMinSale() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMinSale(sales);

        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSalesBelowAvg() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.SalesBelowAvg(sales);

        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSalesAboveAvg() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.SalesAboveAvg(sales);

        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}