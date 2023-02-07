public class CanConstruct_383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aaafd","aaabbf"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] record = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            record[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            record[ransomNote.charAt(i) - 'a']--;
        }

        for (int i = 0; i < record.length; i++) {
            if (record[i] < 0)
                return false;
        }
        return true;
    }
}
