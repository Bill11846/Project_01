package com.bill.designmodol.principles.闭合原则;

/**
 * @Author: Bill
 * @Date: 2021/1/26
 * @Pro-name: Project_01
 * @Pck-name: com.bill.designmode.principles.demo01
 * @Desc:测试皮肤类
 */
public class Client {
    public static void main(String[] args) {
        //创建SOUGOU输入法对象
        SougouInput input = new SougouInput();
        //创建皮肤对象
        //DefaultSkin skin = new DefaultSkin();
       // HeimaSkin skin = new HeimaSkin();
        ChuanzhiSkin skin = new ChuanzhiSkin();
        //将皮肤对象设置到输入法中
        input.setSkin(skin);
        //显示皮肤
        input.display();
    }
}
