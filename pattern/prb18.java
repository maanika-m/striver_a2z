class prb18 {
    public static void main(String[] args) {
        int row = 5;
        char alpha = 'E';
        for(int i=1; i<=row; i++){

                char start = alpha;
                for(int j= 1;j<=i;j++){
                System.out.print(start+" ");
                start ++;
            }
            alpha--;
            System.out.println(" ");
        }    
    }
    
}
