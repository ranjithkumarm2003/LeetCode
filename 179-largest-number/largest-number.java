class Solution {
     public String largestNumber(int[] nums) {
        // Convert each integer to a string
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort the strings based on custom comparator
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Sort in descending order
            }
        });

        // Edge case: if the largest number is "0", return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Build the largest number from the sorted array
        StringBuilder largestNumber = new StringBuilder();
        for (String num : strNums) {
            largestNumber.append(num);
        }

        return largestNumber.toString();
    }
}