package ru.netology.services;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class SalesStatisticsService {
    public int getSumAllSales(int[] allSales) {

        int sumSales = 0;
        for (int i : allSales) {
                sumSales = i + sumSales;

        }
        return sumSales;

    }

    public int averageSalesAmount(int[] allSales) {
        int average =getSumAllSales(allSales) / allSales.length;

            return average;







    }

    public int maxSalesAmount(int[] allSales) {

        int maxDay = 0;
        for (int i = 0; i < allSales.length; i++) {
            if (allSales[i] >= allSales[maxDay]) {
                maxDay = i;
            }
        }
        return maxDay;

    }

    public int minSalesAmount(int[] allSales) {

        int minDay = allSales[0];
        for (int i = 0; i < allSales.length; i++) {
            if (allSales[i] < allSales[minDay]) {
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




















