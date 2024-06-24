import java.util.*;

class Demo{
    public static void main(String []args){
        int n = 5;
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for(int i = 0;i<n;i++){
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}