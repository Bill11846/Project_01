package com.bill.designmodol.principles.demo03.before;

/**
 * @Author: Bill
 * @Date: 2021/1/26
 * @Pro-name: Project_01
 * @Pck-name: com.bill.designmode.principles.demo03.before
 * @Desc: 测试类
 */
public class ComputerDemo {
    public static void main(String[] args) {
        //创建组件对象
        XijieHarddisk harddisk = new XijieHarddisk();
        IntelCpu cpu = new IntelCpu();
        KingstonMemory memory = new KingstonMemory();
        //创建计算机对象
        Computer c = new Computer();
        //组装计算机
        c.setCpu(cpu);
        c.setHarddisk(harddisk);
        c.setMemory(memory);

        //运行计算机
        c.run();


    }
}
