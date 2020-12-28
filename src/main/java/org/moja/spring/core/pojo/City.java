package org.moja.spring.core.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class City {

    private String name;
    private int code;
    private Province province;

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


    @Autowired(required = false)
    @Qualifier("province2")
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
