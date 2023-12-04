package Basics;

public class O06AllDivors {
    public static void printAllDivors(int num) {
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int num = 12;
        printAllDivors(num);
    }
}
