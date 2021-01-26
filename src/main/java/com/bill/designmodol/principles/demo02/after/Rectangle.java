package com.bill.designmodol.principles.demo02.after;

/**
 * @Author: Bill
 * @Date: 2021/1/26
 * @Pro-name: Project_01
 * @Pck-name: com.bill.designmode.principles.demo02.after
 * @Desc: 长方形
 */
public class Rectangle implements Quadrilateral{
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
       return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
