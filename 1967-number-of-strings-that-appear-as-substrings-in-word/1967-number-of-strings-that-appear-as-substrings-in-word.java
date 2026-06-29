class Solution {
    public int numOfStrings(String[] patterns, String word) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                set.add(word.substring(i, j));
            }
        }

        int count = 0;
        for (String p : patterns) {
            if (set.contains(p)) {
                count++;
            }
        }
        return count;
    }
}