class Solution {
    public int findrow(int[][] matrix,int target){
        int low = 0;
        int high = matrix.length-1;
        int row = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(matrix[mid][0] <= target){
                row = mid;
                low = mid+1;
            }else{
                 high = mid-1;
            }
        }
        return row;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = findrow(matrix,target);
        if(row == -1){
            return false;
        }

        int low = 0;
        int high = matrix[0].length-1;
        while(low <= high){
            int mid = (low+high)/2;

            if(matrix[row][mid] == target){
                return true;
            }
            else if( matrix[row][mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
}