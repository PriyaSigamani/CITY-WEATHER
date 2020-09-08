package com.java;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"speed",
	"deg",
	"var_beg",
	"var_end"
})
public class Wind {

	@JsonProperty("speed")
	private Double speed;
	@JsonProperty("deg")
	private Long deg;
	@JsonProperty("var_beg")
	private Long varBeg;
	@JsonProperty("var_end")
	private Long varEnd;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("speed")
	public Double getSpeed() {
		return speed;
	}

	@JsonProperty("speed")
	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	@JsonProperty("deg")
	public Long getDeg() {
		return deg;
	}

	@JsonProperty("deg")
	public void setDeg(Long deg) {
		this.deg = deg;
	}

	@JsonProperty("var_beg")
	public Long getVarBeg() {
		return varBeg;
	}

	@JsonProperty("var_beg")
	public void setVarBeg(Long varBeg) {
		this.varBeg = varBeg;
	}

	@JsonProperty("var_end")
	public Long getVarEnd() {
		return varEnd;
	}

	@JsonProperty("var_end")
	public void setVarEnd(Long varEnd) {
		this.varEnd = varEnd;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}