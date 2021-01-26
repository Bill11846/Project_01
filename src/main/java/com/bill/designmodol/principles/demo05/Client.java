package com.bill.designmodol.principles.demo05;

/**
 * @Author: Bill
 * @Date: 2021/1/26
 * @Pro-name: Project_01
 * @Pck-name: com.bill.designmode.principles.demo05.before
 * @Desc: 测试类
 */
public class Client {
    public static void main(String[] args){
      Agent agent = new Agent();

      Star star = new Star("林青霞");
      agent.setStar(star);

      Fans fans = new Fans("张三");
      agent.setFans(fans);

      Company company = new Company("黑马媒体公司");
      agent.setCompany(company);

      agent.meeting();
      agent.business();
    }
}
