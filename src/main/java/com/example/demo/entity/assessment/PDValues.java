package com.example.demo.entity.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PDValues implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String		basisOfValuation;
	private BigDecimal	buildingValue;
	private BigDecimal	contentValue;
	private BigDecimal	electricAndElectronicDevicesValue;
	private BigDecimal	machineValue;
	private BigDecimal	moneyValue;
	private BigDecimal	stocksValue;
	private BigDecimal	totalPDValue;				
	private BigDecimal	valuablesValue;

}
