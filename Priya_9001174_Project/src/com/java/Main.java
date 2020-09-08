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
	"temp",
	"temp_min",
	"temp_max",
	"pressure",
	"sea_level",
	"grnd_level",
	"humidity"
})
public class Main {

	@JsonProperty("temp")
	private Double temp;
	@JsonProperty("temp_min")
	private Long tempMin;
	@JsonProperty("temp_max")
	private Long tempMax;
	@JsonProperty("pressure")
	private Long pressure;
	@JsonProperty("sea_level")
	private Double seaLevel;
	@JsonProperty("grnd_level")
	private Double grndLevel;
	@JsonProperty("humidity")
	private Long humidity;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("temp")
	public Double getTemp() {
		return temp;
	}

	@JsonProperty("temp")
	public void setTemp(Double temp) {
		this.temp = temp;
	}

	@JsonProperty("temp_min")
	public Long getTempMin() {
		return tempMin;
	}

	@JsonProperty("temp_min")
	public void setTempMin(Long tempMin) {
		this.tempMin = tempMin;
	}

	@JsonProperty("temp_max")
	public Long getTempMax() {
		return tempMax;
	}

	@JsonProperty("temp_max")
	public void setTempMax(Long tempMax) {
		this.tempMax = tempMax;
	}

	@JsonProperty("pressure")
	public Long getPressure() {
		return pressure;
	}

	@JsonProperty("pressure")
	public void setPressure(Long pressure) {
		this.pressure = pressure;
	}

	@JsonProperty("sea_level")
	public Double getSeaLevel() {
		return seaLevel;
	}

	@JsonProperty("sea_level")
	public void setSeaLevel(Double seaLevel) {
		this.seaLevel = seaLevel;
	}

	@JsonProperty("grnd_level")
	public Double getGrndLevel() {
		return grndLevel;
	}

	@JsonProperty("grnd_level")
	public void setGrndLevel(Double grndLevel) {
		this.grndLevel = grndLevel;
	}

	@JsonProperty("humidity")
	public Long getHumidity() {
		return humidity;
	}

	@JsonProperty("humidity")
	public void setHumidity(Long humidity) {
		this.humidity = humidity;
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