package com_hw2_run;

import com_hw2_model_vo.Circle;
import com_hw2_model_vo.Rectangle;

public class Run {
    public static void main(String args[]){
        Circle circle[] = new Circle[2];
        Rectangle rectangle[] = new Rectangle[2];
        circle[0] = new Circle(1,2,3);
        circle[1] = new Circle(3,3,4);
        rectangle[0] =new Rectangle(-1,-2,-5,-2);
        rectangle[1] =new Rectangle(-2,5,2,8);

        for(int i = 0; i<2; i++){
            circle[i].draw();
            rectangle[i].draw();
        }
    }
}
