package week6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* int[] values = {6,5,8,7,11};
        System.out.println("smallest: " + smallest(values));
        System.out.println("index of smallest: " + indexOfTheSmallest(values)); */

        /* int[] values2 = {-1,6,9,8,12};
        System.out.println(indexOfTheSmallestStartingFrom(values2, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values2, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values2, 4)); */

         /* swap(values, 1, 0);
        System.out.println(Arrays.toString(values)); */

        /* int[] array = {-3,2,3,4,7,8,12};
        Scanner reader = new Scanner(System.in);

        System.out.println("Values of the array: " + Arrays.toString(array));
        System.out.println();

        System.out.println("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));

        if(result == true)
        {
            System.out.println("Value " + searchedValue + " is in the array");
        }
        else {
            System.out.println("Value " + searchedValue + " is not in the array");
        } */

        /* int[] array = {5, 1, 3, 4, 2};
        printElegantly(array); */

        /* NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.printLine(); */

        /* NightSky NightSky = new NightSky(8, 4);
        NightSky.print(); */

        NightSky NightSky = new NightSky(8, 4);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }

    public static int smallest(int[] array)
    {
        int min = array[0];
        for(int i = 0; i < array.length; i++ )
        {
            if(array[i] < min)
            {
                min = array[i];
            }
        }
        return min;
    }
    public static int indexOfTheSmallest(int[] array)
    {
        int minIndex = 0;
        int min = array[0];
        for(int i = 0; i < array.length; i++ )
        {
            if(array[i] < min)
            {
                minIndex = i;
                min = array[i];
            }
        }
        return minIndex;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index)
    {
        int minIndex = index;
        int min = array[index];
        for(int i = index; i < array.length; i++ )
        {
            if(array[i] < min)
            {
                minIndex = i;
                min = array[i];
            }
        }
        return minIndex;
    }
    public static void swap(int[] array, int index1, int index2)
    {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
    }
    public static void printElegantly(int[] array)
    {
        System.out.print(array[0]);
        for(int i = 1; i < array.length; i++)
        {
            System.out.print(", " + array[i]);
        }
    }
}
