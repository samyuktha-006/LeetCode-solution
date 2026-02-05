// Last updated: 2/5/2026, 10:18:17 AM
class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int q = queries.length;
        int[] answer = new int[q];

        for (int i = 0; i < q; i++) {
            int k = queries[i][0];
            int trim = queries[i][1];

            List<String[]> trimmedList = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                String trimmed = nums[j].substring(nums[j].length() - trim);
                trimmedList.add(new String[]{trimmed, String.valueOf(j)});
            }

            
            trimmedList.sort((a, b) -> {
                int cmp = a[0].compareTo(b[0]);
                if (cmp == 0) {
                    return Integer.parseInt(a[1]) - Integer.parseInt(b[1]);
                }
                return cmp;
            });

            
            answer[i] = Integer.parseInt(trimmedList.get(k - 1)[1]);
        }

        return answer;
 
    }
}