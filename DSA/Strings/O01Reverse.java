package DSA.Strings;

public class O01Reverse {
    public static String reverse(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            str = ch + str;
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = reverse(str);
        System.out.println(reversed);
    }
}
