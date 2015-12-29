package com.speedycomm.erp.rs;

/**
 * Created by linjietao on 15/12/29.
 * 资源类型
 */
public enum ResourceType {

    Menu("系统菜单", 0), URL("页面路径", 1), File("文件", 2);

    private String name;

    private int value;

    // 构造方法
    ResourceType(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public static String getNameByValue(int value) {
        for (ResourceType c : ResourceType.values()) {
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
