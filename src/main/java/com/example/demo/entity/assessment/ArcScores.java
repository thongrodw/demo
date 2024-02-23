package com.example.demo.entity.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArcScores implements Serializable {

	private static final long serialVersionUID = 1L;

	private String accountName;
	private Integer assessmentScoreBI;
	private Integer assessmentScorePD;
	private String currency;
	private BigDecimal estimatedMaximumLossBIValue;
	private BigDecimal estimatedMaximumLossCombinedValue;
	private BigDecimal estimatedMaximumLossPDValue;
	private Integer frequencyBI;
	private Integer frequencyPD;
	private BigDecimal maximumForseeableLossBIValue;
	private BigDecimal maximumForseeableLossCombinedValue;
	private BigDecimal maximumForseeableLossPDValue;
	private Integer severityBI;
	private Integer severityPD;
	private LocalDate surveyDate;
	private String surveyType;

}
