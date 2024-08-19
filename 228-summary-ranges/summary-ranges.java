class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> li = new ArrayList<>();
        int st = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                if (i == st) {
                    String str = String.valueOf(nums[st]);
                    li.add(str);

                } else {
                    String n1 = String.valueOf(nums[st]);
                    String n2 = String.valueOf(nums[i]);
                    String s = n1 + "->" + n2;
                    li.add(s);
                    st = i + 1;
                }
                break;
            }
            if (nums[i] + 1 == nums[i + 1]) {
                continue;
            } else {

                if (i == st) {
                    String str = String.valueOf(nums[st]);
                    li.add(str);
                    st=i+1;

                } else {
                    String n1 = String.valueOf(nums[st]);
                    String n2 = String.valueOf(nums[i]);
                    String s = n1 + "->" + n2;
                    li.add(s);
                    st = i + 1;
                }
            }
        }
        return li;
    }
}