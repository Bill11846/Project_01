package com.bill.designmodol.principles.里氏代换原则.before;

/**
 * @Author: Bill
 * @Date: 2021/1/26
 * @Pro-name: Project_01
 * @Pck-name: com.bill.designmode.principles.demo02
 * @Desc: 测试类
 */
public class RectangleDemo {
    public static void main(String[] args) {
        //创建 长方形对象
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        RectangleDemo.resize(r);
        RectangleDemo.printLengthAndWidth(r);

        System.out.println("===============================");

        //创建正方形对象
        Square s = new Square();
        s.setLength(10);
        RectangleDemo.resize(s);
        RectangleDemo.printLengthAndWidth(s);
    }

    //扩宽方法
    public static void resize(Rectangle rectangle) {
        //判断 宽比长小 进行扩宽操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    //Print
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }

}
