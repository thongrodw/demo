package com.example.demo.entity.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BIValues implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private BigDecimal	annualBIValue;
	private BIValueDetails	fixedCost;
	private BIValueDetails	grossEarnings;
	private BIValueDetails	grossProfit;
	private BIValueDetails	lossOfIncome;
	private BIValueDetails	lossOfRent;	
	private BigDecimal	totalBIValue;	

}
