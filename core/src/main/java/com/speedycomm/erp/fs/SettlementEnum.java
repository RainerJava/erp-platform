package com.speedycomm.erp.fs;

/**
 * Created by linjietao on 2015/12/22.
 */
public enum SettlementEnum {

    Inner("内部结算", 0), Outer("外部结算", 1), All("结算", 2);

    private String name;

    private int index;

    // 构造方法
    SettlementEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(int index) {
        for (SettlementEnum c : SettlementEnum.values()) {
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
