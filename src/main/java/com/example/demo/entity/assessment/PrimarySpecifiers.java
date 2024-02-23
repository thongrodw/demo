package com.example.demo.entity.assessment;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrimarySpecifiers implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private BigDecimal	buildingHeight;		
	private String		constructionType;
	private BigDecimal	floorArea;
	private Integer		lowestFloorAboveGround;
	private Integer		numberFloorsAboveGround;	 
	private Integer 	numberOfBuildings;
	private Integer		numberOfStories;
	private Integer		yearBuilt;
	private Integer		yearUpgraded;
}

