package com.bill.designmodol.principles.demo04.before;

/**
 * @Author: Bill
 * @Date: 2021/1/26
 * @Pro-name: Project_01
 * @Pck-name: com.bill.designmode.principles.demo04.before
 * @Desc: 测试类
 */
public class Client {
    public static void main(String[] args){
      HeimaSafetyDoor door = new HeimaSafetyDoor();
      door.antiTheft();
      door.fireProof();
      door.waterProof();
    }
}
