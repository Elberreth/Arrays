package se.lexicon.Arrays;

public class ArrayExercises2 {
public class RemoveDuplicates {
    private static int[] removeDuplicates() {
        return removeDuplicates();
    }


    public static void main(String[] args) {

        ex8();
    }

        public static void ex8() {
            //    public static int[] removeDuplicates(int[] array) {
            int[] array = {20, 20, 40, 20, 30, 40, 50, 60, 50};

            // Print the original array
            System.out.print("Array: ");
            for (int element : array) {
                System.out.print(element + " ");
            }


            int[] arrayWithoutDuplicates = removeDuplicates();


            System.out.print("\nArray without duplicate values: ");
            for (int element : arrayWithoutDuplicates) {
                System.out.print(element + " ");

                for (int i = 0; i < array.length;i++){

                    for (int j = i + 1 ; j < array.length; j++) { // J is the next value in the Array
                        if (array[i] > array[j]){
                        }

                        int tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
        }}}}}}


