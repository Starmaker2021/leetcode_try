import java.util.ArrayDeque;

public class RemoveDuplicates_1047 {
    public String removeDuplicates(String S) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char ch;
        for (int i = 0; i < S.length(); i++) {
            ch = S.charAt(i);
            if(deque.isEmpty()||deque.peek()!=ch){
                deque.push(ch);
            }else{
                deque.pop();
            }
        }
        String str = " ";
        while(!deque.isEmpty()){
            str = deque.pop()+str;
        }
        return str;
    }
}
