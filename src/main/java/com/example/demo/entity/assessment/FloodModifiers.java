package com.example.demo.entity.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class FloodModifiers implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String contentGrade;
    private String contentsVulnerabilityDueToWater;
    private String flashingAndCopingQuality;
    private BigDecimal floodDefenseElevation;
    private String floodDefenseElevationUnit;
    private String floodMissilesExposure;
    private String floodProtection;
    private String groundLevelEquipment;
    private String ifmVerticalExposureDistribution;

}
