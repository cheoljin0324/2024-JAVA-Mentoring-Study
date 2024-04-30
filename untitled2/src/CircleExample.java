public class CircleExample {
    int radius;
    String name;

    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args){
        CircleExample pizza;
        pizza = new CircleExample();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은" + area);

        CircleExample dount = new CircleExample();
        dount.radius = 2;
        dount.name = "자바 도넛";
        area = dount.getArea();
        System.out.println(dount.name + "의 면적은"+area);

    }
}
