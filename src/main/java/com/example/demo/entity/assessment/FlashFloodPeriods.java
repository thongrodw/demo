package com.example.demo.entity.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlashFloodPeriods implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String depthReturnPeriod20Yr;
    private String depthReturnPeriod50Yr;
    private String depthReturnPeriod75Yr;
    private String depthReturnPeriod100Yr;
    private String depthReturnPeriod200Yr;
    private String depthReturnPeriod500Yr;
    private String depthReturnPeriod1000Yr;
    private String depthReturnPeriod1500Yr;

}
