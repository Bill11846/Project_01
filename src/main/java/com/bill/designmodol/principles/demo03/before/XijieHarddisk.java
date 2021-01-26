package com.bill.designmodol.principles.demo03.before;

/**
 * @Author: Bill
 * @Date: 2021/1/26
 * @Pro-name: Project_01
 * @Pck-name: com.bill.designmode.principles.demo03.before
 * @Desc: 希捷硬盘
 */
public class XijieHarddisk {
    //存储数据的方法
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    public String get() {
        System.out.println("使用希捷细节硬盘获取数据");
        return "数据";
    }
}
