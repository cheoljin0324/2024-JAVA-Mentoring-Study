import java.util.Arrays;

class method1{
    public int practice1(int start,int limit){
        int result = 0;
        for(int i = start; i <= limit; i++){
            result += i;
        }
        return result;
    }
}

public class Method_03 {
    public static void main(String[] args){
        method1 m1 = new method1();
        int output = m1.practice1(1,10);
        System.out.println(output);
    }
}
