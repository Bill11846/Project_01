package com.bill.designmodol.principles.demo03.before;

/**
 * @Author: Bill
 * @Date: 2021/1/26
 * @Pro-name: Project_01
 * @Pck-name: com.bill.designmode.principles.demo03.before
 * @Desc: 计算机类
 */
public class Computer {
    private XijieHarddisk harddisk;
    private IntelCpu cpu;
    private KingstonMemory memory;

    public XijieHarddisk getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(XijieHarddisk harddisk) {
        this.harddisk = harddisk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public void run() {
        System.out.println("运行计算机");
        String data = harddisk.get();
        System.out.println("从硬盘上获取的数据是：" + data);
        cpu.run();
        memory.save();
    }
}
