class prb5{
    int printN(int N){
        if (N==0){
            return 0;
        }
        return N + printN(N-1);
    }

    public static void main(String[] args) {
        prb5 obj = new prb5();
        int ans = obj.printN(5);
        System.out.println(ans);
    }
}