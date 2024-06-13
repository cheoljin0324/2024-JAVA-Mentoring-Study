package com_hw2_model_vo;

public class Circle extends Point {
    double PI = 3.141592;
    public int x = 0;
    public int y = 0;
    public int radius = 0;
    public Circle(){
        this.x=0;
        this.y=0;
        this.radius = 0;
    }

    public Circle(int x, int y, int radius){
        this.x= x;
        this.y = y;
        this.radius = radius;
    }

    public void draw(){
        super.draw();
        System.out.println("원의 면적: " + (PI*(radius/2)*(radius/2)));
        System.out.println("원의 둘레: " +(PI*(radius/2)*2));
    }

}
