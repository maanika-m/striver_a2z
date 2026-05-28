class prb8{
    void reverseArray(int A[], int start, int end){
        if (start >= end){
            return;
        }
        int temp = A[start];
        A[start] = A[end];
        A[end]=temp;
        reverseArray(A, start +1,end-1);
    }

    public static void main(String[] args) {
        prb8 obj = new prb8();
        int A[] = {1, 2 ,3 ,5};
        obj.reverseArray(A,0,A.length-1);
        for (int i=0;i< A.length;i++){
            System.out.print(A[i]+ " ");
        }
    }
}