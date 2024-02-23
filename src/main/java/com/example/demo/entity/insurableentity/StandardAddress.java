package com.example.demo.entity.insurableentity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class StandardAddress implements Serializable {
	/**
	 * serial Version UID
	 */
	private static final long serialVersionUID = 1L;

	private Address address;
	private GeoCodeInfo geoCodeInfo;
}
