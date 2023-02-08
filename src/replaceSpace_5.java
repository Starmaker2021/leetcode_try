public class replaceSpace_5 {
    public String replaceSpace(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("  ");
            }
        }

        if (sb.length() == 0) {
            return s;
        }

        int left = s.length() - 1;
        s += sb.toString();
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left >= 0) {
            if (chars[left] == ' ') {
                chars[right--] = '%';
                chars[right--] = '0';
                chars[right] = '2';
            }
            else{
                chars[right] = chars[left];
            }
            left--;
            right--;
        }
        return new String(chars);
    }
}
