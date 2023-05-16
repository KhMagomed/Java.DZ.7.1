package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


  public class SalesStatisticsServiceTest {

    @Test
    public void shouldFindAllSales() {
        SalesStatisticsService service = new SalesStatisticsService();

        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 180;
        int actualDay = service.getSumAllSales(allSales);

        Assertions.assertEquals(expectedDay, actualDay);


    }

    @Test
    public void averageSalesAmount() {
        SalesStatisticsService service = new SalesStatisticsService();

        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 15;
        int actualDay = service.averageSalesAmount(allSales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void maxSalesAmount() {
        SalesStatisticsService service = new SalesStatisticsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        int actualDay = service.maxSalesAmount(allSales);

        Assertions.assertEquals(expectedDay, actualDay);


    }

    @Test
    public void minSalesAmount() {
        SalesStatisticsService service = new SalesStatisticsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        int actualDay = service.minSalesAmount(allSales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void amountMonthLowerAverage() {
        SalesStatisticsService service = new SalesStatisticsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        int actualDay = service.amountMonthLowerAverage(allSales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void amountMonthHighAverage() {
        SalesStatisticsService service = new SalesStatisticsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        int actualDay = service.amountMonthHighAverage(allSales);

        Assertions.assertEquals(expectedDay, actualDay);
    }


}
