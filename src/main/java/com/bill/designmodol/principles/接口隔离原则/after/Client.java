package com.bill.designmodol.principles.接口隔离原则.after;

/**
 * @Author: Bill
 * @Date: 2021/1/26
 * @Pro-name: Project_01
 * @Pck-name: com.bill.designmode.principles.demo04.after
 * @Desc: 测试类
 */
public class Client {
    public static void main(String[] args) {
        //HeimaSafetyDoor door = new HeimaSafetyDoor();
        ITSafetyDoor door = new ITSafetyDoor();
        door.antiTheft();
        door.fireProof();
    }
}
