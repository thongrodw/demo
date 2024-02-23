package com.example.demo.entity.assessment;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EarthquakeModifiers implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private BigDecimal completePr;
    private String constructionQuality;
    private String engineeredFoundation;
    private String equipmentEQBracing;
    private String planIrregularity;
    private String softStory;
    private String structuralUpgrade;
    private String tank;
    private String urmPartition;

}
