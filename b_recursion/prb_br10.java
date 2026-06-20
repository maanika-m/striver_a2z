import java.util.Scanner;
class prb_br10{
    void fibonacci(int n, int A[]){
        if(n==0){
            A[0]=0;
            return;
        }
        if(n==1){
            A[0]=0;
            A[1]=1;
            return;
        }
        fibonacci(n-1,A);  
        A[n]= A[n-1]+A[n-2];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int A[] = new int[n];
        prb_br10 obj = new prb_br10();
        obj.fibonacci(n-1, A);
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
    }
}       
