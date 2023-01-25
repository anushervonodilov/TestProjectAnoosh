package Exercises;

public class LoopFromOneToOneHundred {
    public static void main(String[] args) {

        int num1 = 1;

        while (num1 <= 100) {
            System.out.println(num1);
            num1++;
        }

        int num2 = 100;

        while (num2 >= 1) {
            System.out.println(num2);
            num2--;
        }

        int num3 = 1;

        while (num3 <= 15) {
            if (num3 % 2 != 0) {
                System.out.println(num3);
            }
            num3++;
        }

        int num4 = 1;

        while (num4 <= 50) {
            if (num4 % 5 == 0) {
                System.out.println(num4);
            }
            num4++;
        }

        int num5 = 1;

        while (num5 <= 20) {

            if (num5 % 2 == 0) {
                System.out.println(num5);
            }
            num5++;
        }

        int num6 = 20;

        while (num6 <= 50) {
            if (num6 % 2 != 0) {
                System.out.println(num6);
            }
            num6++;
        }


    }
}
