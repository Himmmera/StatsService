package ru.netology.Stats;
public class StatsService {

    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int monthMaximum = 0;
        long saleMaximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaximum) {
                monthMaximum = i;
                saleMaximum = sales[i];
            }
        }
        return monthMaximum + 1;
    }

    public int monthMiniSale(long[] sales) {
        int monthMin = 0;
        long saleMin = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMin) {
                monthMin = i;
                saleMin = sales[i];
            }
        }
        return monthMin + 1;
    }

    public int calcMonthSaleBellowAverage(long[] sales) {
        int counter = 0;
        for (long sale: sales) {
            if (sale < average((sales))) {
                counter++;
            }
        }
        return counter;
    }

    public int calcMonthSaleAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale: sales) {
            if (sale > average((sales))) {
                counter++;
            }
        }
        return counter;
    }
}
