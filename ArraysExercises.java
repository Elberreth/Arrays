package se.lexicon.Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysExercises {

    public static void main(String[] args) {

        ex1();
        indexOf();
        ex3();

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
                    System.out.println(name);
                }

    }
        }