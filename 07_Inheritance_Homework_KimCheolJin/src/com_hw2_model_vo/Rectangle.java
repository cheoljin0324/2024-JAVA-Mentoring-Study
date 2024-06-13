package com_hw2_model_vo;

public class Rectangle extends Point {
    public int x = 0;
    public int y = 0;
    public double width = 0.0;
    public double height = 0.0;
    public Rectangle(){
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int x, int y, double width, double height){
        this.x = x;
        this.y= y;
        this.width = width;
        this.height =height;
    }

    public void draw(){
        super.draw();
        System.out.println("사각형 면적:"+(width*height));
        System.out.println("사각형 둘레:"+(2*(width+height)));
    }
}
