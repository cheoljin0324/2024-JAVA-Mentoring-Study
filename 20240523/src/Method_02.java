class methodTest{
    public int print(int a, int b, int c, int d){

        return a+b+c+d;
    }
}

public class Method_02 {
    public static void main(String[] args){
        methodTest mTest = new methodTest();
        System.out.println(mTest.print(15, 10, 1, 3));
    }
}
