class Sample{
    public int a;
    private int b;
    int c;
}

public class Example_0430_2 {
    public static void main(String[] args){
        Sample aClass = new Sample();
        aClass.a = 10;
        //aClass.b = 10; private라서 오류 나온다.
        aClass.c = 10;
    }
}
