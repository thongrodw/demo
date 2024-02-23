package com.example.demo.entity.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BIValueDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private BigDecimal annualValue;
	private Integer basisOfValuation;
	private Integer indemnityPeriodMonth;
	private BigDecimal insuredValue;

}
