package com_hw2_model_vo;

public class Point {
    public int x = 0;
    public int y = 0;

    public Point(){
        this.x=0;
        this.y=0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    protected void draw(){
        System.out.println(x+","+y);
    }
}
