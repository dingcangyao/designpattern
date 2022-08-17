package com.yaoge.principle.openclose.improve;

/**
 * create by yaoge
 * 2022/8/10 18:27
 */
public abstract class Shape {

    //定义一个抽象方法
    public abstract void draw();
}

class Rectangle extends Shape {


    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("画一个圆形");

    }
}

//当想要添加一种类型，只需要在子类中实现自己的方法就可以了
class  Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("画一个三角形");
    }
}

//这是一个用于绘图的类【使用方】
class GraphicEditor{

    public void  drawShape(Shape s){
       s.draw();
    }


}