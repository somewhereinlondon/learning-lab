package datastructures;

import java.util.ArrayList;

public class Big0EX4 {


    public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList<>();

                // add some starting values
                list.add(10);
                list.add(20);
                list.add(30);
                list.add(40);
                list.add(50);

                // now demonstrate each operation below
                // add a comment next to each with the Big O and why

               // 1. Access an element by index
                list.get(5);//0(1) becuase index can be accesed directly

                // 2. Add to the end of the list
                list.add(60);//0(1) only requires one operation no matter the input size
                // 3. Add to the middle of the list
                list.add(3,40);//0(n) all numbers after the added middle number has to be shifted to the right but doesnt depend on input size . .

                // 4. Remove from the middle of the list
                 list.remove(4);//0(n)
                // 5. Search for a value with .contains()
                 list.contains(40);//(0)n
            }



}
