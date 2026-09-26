class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for (int i=0; i<knowledge.size(); i++) {
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                i++;
                StringBuilder sub = new StringBuilder();
                while(s.charAt(i) != ')'){
                    sub.append(s.charAt(i));
                    i++;
                }
                String a = sub.toString();
                if(map.containsKey(a)){
                    sb.append(map.get(a));
                }else{
                    sb.append('?');
                }
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}