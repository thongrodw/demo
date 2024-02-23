package com.example.demo.entity.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CBIValues implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private BigDecimal 	cbiLimitValue;
	private BigDecimal 	cbiMFLValue;	
	private String  	cbiTier;	//Tier 1,Tier 2,Tier 3,.....
	private Integer 	indemnityPeriodMonth;

}
