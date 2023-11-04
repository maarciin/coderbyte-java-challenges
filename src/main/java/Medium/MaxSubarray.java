package Medium;

class MaxSubarray {
    public static void main(String[] args) {
        int[] nums = {4, -3, 5, 7, -9, 2, 3};
        int maxSubarraySum = getMaxSubarray(nums);
        System.out.println(maxSubarraySum);
    }

    //brute force
    public static int getMaxSubarray(int[] intArray) {
        int maxSum = Integer.MIN_VALUE;
        int length = intArray.length;
        for (int i = 0; i < length; i++) {
            int currentSum = 0;
            for (int j = i; j < length; j++) {
                currentSum += intArray[j];
                maxSum = Math.max(currentSum, maxSum);
            }
        }
        return maxSum;
    }

    //Kadane's algorithm
    public static int getMaxSubarrayKadane(int[] intArray) {
        int currentMaxSum = intArray[0];
        int overallMaxSum = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            currentMaxSum = Math.max(currentMaxSum + intArray[i], intArray[i]);
            overallMaxSum = Math.max(currentMaxSum, overallMaxSum);
        }
        return overallMaxSum;
    }
}
