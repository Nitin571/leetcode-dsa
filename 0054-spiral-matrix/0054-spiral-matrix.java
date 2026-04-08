class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> al = new ArrayList<>();
        int strow = 0;
        int endrow = matrix.length-1;
        int stcol = 0;
        int endcol = matrix[0].length-1;

        while(strow <= endrow && stcol <= endcol){

            for(int i=stcol;i<=endcol;i++){
                al.add(matrix[strow][i]);
            }
            for(int i=strow+1; i<=endrow;i++){
                al.add(matrix[i][endcol]);
            }

            for(int i=endcol-1;i>=strow;i--){
                if(strow == endrow){
                    break;
                }
                al.add(matrix[endrow][i]);
            }
            for(int i=endrow-1;i>=strow+1;i--){
                if(stcol == endcol){
                    break;
                }
                al.add(matrix[i][stcol]);
            }
            strow++;
            endrow--;
            stcol++;
            endcol--;
        }
        return al;
    }
}