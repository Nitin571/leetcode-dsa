class Solution {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;        

        Node(){     
            for(int i=0;i<26;i++){
                children[i] = null;            
            }
        }
    }

    public Node root = new Node();
    public String ans = "";
    public  void insert(String word){         
        Node curr = root;
        for(int level = 0;level<word.length();level++){         
            int idx = word.charAt(level) - 'a';    
            
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();        
            }

            curr = curr.children[idx];      
        }

        curr.eow = true;        
    }
    public void longestWord(Node root, StringBuilder temp){

        if(root == null){

            return;
        }

        for(int i = 0; i < 26; i++){

            if(root.children[i] != null &&
               root.children[i].eow == true){

                char ch = (char)(i + 'a');

                temp.append(ch);

                if(temp.length() > ans.length()){

                    ans = temp.toString();
                }

                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
    public String longestWord(String[] words) {
        ans = "";
        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }
        longestWord(root, new StringBuilder());

        return ans;
    }
}