class A{
    int v = 10;

    void m(){
        int v = 20;
        System.out.println(v);
        System.out.println(this.v);
    }

}

public class Method_05 {
    public static void main(String[] args){
        A a = new A();
        a.m();
    }
}
