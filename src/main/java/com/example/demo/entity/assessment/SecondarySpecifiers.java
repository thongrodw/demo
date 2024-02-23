package com.example.demo.entity.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecondarySpecifiers implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private BusinessInterruption		businessInterruption;
	private EarthquakeModifiers 		earthquakeModifiers;
	private FloodModifiers 				floodModifiers;
    private WindstormModifiers 			windstormModifiers;
}

