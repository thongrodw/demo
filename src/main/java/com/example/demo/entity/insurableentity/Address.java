package com.example.demo.entity.insurableentity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address implements Serializable {
	/**
	 * serial Version UID
	 */
	private static final long serialVersionUID = 1L;

	private String addressLine2;
	private String addressStatus;
	private String city;
	private String country;
	private Boolean isSpecificAddressKnown;
	private String municipality;
	private String state;
	private String streetNo;
	private String zipCode;

}
