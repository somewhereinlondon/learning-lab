
package datastructures;

import java.util.HashSet;

public class Big0Ex3 {

    public static void main(String[] args) {

        int[] array = {3, 7, 2, 5, 1};
        int target = 10;

        System.out.println(hasPairWithSum(array, target)); // true — 3+7=10

        int[] array2 = {1, 2, 3, 4};
        int target2 = 20;

        System.out.println(hasPairWithSum(array2, target2)); // false — no pair makes 20
    }


    static boolean hasPairWithSum(int[] array, int target) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {

            int complement = target - array[i];

            if (set.contains(complement)) {

                return true;
            } else {
                set.add(array[i]);
            }


        }
        return false;
    }

}





