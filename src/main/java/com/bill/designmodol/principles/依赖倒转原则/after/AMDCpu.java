package com.bill.designmodol.principles.依赖倒转原则.after;

/**
 * @Author: Bill
 * @Date: 2021/1/26
 * @Pro-name: Project_01
 * @Pck-name: com.bill.designmode.principles.demo03.after
 * @Desc: AMD Cpu
 */
public class AMDCpu implements Cpu {

    public void run() {
        System.out.println("使用AMD cpu");
    }

}
