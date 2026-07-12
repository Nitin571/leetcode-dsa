class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int helper[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            helper[i] = arr[i];
        }
        Arrays.sort(helper);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int i = 0; i < helper.length; i++) {
            if(!map.containsKey(helper[i])) {
                map.put(helper[i], rank);
                rank++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}