package com.example.demo.entity.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssessmentValue implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private BIValues	biValues;	
	private CBIValues   cbiValues;			
	private String		locationCurrency;
	private PDValues	pdValues;
	private BigDecimal	totalSumInsuredValue;

}
