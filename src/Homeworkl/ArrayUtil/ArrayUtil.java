package Homeworkl.ArrayUtil;

public class ArrayUtil {
    public static void main(String[] args) {
        //  տպել բոլոր էլեմենտները
        int[] Array = {2, 5, 9, 4, 90, 0, 45, 6, 76, 87};
        for (int i = 0; i < Array.length; i++) {

            System.out.print(Array[i] + " ");
        }
        System.out.println();
        //   տպել ամենամեծը
        int max = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > max)
                max = Array[i];

        }
        System.out.println("max = " + max);
        //Տպել ամենափոքրը
        int min = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < min)
                min = Array[i];

        }
        System.out.println("min = " + min);
        //տպել զույգերը

        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 == 0 && Array[i] != 0)
                System.out.print(Array[i] + "  ");

        }
        //տպել կենտերը
        System.out.println();
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 == 1 && Array[i] != 0)
                System.out.print(Array[i] + "  ");

        }
        System.out.println();
        //Տպել զույգերի քանակը
        int CountOfEvens = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] != 0 & Array[i] % 2 == 0) {
                CountOfEvens++;
            }
        }
        System.out.println("զույգերի քանակը = " + CountOfEvens);


        //Տպել զույգերի քանակը
        int CountOfodds = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] != 0 & Array[i] % 2 == 1) {
                CountOfodds++;
            }

        }
        System.out.println("զույգերի քանակը = " + CountOfodds);
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum = sum + Array[i];


        }

        System.out.println("sum = " + sum);
        int avg = sum / Array.length;
        System.out.println(avg);
    }



}