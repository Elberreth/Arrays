package se.lexicon.Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysExercises {

        //public static int[] removeDuplicates(int[] array) {
        //return removeDuplicates();






        public static void main(String[] args) {


            ex1();
            indexOf();
            ex3();
            ex4();
            ex5();
            ex6();
            ex7();
            //ex8();
        }

        public static void ex1() {

            int[] numbers = {11, 23, 39};

            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);

            }
        }

        public static void indexOf() {
            System.out.println("--------");
            int[] numbers2 = {3, 4, 5, 12, 9};
            Arrays.sort(numbers2);
            int position = Arrays.binarySearch(numbers2, 5);
            System.out.println("Index position of number 5 is: " + position);
            System.out.println("_______");

        }

        public static void ex3() {

            String[] names = {"Paris,London, New York, Stockholm"};
            Arrays.sort(names);

            for (String name : names) {
                System.out.println("String Array : " + name);
            }

        }

        public static void ex4() {


            System.out.println("-----------");
            int[] firstArray = {1, 15, 20};

            // Create a second array with the same length as the first array
            int[] secondArray = new int[firstArray.length];

            // Copy elements from the first array to the second array
            for (int i = 0; i < firstArray.length; i++) {
                secondArray[i] = firstArray[i];
            }

            // Print elements from the first array
            System.out.print("Elements from first array: ");
            for (int element : firstArray) {
                System.out.print(element + " ");
            }

            // Print elements from the second array
            System.out.print("\nElements from second array: ");
            for (int element : secondArray) {
                System.out.print(element + " ");
            }


        }


        public static void ex5() {
            System.out.println("\n");
            int columns = 2;
            int rows = 2;

            String[][] newArray = new String[columns][rows];
            newArray[0][0] = "France";
            newArray[0][1] = "Paris";

            newArray[1][0] = "Sweden";
            newArray[1][1] = "Stockholm";

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.println(newArray[i][j]);
                }

            }
        }


        public static void ex6() {
            System.out.println("\n");
            int i, total;
            int[] a = {43, 5, 23, 17, 2, 14};
            int n = 5;
            total = 0;
            for (i = 0; i < n; i++) {
                total += a[i];
            }
            System.out.println("Average is: " + total / (float) n);
            {


            }
        }


        public static void ex7() {
            System.out.println("\n");
            int[] numbers = {1, 2, 4, 7, 9, 12};

            System.out.print("Odd Numbers: ");
            for (int number : numbers) {
                if (number % 2 != 0) {
                    System.out.print(number + " ");

                }
            }

        }}










