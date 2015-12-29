package com.speedycomm.erp.fi;

/**
 * Created by linjietao on 2015/12/22.
 * 余额方向
 */
public enum BalanceDirection {

    Credit("贷方", 0), Debit("借方", 1);

    private String name;

    private int value;

    // 构造方法
    BalanceDirection(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public static String getNameByValue(int value) {
        for (BalanceDirection c : BalanceDirection.values()) {
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
