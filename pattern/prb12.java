class prb12 {
    public static void main(String[] args) {
        int row = 4;
        for(int i=1; i<= row; i++){
            
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            int space = 2*(row-i);
            for(int j=1; j<= space; j++){
                System.out.print(" ");
            }
            for(int j=i; j>= 1; j-- ){
                System.out.print(j);
            }
        System.out.println(" ");  
        }
    }
}
