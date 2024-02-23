package com.example.demo.entity.assessment;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BiRiskAssessment implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String 	accountInterdependencyLabel;
	private String 	accountInterdependencyName;
	private Integer interdependencySublimit;
	private Integer programInterdependencyMFL;

}
