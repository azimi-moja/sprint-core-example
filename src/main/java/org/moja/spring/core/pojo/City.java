package org.moja.spring.core.pojo;

public class City {

    private String name;
    private int code;
    private Province province;

    public City(String name, int code, Province province) {
        this.name = name;
        this.code = code;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", province=" + province +
                '}';
    }
}
