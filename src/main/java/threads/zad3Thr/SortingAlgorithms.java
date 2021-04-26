package threads.zad3Thr;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SortingAlgorithms {
    // 1,3,4,5,3,2  ASC - porównuje sąsiedne elementy i zamienia kolejnosc gdy pierwszy jest większy niż drugi
    // 1,3,4,3,2,5  ETAP I
    // 1,3,3,2,4,5  ETAP II
    // 1,3,2,3,4,5  ETAP III
    // 1,2,3,3,4,5  ETAP IV
    public static int[] bubbleSort(int[] array) {


        for (int i = 0; i < array.length - 1; i++) { // etapy
            for (int j = 0; j < array.length - 1; j++) {   //swap
                if (array[j] > array[j + 1]) {
                    int element = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = element;
                }
            }
        }
        return array;
    }

    public static int[] streamAPISorting(int[] array) {
        return Arrays.stream(array).sorted().toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[100_000];
        int[] arr2 = new int[100_000];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            int number = random.nextInt(100);
            arr1[i] = number;
            arr2[i] = number;

        }
        Thread t1 = new Thread(() ->{
            LocalTime start = LocalTime.now();
            bubbleSort(arr1);
            LocalTime end = LocalTime.now();
            System.out.println("Bubble sort: " + Duration.between(start, end).toMillis()+"ms");

        }

        );
        Thread t2 = new Thread(
                () ->  {
                    LocalTime start = LocalTime.now();
                    streamAPISorting(arr2);
                    LocalTime end = LocalTime.now();
                    System.out.println("Stream API: " + Duration.between(start, end).toMillis()+"ms");

                }
        );
        t1.start();
        t2.start();



    }


}
