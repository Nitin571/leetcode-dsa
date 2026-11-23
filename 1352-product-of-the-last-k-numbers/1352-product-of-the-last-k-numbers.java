class ProductOfNumbers {
    ArrayList<Integer> al;

    public ProductOfNumbers() {
        al = new ArrayList<>();
        al.add(1);
    }
    public void add(int num) {
        if(num == 0) {
            al.clear();
            al.add(1);
        }
        else {
            al.add(al.get(al.size()-1) * num);
        }
    }
    public int getProduct(int k) {
        int n = al.size();

        if(k >= n) {
            return 0;
        }
        return al.get(n-1) / al.get(n-1-k);
    }
}