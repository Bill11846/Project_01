package com.bill.designmodol.principles.demo03.after;

/**
 * @Author: Bill
 * @Date: 2021/1/26
 * @Pro-name: Project_01
 * @Pck-name: com.bill.designmode.principles.demo03.after
 * @Desc: 硬盘接口
 */
public interface HardDisk {

    //存储数据
    public void save(String data);

    //获取数据
   public String get();
}
