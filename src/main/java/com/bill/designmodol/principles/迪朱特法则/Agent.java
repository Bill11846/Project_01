package com.bill.designmodol.principles.迪朱特法则;

/**
 * @Author: Bill
 * @Date: 2021/1/26
 * @Pro-name: Project_01
 * @Pck-name: com.bill.designmode.principles.demo05.before
 * @Desc: 经纪人类
 */
public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    //和粉丝见面的方法
    public void meeting(){
        System.out.println(star.getName() + "和粉丝" + fans.getName() + "见面");
    }
    //和媒体公司洽谈的方法
    public void business(){
        System.out.println(star.getName() + "和" + company.getName() + "洽谈");
    }
}
