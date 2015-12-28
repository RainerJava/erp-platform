package com.speedycomm.erp.pm;

/**
 * Created by linjietao on 2015/12/22.
 */
public enum UserType {

    Person("职员", 0), Administrator("系统管理员", 1), Customer("试用者", 2);

    private String name;

    private int index;

    // 构造方法
    UserType(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(int index) {
        for (UserType c : UserType.values()) {
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
