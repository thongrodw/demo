package com.example.demo.entity.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String		codeAOC;
	private String		codeAOCText;
	private String		codeISICPlus;		
	private Boolean 	isContributorToAccountInterdependencyMFL;		
	private Boolean		isContributorToMajorInterdependencyScenario;
	private LocalDate 	locationStartDate;
	private LocalDate 	locationEndDate;
	private String		locationType;
}
