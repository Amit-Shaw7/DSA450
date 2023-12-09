package RecursionBasic;

public class O07CheckPalindome {
    public static void main(String[] args) {
        String str = "hkh";
        System.out.println(checkPalindrome(str , 0 , str.length() - 1));
    }

    public static boolean checkPalindrome(String str , int st , int end) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        if (str.charAt(st) != str.charAt(end)) {
            return false;
        }

        if(st >= end){
            return true;
        }

        return checkPalindrome(str , st + 1 , end - 1);
    }
}
