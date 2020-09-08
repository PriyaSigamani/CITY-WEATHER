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
	"id",
	"name",
	"coord",
	"main",
	"dt",
	"wind",
	"rain",
	"clouds",
	"weather"
})
public class List {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("coord")
	private Coord coord;
	@JsonProperty("main")
	private Main main;
	@JsonProperty("dt")
	private Long dt;
	@JsonProperty("wind")
	private Wind wind;
	@JsonProperty("rain")
	private Rain rain;
	@JsonProperty("clouds")
	private Clouds clouds;
	@JsonProperty("weather")
	private java.util.List<Weather> weather = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Long id) {
		this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("coord")
	public Coord getCoord() {
		return coord;
	}

	@JsonProperty("coord")
	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	@JsonProperty("main")
	public Main getMain() {
		return main;
	}

	@JsonProperty("main")
	public void setMain(Main main) {
		this.main = main;
	}

	@JsonProperty("dt")
	public Long getDt() {
		return dt;
	}

	@JsonProperty("dt")
	public void setDt(Long dt) {
		this.dt = dt;
	}

	@JsonProperty("wind")
	public Wind getWind() {
		return wind;
	}

	@JsonProperty("wind")
	public void setWind(Wind wind) {
		this.wind = wind;
	}

	@JsonProperty("rain")
	public Rain getRain() {
		return rain;
	}

	@JsonProperty("rain")
	public void setRain(Rain rain) {
		this.rain = rain;
	}

	@JsonProperty("clouds")
	public Clouds getClouds() {
		return clouds;
	}

	@JsonProperty("clouds")
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	@JsonProperty("weather")
	public java.util.List<Weather> getWeather() {
		return weather;
	}

	@JsonProperty("weather")
	public void setWeather(java.util.List<Weather> weather) {
		this.weather = weather;
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