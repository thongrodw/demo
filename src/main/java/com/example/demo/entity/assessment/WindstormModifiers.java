package com.example.demo.entity.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class WindstormModifiers implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	 	private String basement;
	    private String claddingType;
	    private String contentsVulnerabilityDueToWind;
	    private String ifmStructureCondition;
	    private String openingProtection;
	    private String roofAge;
	    private String roofCovering;
	    private String roofEquipmentHurricaneBracing;
	    private String roofGeometry;

}
