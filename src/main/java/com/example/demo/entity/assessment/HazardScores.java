package com.example.demo.entity.assessment;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class HazardScores implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String earthquakeHazardZone;
    private String earthquakeHazardZoneOverwrite;
    private String extratropicalStormHazardZone;
    private String extratropicalStormHazardZoneOverwrite;
    private String flashFloodHazardZone;
    private String flashFloodHazardZoneOverwrite;
    private FlashFloodPeriods flashFloodPeriods;
    private String hailHazardZone;
    private String hailHazardZoneOverwrite;
    private String landslideHazardZone;
    private String landslideHazardZoneOverwrite;
    private String lightningHazardZone;
    private String lightningHazardZoneOverwrite;
    private BigDecimal riverFloodDefendedAreasStandardOfProtection;
    private String riverFloodHazardZone;
    private String riverFloodHazardZoneOverwrite;
    private RiverFloodPeriods riverFloodPeriods;
    private String snowPressureHazardZone;
    private String snowPressureHazardZoneOverwrite;
    private String stormSurgeHazardZone;
    private String stormSurgeHazardZoneOverwrite;
    private String tornadoHazardZone;
    private String tornadoHazardZoneOverwrite;
    private String tropicalCycloneHazardZone;
    private String tropicalCycloneHazardZoneOverwrite;
    private String tsunamiHazardZone;
    private String tsunamiHazardZoneOverwrite;
    private String volcanoHazardZone;
    private String volcanoHazardZoneOverwrite;
    private String wildfireHazardZone;
    private String wildfireHazardZoneOverwrite;
    private String winterStormHazardZone;
    private String winterStormHazardZoneOverwrite;

}
