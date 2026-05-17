package datastructures;

public class BigOEx2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        System.out.println(method1(arr1));
        method2(arr1);
        method3(arr1);
        method4(arr1, arr2);
    }

    // O(1) — directly accesses index 0,
    // no matter the size of the array it is always one operation
    static int method1(int[] array) {
        return array[0];
    }

    // O(n) — one loop, operations grow
    // proportionally with array size
    static void method2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // O(n²) — loop inside a loop,
    // both depend on the same input
    static void method3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + " " + array[j]);
            }
        }
    }

    // O(a + b) — two separate loops on different inputs,
    // operations are added not multiplied
    static void method4(int[] array, int[] array2) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}