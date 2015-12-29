package com.speedycomm.erp.org;

/**
 * Created by linjietao on 15/12/29.
 * 组织类型
 */
public enum OrganizationType {

    Administration("行政组织", 0x00000001),
    Financial("财务组织", 0x00000010),
    HR("人力资源组织", 0x00000100),
    Cost("成本组织", 0x00001000);

    private String name;

    private int value;

    // 构造方法
    OrganizationType(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public static String getNameByValue(int value) {
        for (OrganizationType c : OrganizationType.values()) {
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
