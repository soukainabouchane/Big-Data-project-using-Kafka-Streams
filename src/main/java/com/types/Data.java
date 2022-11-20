
package com.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.concurrent.atomic.AtomicInteger;

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
	
	
//    private Integer id;
//    private static final AtomicInteger id = new AtomicInteger(0); 
	@JsonProperty("age")
    private Integer age;
    @JsonProperty("class")
    private String classe;
    @JsonProperty("insu")
    private Double insu;
    @JsonProperty("mass")
    private Double mass;
    @JsonProperty("pedi")
    private Double pedi;
    @JsonProperty("plas")
    private Double plas;
    @JsonProperty("preg")
    private Double preg;
    @JsonProperty("pres")
    private Double pres;
    @JsonProperty("skin")
    private Double skin;
    
    
    
//    public static AtomicInteger getId() {
//		return id;
//	}
//
//    public static AtomicInteger setId() {
//		return id;
//	}
//    
	@JsonProperty("age")
	public Integer getAge() {
		return age;
	}
    
    @JsonProperty("age")
	public void setAge(Integer age) {
		this.age = age;
	}
    
    
    @JsonProperty("class")
    public String getClasse() {
		return classe;
	}

    @JsonProperty("class")
	public void setClasse(String classe) {
		this.classe = classe;
	}

	@JsonProperty("insu")
	public Double getInsu() {
		return insu;
	}
    
    @JsonProperty("insu")
	public void setInsu(Double insu) {
		this.insu = insu;
	}
    
    @JsonProperty("mass")
	public Double getMass() {
		return mass;
	}
    
    @JsonProperty("mass")
	public void setMass(Double mass) {
		this.mass = mass;
	}
    
    @JsonProperty("pedi")
	public Double getPedi() {
		return pedi;
	}
    
    @JsonProperty("pedi")
	public void setPedi(Double pedi) {
		this.pedi = pedi;
	}
    
    @JsonProperty("plas")
	public Double getPlas() {
		return plas;
	}
    
    @JsonProperty("plas")
	public void setPlas(Double plas) {
		this.plas = plas;
	}
    
    @JsonProperty("preg")
	public Double getPreg() {
		return preg;
	}
    
    @JsonProperty("preg")
	public void setPreg(Double preg) {
		this.preg = preg;
	}
    
    @JsonProperty("pres")
	public Double getPres() {
		return pres;
	}
    
    @JsonProperty("pres")
	public void setPres(Double pres) {
		this.pres = pres;
	}
    
    @JsonProperty("skin")
	public Double getSkin() {
		return skin;
	}
    
    @JsonProperty("skin")
	public void setSkin(Double skin) {
		this.skin = skin;
	}

	@Override
	public String toString() {
		return "Data [age=" + age + ", classe=" + classe + ", insu=" + insu + ", mass=" + mass + ", pedi=" + pedi
				+ ", plas=" + plas + ", preg=" + preg + ", pres=" + pres + ", skin=" + skin + "]";
	}
    
    
    
    
}
