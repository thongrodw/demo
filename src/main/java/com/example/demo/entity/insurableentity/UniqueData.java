package com.example.demo.entity.insurableentity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter	
@JsonIgnoreProperties(ignoreUnknown = true)
public class UniqueData implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String ABSPartnerId;  		 //rename to partnerIdInABS
	private String addressString;
	private String CORESLDMLocationId;  //rename to coresLDMLocationId or locatoinIdinGREAT
	private String geoCodeString;
	private String globalGeniusNameCode;
	private String insurableEntityId;
	private String SOVAddressString;	 //rename to sovAddressString

}
