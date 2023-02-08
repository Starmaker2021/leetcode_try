public class ReserveLeftWords_58 {
    public static void main(String[] args) {
        reverseLeftWords("abcdefg",2);

    }
    public static void reverseLeftWords(String s, int n) {
        s=reverseString(s, 0, n - 1);
        s=reverseString(s,n,s.length()-1);
        s=reverseString(s,0,s.length()-1);
        System.out.println(s);
    }

    public static String reverseString(String s, int sta, int en) {
        int start = sta;
        int end = en;
        char[] chars = s.toCharArray();
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        return new String(chars);
    }
}

