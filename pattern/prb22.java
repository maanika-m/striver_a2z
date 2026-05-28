class prb22 {
    public static void main(String[] args) {
        int row =7;
        int column=7;
        for(int i=1; i<=row; i++){
            for(int j=1;j<=column;j++){
            if(i==1 || i==row || j==1 || j==column){
                System.out.print("4");
            }
            if(i==2 || i==row-1 || j==2 || j==column-2){
                System.out.print("3022");
            }

            }
        }
    }
    
}
