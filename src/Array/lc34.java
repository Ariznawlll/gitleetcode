package Array;

public class lc34 {
    public static void main(String[] args) {
        int nums[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        Solution solution = new Solution();
        int[] ints = solution.get(nums, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + "  ");
        }
    }
}

class Solution {
    public int[] get(int nums[], int target) {
        int len = nums.length;
        if (len == 0) {
            return new int[]{-1, -1};
        }
        int first = getStartAndEnd(nums, target);
        if (first == -1) {
            return new int[]{-1,-1};
        }

        int last = getLastAndEnd(nums, target);
        return new int[]{first, last};
    }

    public int getStartAndEnd(int nums[], int target) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        if (nums[low] == target) {
            return low;
        } else {
            return -1;
        }
    }

    public int getLastAndEnd(int nums[], int target) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (low + high + 1) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;   //因为中间位置是目标元素出现的位置，因此目标元素的左边
                                // 一定不是目标元素出现的最后一个位置
            } else {
                low = mid;
            }
        }
        return low;
    }
}
