package ua.org.oa.evlashdv.lecture5.array;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] ints = new int[5];
        System.out.println(Arrays.toString(ints));
        int[] intArray = {5,5,5,6,3,2,2};
        System.out.println(Arrays.toString(intArray));
        int[] ints1;
        ints1 = new int[]{2,5,6,3,2,1};
        System.out.println(Arrays.toString(ints1));

        System.out.println(ints1[3]);
        System.out.println(ints1[3] = 5);
        System.out.println(Arrays.toString(ints1));

        for (int i = 0; i < ints1.length; i++) {
            System.out.println(ints1[i]);
        }

        for (int i : ints1) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(args));

        System.out.println(args[1] + 15);
        System.out.println(Integer.parseInt(args[1]) + 15);

        int[][] ints2 = {{2,3,4},{1,1},{},null,{1,2,3,4,5,6}};

        System.out.println(Arrays.deepToString(ints2));

        ints2[1][1] = 5;
        System.out.println(Arrays.deepToString(ints2));

        ints2[3] = new int[]{7,7,7};
        System.out.println(Arrays.deepToString(ints2));

        for (int[] ints3 : ints2) {
            for (int i : ints3) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
