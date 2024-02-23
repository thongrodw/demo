package com.example.demo.entity.insurableentity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoCodeInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String geoCodesQualityLevel; 
	private Integer geoResolutionCode;
	private String  geoResolutionName;
	private Boolean isGeoCodeLock;
	private BigDecimal latitude;
	private BigDecimal longitude; 
	private String zoneCRESTA;
	
}
