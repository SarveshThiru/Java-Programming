class MatrixMultiplication{
    public static void main(String args[]){
        int [][] A={{1,2,3},{4,5,6}};
        int [][] B={{1,1},{2,2},{3,3}};
        if (A[0].length !=B.length){
            System.out.println("Incompatible ");
            return;
    
        }
        int[][] C=new int[A.length][B[0].length];
        for(int i=0;i<A.length;i++){
            for(int j =0;j<B[0].length;j++){
                C[i][j]=0;
                for(int k=0;k<A[0].length;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix (c):");
        for(int[] row:C){
            for(int element : row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}