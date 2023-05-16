package ru.netology.services;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class SalesStatisticsService {
    public int getSumAllSales(int[] sales) {

        return (int) Arrays.stream(sales).sum();

    }

    public int averageSalesAmount(int[] allSales) {

        return (int) Arrays.stream(allSales).average().orElse(Double.NaN);

    }

    public int maxSalesAmount(int[] maxSales) {

        int maxDay = 0;
        for (int i = 0; i < maxSales.length; i++) {
            if (maxSales[i] > maxSales[maxDay]) {
                maxDay = i;
            }
        }
        return maxDay;

    }

    public int minSalesAmount(int[] maxSales) {

        int minDay = maxSales[0];
        for (int i = 0; i < maxSales.length; i++) {
            if (maxSales[i] < maxSales[minDay]) {
                minDay = i;
            }
        }
        return minDay;
    }

    public int amountMonthLowerAverage(int[] allSales) {

        int averageL = averageSalesAmount(allSales);
        int monthLowerAwerage = 0;

        for (int i = 0; i < allSales.length; i++) {
            if (allSales[i] < averageL) {
                monthLowerAwerage = monthLowerAwerage + 1;
            }
        }

        return monthLowerAwerage;
    }

    public int amountMonthHighAverage(int[] allSales) {

        int averageH = averageSalesAmount(allSales);
        int monthHighAwerage = 0;

        for (int i = 0; i < allSales.length; i++) {
            if (allSales[i] > averageH) {
                monthHighAwerage = monthHighAwerage + 1;
            }
        }

        return monthHighAwerage;

    }
}




















