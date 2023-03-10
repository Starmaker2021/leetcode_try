public class MonotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int N) {
        String[] strings = (N + "").split("");
        int flag = strings.length;
        for (int i = strings.length - 1; i > 0; i--) {
            if (Integer.parseInt(strings[i])<Integer.parseInt(strings[i-1])){
                strings[i-1]=(Integer.parseInt(strings[i-1])-1)+"";
                flag = i;
            }
            for (int j = flag; j < strings.length; j++) {
                strings[i]="9";
            }
        }
        return Integer.parseInt(String.join("",strings));
    }
}
