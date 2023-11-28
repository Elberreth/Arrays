package se.lexicon.Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysExercises {

    public static void main(String[] args) {

        ex1();
        indexOf();
        ex3();
        ex4();
        ex5();
    }

        public static void ex1 () {

            int[] numbers = {11, 23, 39};

            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);

            }
        }
            public static void indexOf(){
                System.out.println("--------");
                int[] numbers2 = {3, 4, 5, 12, 9};
                Arrays.sort(numbers2);
                int position = Arrays.binarySearch(numbers2, 5);
                System.out.println("Index position of number 5 is: " +position);
                System.out.println("_______");

            }

            public static void ex3() {

                String[] names = {"Paris,London, New York, Stockholm"};
                Arrays.sort(names);

                for (String name : names) {
                    System.out.println("String Array : " +name);
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
            

            }
        }