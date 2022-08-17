package com.yaoge.principle.openclose.old;

/**
 * create by yaoge
 * 2022/8/10 18:27
 */
public class Shape {
    int m_type;
}
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}
class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}
//当想要添加一种类型，还需要去更改 GraphicEditor  ，这样就很不好
class  Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}

//这是一个用于绘图的类【使用方】
class GraphicEditor{
    //接收Shape 对象，然后根据type，来绘制不同的图形
    public void  drawShape(Shape s){
        if (s.m_type==1){
            drawRectangle(s);
        }else if (s.m_type==2){
            drawCirlcle(s);
        }else if (s.m_type==3){
            drawTriangle(s);
        }
    }

    private void drawTriangle(Shape s) {
        System.out.println("绘制三角形");
    }

    //这些都是已有的
    private void drawCirlcle(Shape s) {
        System.out.println("绘制圆形");
    }

    private void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }
}