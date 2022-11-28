
public class PatikaDevRecursiveFibo {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    
    static int fibo(int f){
        if(f==1 || f == 2){
            return 1;
        }
    return fibo(f-1)+fibo(f-2);
    }
}
