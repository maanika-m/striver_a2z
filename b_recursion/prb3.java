class prb3{
    void printN(int N){
        if (N==0){
            return;
        }
        printN(N-1);
        System.out.println(N);
        
    }

    public static void main(String[] args) {
        prb3 obj = new prb3();
        obj.printN(5);
    }
}