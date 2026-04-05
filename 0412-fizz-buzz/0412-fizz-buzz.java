class Solution {
    ArrayList<String> al = new ArrayList<>();
    public List<String> fizzBuzz(int n) {
        for(int i=1;i<=n;i++){
            if(i%3 == 0 && i%5 == 0){
            al.add("FizzBuzz");
            } else if(i%3 == 0){
                al.add("Fizz");
            } else if(i%5 == 0){
                al.add("Buzz");
            } else{
                al.add(String.valueOf(i));
            }
        }
        
        return al;
    }
}