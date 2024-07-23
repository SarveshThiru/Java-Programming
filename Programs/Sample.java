class Sample{
    public static void main(String args[]){
        int a[][]={
            {1,2,3},{4,5,6}
        };
        int len=a.length;
        for(int i=0; i<len;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
        System.out.println(" ");
    }
}