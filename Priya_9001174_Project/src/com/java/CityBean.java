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
	"cod",
	"calctime",
	"cnt",
	"list"
})
public class CityBean {

	@JsonProperty("cod")
	private String cod;
	@JsonProperty("calctime")
	private Double calctime;
	@JsonProperty("cnt")
	private Long cnt;
	@JsonProperty("list")
	private java.util.List<List> list = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("cod")
	public String getCod() {
		return cod;
	}

	@JsonProperty("cod")
	public void setCod(String cod) {
		this.cod = cod;
	}

	@JsonProperty("calctime")
	public Double getCalctime() {
		return calctime;
	}

	@JsonProperty("calctime")
	public void setCalctime(Double calctime) {
		this.calctime = calctime;
	}

	@JsonProperty("cnt")
	public Long getCnt() {
		return cnt;
	}

	@JsonProperty("cnt")
	public void setCnt(Long cnt) {
		this.cnt = cnt;
	}

	@JsonProperty("list")
	public java.util.List<List> getList() {
		return list;
	}

	@JsonProperty("list")
	public void setList(java.util.List<List> list) {
		this.list = list;
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