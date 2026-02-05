// Last updated: 2/5/2026, 10:18:28 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0; i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j || (i+j)==(mat.length-1)){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}