package Basics;

public class O05ArmstrongNum {
    public static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        int original = num;
        int nnoOfDigits = 0;

        while(temp > 0){
            temp = temp / 10;
            nnoOfDigits++;
        }

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, nnoOfDigits);
            num /= 10;
        }
        System.out.println(sum + " " + num);
        if (sum == original) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 1634;
        System.out.println(isArmstrong(num));
    }
}
