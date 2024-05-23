import java.sql.SQLOutput;

class Calculator{
    static int base = 0;
    int a,b;

    public void SetOperator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void Sum(){
        System.out.println(this.a+this.b);
        System.out.println(a+b);
    }

    public void Avg(){
        System.out.println((this.a+this.b)/2);
        System.out.println((a+b)/2);
    }

}



public class Method_04 {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        System.out.println(calculator.a);
        System.out.println(calculator.b);

        calculator.SetOperator(10,20);
        calculator.Sum();
        calculator.Avg();
    }
}
