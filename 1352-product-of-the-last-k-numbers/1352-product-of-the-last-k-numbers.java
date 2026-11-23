class ProductOfNumbers {
    ArrayList<Integer> al;
    public ProductOfNumbers() {
        al = new ArrayList<>();
    }
    
    public void add(int num) {
        al.add(num);
    }
    
    public int getProduct(int k) {
        int pdt = 1;
        for(int i=al.size()-1;i>=al.size()-k;i--){
            pdt *= al.get(i);
        }
        return pdt;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */