class Pattern{
    public static void main(String[] args) {
        int rows=5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("1 ");
            }
            if(i<rows){
                for(int j=i-1;j>=1;j--){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }   
    }