import java.util.Scanner;
public class prbPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number");
        int num = sc.nextInt();

        if (num <= 1){
            System.out.println("not Prime");
            return;
        }

        boolean isPrime = true;

        for (int i=2; i<= num-1; i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("number is Prime");
        }else{
            System.out.println("number is not Prime");

        }

    }
    
}
