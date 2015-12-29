package com.speedycomm.erp.bd;

/**
 * Created by linjietao on 2015/12/22.
 * 性别
 */
public enum Gender {

    Male("男", 0), Female("女", 1);

    private String name;

    private int value;

    // 构造方法
    Gender(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public static String getNameByValue(int value) {
        for (Gender c : Gender.values()) {
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
