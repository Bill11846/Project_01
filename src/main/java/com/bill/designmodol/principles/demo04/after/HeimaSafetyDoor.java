package com.bill.designmodol.principles.demo04.after;

/**
 * @Author: Bill
 * @Date: 2021/1/26
 * @Pro-name: Project_01
 * @Pck-name: com.bill.designmode.principles.demo04.after
 * @Desc: 黑马品牌防盗门
 */
public class HeimaSafetyDoor implements AntiTheft, FireProof, WaterProof {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
