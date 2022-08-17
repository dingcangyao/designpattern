package com.yaoge.principle.openclose.old;

/**
 * create by yaoge
 * 2022/8/10 18:35
 */
public class Test {
    public static void main(String[] args) {
        //当我想要画一个图形
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        //画一个三角形
        graphicEditor.drawShape(new Triangle());

    }
}
