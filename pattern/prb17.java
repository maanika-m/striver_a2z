class prb17 {
    public static void main(String[] args) {
        int row =4;
        for(int i=1;i<=row;i++){
            
            for(int j=1; j<= row -i; j++){
                System.out.print(" ");
            }
            char alpha ='A';
            for(int j=1;j<=i; j++){
                System.out.print(alpha);
                alpha++;
            }
            alpha -= 2;
            for(int j=1;j<=i-1;j++){
                System.out.print(alpha);
                alpha--;
            }
        System.out.println(" ");    
        }
    }
    
}
