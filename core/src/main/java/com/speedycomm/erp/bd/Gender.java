package com.speedycomm.erp.bd;

/**
 * Created by linjietao on 2015/12/22.
 * 性别
 */
public enum Gender {

    Male("男", 0), Female("女", 1);

    private String name;

    private int index;

    // 构造方法
    Gender(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(int index) {
        for (Gender c : Gender.values()) {
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
