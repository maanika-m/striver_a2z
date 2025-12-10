public class prb10 {
    public static void main(String[] args) {
        int row1=5;
        for (int i= 1; i<=row1;i++){
            for(int j=1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        int row2=5;
        for(int i =1; i<= row2; i++){
            for (int j = 1; j<=row2-i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
