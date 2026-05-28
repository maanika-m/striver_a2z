class prb4{
    void printN(int N){
        if (N==0){
            return;
        }
        System.out.println(N);
        printN(N-1);      
    }

    public static void main(String[] args) {
        prb4 obj = new prb4();
        obj.printN(5);
    }
}