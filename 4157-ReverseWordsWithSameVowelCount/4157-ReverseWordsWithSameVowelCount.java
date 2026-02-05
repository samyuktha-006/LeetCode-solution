// Last updated: 2/5/2026, 10:17:36 AM
class Solution {
    public String reverseWords(String s) {
      String parivontel = s;

        
        String[] words = parivontel.split(" ");

        
        int targetVowelCount = countVowels(words[0]);

        
        for (int i = 1; i < words.length; i++) {
            if (countVowels(words[i]) == targetVowelCount) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }

        
        return String.join(" ", words);
    }

    
    private static int countVowels(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;  
    }
}