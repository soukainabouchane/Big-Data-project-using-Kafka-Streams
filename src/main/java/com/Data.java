
package com;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "age",
    "class",
    "insu",
    "mass",
    "pedi",
    "plas",
    "preg",
    "pres",
    "skin"
})
public class Data {

    @JsonProperty("age")
    private String age;
    @JsonProperty("class")
    private Object _class;
    @JsonProperty("insu")
    private Object insu;
    @JsonProperty("mass")
    private Object mass;
    @JsonProperty("pedi")
    private Object pedi;
    @JsonProperty("plas")
    private Object plas;
    @JsonProperty("preg")
    private Object preg;
    @JsonProperty("pres")
    private Object pres;
    @JsonProperty("skin")
    private Object skin;

    @JsonProperty("age")
    public String getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(String age) {
        this.age = age;
    }

    public Data withAge(String age) {
        this.age = age;
        return this;
    }

    @JsonProperty("class")
    public Object getClass_() {
        return _class;
    }

    @JsonProperty("class")
    public void setClass_(Object _class) {
        this._class = _class;
    }

    public Data withClass(Object _class) {
        this._class = _class;
        return this;
    }

    @JsonProperty("insu")
    public Object getInsu() {
        return insu;
    }

    @JsonProperty("insu")
    public void setInsu(Object insu) {
        this.insu = insu;
    }

    public Data withInsu(Object insu) {
        this.insu = insu;
        return this;
    }

    @JsonProperty("mass")
    public Object getMass() {
        return mass;
    }

    @JsonProperty("mass")
    public void setMass(Object mass) {
        this.mass = mass;
    }

    public Data withMass(Object mass) {
        this.mass = mass;
        return this;
    }

    @JsonProperty("pedi")
    public Object getPedi() {
        return pedi;
    }

    @JsonProperty("pedi")
    public void setPedi(Object pedi) {
        this.pedi = pedi;
    }

    public Data withPedi(Object pedi) {
        this.pedi = pedi;
        return this;
    }

    @JsonProperty("plas")
    public Object getPlas() {
        return plas;
    }

    @JsonProperty("plas")
    public void setPlas(Object plas) {
        this.plas = plas;
    }

    public Data withPlas(Object plas) {
        this.plas = plas;
        return this;
    }

    @JsonProperty("preg")
    public Object getPreg() {
        return preg;
    }

    @JsonProperty("preg")
    public void setPreg(Object preg) {
        this.preg = preg;
    }

    public Data withPreg(Object preg) {
        this.preg = preg;
        return this;
    }

    @JsonProperty("pres")
    public Object getPres() {
        return pres;
    }

    @JsonProperty("pres")
    public void setPres(Object pres) {
        this.pres = pres;
    }

    public Data withPres(Object pres) {
        this.pres = pres;
        return this;
    }

    @JsonProperty("skin")
    public Object getSkin() {
        return skin;
    }

    @JsonProperty("skin")
    public void setSkin(Object skin) {
        this.skin = skin;
    }

    public Data withSkin(Object skin) {
        this.skin = skin;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("age", age).append("_class", _class).append("insu", insu).append("mass", mass).append("pedi", pedi).append("plas", plas).append("preg", preg).append("pres", pres).append("skin", skin).toString();
    }

}
