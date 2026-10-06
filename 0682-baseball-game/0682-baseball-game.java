class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            String a = operations[i];
            if(a.equals("C")){
                st.pop();
            }else if(a.equals("D")){
                st.push(2*st.peek());
            }else if(a.equals("+")){
                int b = st.pop();
                int c = st.peek();
                st.push(b);
                st.push(b+c);
            }else{
                st.push(Integer.parseInt(a));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}