package com.speedycomm.erp.bd;

/**
 * Created by linjietao on 2015/12/28.
 * 核算项目类型
 */
public enum  AccountingItemsType {

    Customer("客户", 0), Supplier("供应商", 1);

    private String name;

    private int index;

    // 构造方法
    AccountingItemsType(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(int index) {
        for (AccountingItemsType c : AccountingItemsType.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
