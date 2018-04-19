package com.timbuchalka;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        arrays();
        arraysInputs();


    }


    private static void arrays() {

//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        int[] myIntArray = new int[10];

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }

        double[] myDoubleArray = new double[10];

        printArray(myIntArray);
    }

    public static int[] sortIntegers(int[] array) {

//        int[] sortedArray = new int[array.length];
//
//        for(int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;

            for (int i = 0; i<sortedArray.length-1; i++ ) {
                if(sortedArray[i] < sortedArray [i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray [i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {

        for(int i = 0; i < array.length; i++) {
            System.out.println("element " + i + ", value is " + array[i]);
        }
    }

    private static void arraysInputs() {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

        for (int i = 0; i<myIntegers.length; i++) {
            System.out.println("element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("avg is " + getAverage(myIntegers));
    }

    private static int[] getIntegers(int number) {

        System.out.println("Enter " + number + "int values.\r");
        int[] values = new int[number];

        for(int i = 0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i<array.length; i++) {
            sum += array[i];
        }

        return (double) sum/ (double) array.length;
    }
}
