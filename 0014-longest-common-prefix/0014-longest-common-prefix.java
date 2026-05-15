class Solution {
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;

        Node(){
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word){

        Node curr = root;

        for(int i = 0; i < word.length(); i++){

            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }
    public static int countChildren(Node node){

        int count = 0;

        for(int i = 0; i < 26; i++){

            if(node.children[i] != null){
                count++;
            }
        }

        return count;
    }

    public String longestCommonPrefix(String[] strs) {
        root = new Node();
        
        for(int i = 0; i < strs.length; i++){
            insert(strs[i]);
        }

        String ans = "";

        Node curr = root;

        while(countChildren(curr) == 1 && curr.eow == false){
            for(int i = 0; i < 26; i++){

                if(curr.children[i] != null){

                    ans += (char)(i + 'a');

                    curr = curr.children[i];

                    break;
                }
            }
        }
        return ans;
    }
}