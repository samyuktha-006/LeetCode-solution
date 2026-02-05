// Last updated: 2/5/2026, 10:18:19 AM
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<String, Long> ratioCount = new HashMap<>();
        
        for (int[] rect : rectangles) {
            int w = rect[0], h = rect[1];
            int g = gcd(w, h);
            int rw = w / g;
            int rh = h / g;
            
            // Use string key "rw/rh" to represent ratio
            String key = rw + "/" + rh;
            ratioCount.put(key, ratioCount.getOrDefault(key, 0L) + 1);
        }
        
        long result = 0;
        for (long count : ratioCount.values()) {
            result += count * (count - 1) / 2;
        }
        
        return result;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;


    }
}