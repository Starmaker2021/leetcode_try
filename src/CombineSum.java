import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombineSum {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTacking(n, k, 1, 0);
        return result;
    }

    private void backTacking(int targetSum, int k, int startIndex, int sum) {
        if (sum > targetSum) {
            return;
        }

        if (path.size() == k) {
            if (sum == targetSum) result.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
            path.add(i);
            sum += i;
            backTacking(targetSum, k, i + 1, sum);
            path.removeLast();
            sum -= i;
        }
    }
}
