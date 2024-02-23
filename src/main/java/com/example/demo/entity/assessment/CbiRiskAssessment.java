package com.example.demo.entity.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CbiRiskAssessment implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String supplyChainExposureAndRiskQualityLabel;
	private String supplyChainExposureAndRiskQualityName;

}
