package com.oserion.framework.web.beans;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name = "html-form-config")
@XmlSeeAlso({JavaScriptVariable.class})
public class HtmlFormConfig {

    private String htmlFormUrl;
    private ArrayList<JavaScriptVariable> variables;

    @XmlElement(name = "form-url")
    public String getHtmlFormUrl() {
        return htmlFormUrl;
    }

    public void setHtmlFormUrl(String htmlFormUrl) {
        this.htmlFormUrl = htmlFormUrl;
    }

    @XmlElement(name = "variable")
    public ArrayList<JavaScriptVariable> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<JavaScriptVariable> variables) {
        this.variables = variables;
    }
}
