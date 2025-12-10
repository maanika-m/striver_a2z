class prb9{
    public static void main(String[] args) {
        int row1 = 5;
        for (int i=1; i<=row1;i++){
            for(int j=1; j<=row1-i;j++){
                System.out.print(" ");
            }
            for (int j=1; j<= 2*i -1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }   
        int row2 = 5;
        for (int i=1; i<= row2; i++){
            for (int j=1; j<= i-1; j++){
                System.out.print(" ");
            }
            for (int j=1; j<= 2*(row2-i)+1; j++){
                System.out.print("*");
            }    
            
            
            System.out.println(" ");
        }
    }
}