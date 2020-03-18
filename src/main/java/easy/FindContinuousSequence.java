package easy;
/*输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
*/
import java.util.ArrayList;
import java.util.List;

public class FindContinuousSequence {
    public int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<>();
        int left = 1;
        int right = 2;
        int sum = left + right;
        while (left < right && right < target) {
            if (sum > target) {
                sum -= left;
                left++;
            } else if (sum < target) {
                right++;
                sum += right;
            } else {
                int[] arr = new int[right - left + 1];
                for (int i = 0; i < right - left + 1; i++) {
                    arr[i] = left + i;
                }
                list.add(arr);
                sum -= left;
                left++;
            }
        }
        return list.toArray(new int[0][]);
    }
}
