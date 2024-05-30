public class OverloadingTest {

    public static void print(){
        System.out.println("매개변수 X - 오버로딩1");
    }

    public static String print(Integer a) {
        System.out.println("Integer - 오버로딩2");
        return a.toString();
    }

    public static void print(String a){
        System.out.println("String - 오버로딩3");
        System.out.println(a);
    }

    public static String print(Integer a, Integer b){
        System.out.println("Integer, Integer - 오버로딩4");
        return a.toString() + b.toString();
    }

    public static void main(String[] args){
        print();
        print(10);
        print("안녕하세요");
        print(1,2);
    }
}
