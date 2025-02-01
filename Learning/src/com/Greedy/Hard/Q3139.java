package com.Greedy.Hard;

public class Q3139 {
    public int minCostToEqualizeArray(int[] nums, int cost1, int cost2) {
        int maxInArray = nums[0], minInArray = nums[0], n = nums.length, mod = 1000000007;
        long total = 0;
        for (int a : nums) {
            minInArray = Math.min(minInArray, a);
            maxInArray = Math.max(maxInArray, a);
            total += a;
        }
        total = 1l * maxInArray * n - total;

        // case 1
        if (cost1 * 2 <= cost2 || n <= 2) {
            return (int) ((total * cost1) % mod);
        }

        // case 2
        long op1 = Math.max(0L, (maxInArray - minInArray) * 2L - total);
        long op2 = total - op1;
        long res = (op1 + op2 % 2) * cost1 + op2 / 2 * cost2;

        // case 3
        total += op1 / (n - 2) * n;
        op1 %= n - 2;
        op2 = total - op1;
        res = Math.min(res, (op1 + op2 % 2) * cost1 + op2 / 2 * cost2);

        // case 4
        for (int i = 0; i < 2; i++) {
            total += n;
            res = Math.min(res, total % 2 * cost1 + total / 2 * cost2);
        }
        return (int) (res % mod);
    }
}
