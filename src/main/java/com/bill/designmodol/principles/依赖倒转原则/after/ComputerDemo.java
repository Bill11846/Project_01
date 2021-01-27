package com.bill.designmodol.principles.依赖倒转原则.after;

/**
 * @Author: Bill
 * @Date: 2021/1/26
 * @Pro-name: Project_01
 * @Pck-name: com.bill.designmode.principles.demo03.after
 * @Desc: 测试类
 */
public class ComputerDemo {
    public static void main(String[] args){

        //创建计算机的组件
        HardDisk disk = new XijieHarddisk();
        Cpu cpu = new AMDCpu();
        Memory memory = new KingstonMemory();

        //创建计算机对象
        Computer c = new Computer();

        //组装计算机
        c.setCpu(cpu);
        c.setDisk(disk);
        c.setMemory(memory);

        //运行计算机
        c.run();
    }
}
