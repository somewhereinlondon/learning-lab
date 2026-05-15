package datastructures;

public class nsqaured {

    public static void main(String[] args) {
       printitems(4);
    }

    static void printitems(int n) {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.println(i + " " + j);
            }
        }
    }


}
