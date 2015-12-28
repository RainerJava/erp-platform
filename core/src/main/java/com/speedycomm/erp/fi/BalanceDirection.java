package com.speedycomm.erp.fi;

/**
 * Created by linjietao on 2015/12/22.
 * 余额方向
 */
public enum BalanceDirection {

    Credit("贷方", 0), Debit("借方", 1);

    private String name;

    private int index;

    // 构造方法
    BalanceDirection(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(int index) {
        for (BalanceDirection c : BalanceDirection.values()) {
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
