package com.speedycomm.erp.fs;

/**
 * Created by linjietao on 2015/12/22.
 */
public enum SettlementEnum {

    Inner("内部结算", 0), Outer("外部结算", 1), All("结算", 2);

    private String name;

    private int value;

    // 构造方法
    SettlementEnum(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public static String getNameByValue(int value) {
        for (SettlementEnum c : SettlementEnum.values()) {
            if (c.getValue() == value) {
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
