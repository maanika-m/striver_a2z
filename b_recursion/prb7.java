class prb7{
    int calcFactorial(int N){
        if(N==0){
            return 1;
        }
        return N * calcFactorial(N-1);
    }

    public static void main(String[] args) {
        prb7 obj = new prb7();
        int ans = obj.calcFactorial(5);
        System.out.println(ans);
    }
}