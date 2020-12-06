package pract15;

public class Main {

    public static void main(String[] args) {
        int[] test = new int[10];

        System.out.println(test.length);
        test[0] = 1;
        test[1] = 2;
        for (int item : test)
            System.out.println(item);
    }
}
