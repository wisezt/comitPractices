package homework;

import java.util.Map;
import java.util.TreeMap;

public class June15 {


    //Use Map to store data
    static Map<Integer, Integer> MapOfMil = new TreeMap<>();

    /*
    There are two steps in main method:
        1. Create data
            a. set data into Map

        2. Show data
            a. get Amount
            b. get Maximum
            c. show rainy days in row
     */


    public static void main(String[] args) {

        //Create a random data from 2005 to 2009
        createWaterData(2005, 2009);



        //show the data
        showWaterData(22, 12, 2009);
    }


    static void createWaterData(int startYear, int endYear) {

        // use Math.random() to create water data from startYear to endYear.
        for (int y = startYear; y <= endYear; y++) { // loop year
            for (int m = 1; m <= 12; m++) { // lopp month
                for (int d = 1; d <= daysOfMonth(m, y); d++) { //loop day
                    int rate = (int) (Math.random() * 10);
                    int waterMillimteter = 0;
                    if (rate > 7) { // assume 70% days have sun shine, 30% days are rainy.
                        waterMillimteter = (int) (Math.random() * 500);
                        // assume the millimeters of water are from 0~500
                    }
                    //set data to Map
                    setWaterData(waterMillimteter, d, m, y);
                }
            }
        }
    }

    // Check leapYear
    static boolean isLeapYear(int year) {
        boolean isLeapY = false;
        if (year % 4 != 0) {
            isLeapY = false;
        } else if (year % 100 != 0) {
            isLeapY = true;
        } else if (year % 400 != 0) {
            isLeapY = false;
        } else {
            isLeapY = true;
        }

        return isLeapY;
    }

    static int daysOfMonth(int month, int year) {
        int days = 0;
        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                if (isLeapYear(year) == true) {
                    days = 29;
                    break;
                } else {
                    days = 28;
                    break;
                }
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                System.out.println("Please input 1~12;");
        }

        return days;
    }




    //set data
    static void setWaterData(int millimeterOfWater, int days, int month, int year) {
        int key = days + month * 100 + year * 10000;
        MapOfMil.put(key, millimeterOfWater);
        System.out.println("The data " + millimeterOfWater + " is put into " + key);
    }

    //show data;
    static void showWaterData(int days, int month, int year) {

        int amount = getAmount(month, year);
        System.out.println("On " + year + "-" + month + "-" + days + ",the millimeters of water is " + MapOfMil.get(year * 10000 + month * 100 + days) + "mm");
        System.out.println("The amount water of the month is " + amount + "mm");
        System.out.println("The Maximum precipitation recorded for the month " + getMax(month, year) + "mm");
        showRowDays(month, year);
    }

    // calculate the amount
    static int getAmount(int month, int year) {
        int amount = 0;

        for (int i = 1; i <= daysOfMonth(month, year); i++) {

            int key = i + month * 100 + year * 10000;

            amount = MapOfMil.get(key) + amount;
        }
        return amount;
    }

    // calculate the maximum number
    static int getMax(int month, int year) {
        int max = 0;
        for (int i = 1; i <= daysOfMonth(month, year); i++) {
            int key = i + month * 100 + year * 10000;
            if (MapOfMil.get(key) > max) {
                max = MapOfMil.get(key);
            }
        }

        return max;
    }

    // find the two days which rained in a row.
    static void showRowDays(int month, int year) {


        for (int i = 1; i < daysOfMonth(month, year); i++) {// only calculate the rainy days in the same month.
            int key = i + month * 100 + year * 10000;
            if (MapOfMil.get(key) > 0 && MapOfMil.get(key + 1) > 0) {
                String date1 = year + "-" + month + "-" + key;
                String date2 = year + "-" + month + "-" + (key + 1);
                System.out.println(date1);
                System.out.println(date2);
                System.out.println("Both are rainy day.");
            }
        }

    }

    // This is an excellent practice! thanks Wainny.


}
