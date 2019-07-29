class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        if(A.length==0) return A;
        if(A[0].length==0) return A;
        int length = A[0].length;
        int[][] result = new int[A.length][length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<length;j++){
                if(A[i][j]==1) result[i][length-j-1]=0;
                else result[i][length-j-1]=1;
            }   
        }
        return result;
    }
}
