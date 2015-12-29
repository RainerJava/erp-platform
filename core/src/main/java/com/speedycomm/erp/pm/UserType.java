package com.speedycomm.erp.pm;

/**
 * Created by linjietao on 2015/12/22.
 * 用户类型
 */
public enum UserType {

    Person("职员", 0), Administrator("系统管理员", 1), Customer("试用者", 2);

    private String name;

    private int value;

    // 构造方法
    UserType(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public static String getNameByValue(int value) {
        for (UserType c : UserType.values()) {
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
