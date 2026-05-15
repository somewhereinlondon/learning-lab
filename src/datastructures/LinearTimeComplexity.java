package datastructures;

public class LinearTimeComplexity {

    public static void main(String[] args) {
     printItems(10);

    }


    public static void printItems(int n) {
        // We are defining a static method
        for(int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}
