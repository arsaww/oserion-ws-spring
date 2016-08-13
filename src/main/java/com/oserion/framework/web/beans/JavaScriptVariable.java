package com.oserion.framework.web.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "variable")
public class JavaScriptVariable {

    private String key;
    private String value;

    @XmlElement
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @XmlElement
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
