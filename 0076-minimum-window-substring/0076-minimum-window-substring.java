class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int count = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        for(int right = 0;right<s.length();right++){
            char ch = s.charAt(right);
            window.put(ch,window.getOrDefault(ch,0)+1);

            if(map.containsKey(ch) && window.get(ch) <= map.get(ch)){
                count++;
            }

            while(count == t.length()){
                if(right-left+1 < minLength){
                    minLength = right-left+1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                if(map.containsKey(leftChar) && window.get(leftChar) < map.get(leftChar)){
                    count--;
                }
                left++;
            }

        }
        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start,start+minLength);
    }
}