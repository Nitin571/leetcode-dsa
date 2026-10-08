class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            char ch = expression.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*'){
                String leftPart = expression.substring(0, i);
                String rightPart = expression.substring(i + 1);

                List<Integer> left = diffWaysToCompute(leftPart);
                List<Integer> right = diffWaysToCompute(rightPart);

                for(int l : left){
                    for(int r : right){
                        if(ch == '+'){
                            result.add(l+r);
                        }else if(ch == '-'){
                            result.add(l-r);
                        }else{
                            result.add(l*r);
                        }
                    }
                }
                
            }
        }
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }
        
        return result;
    }
}