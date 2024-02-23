package com.example.demo.entity.insurableentity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class InsurableEntity extends AuditEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	
		private String id;
		private UniqueData identifiedByUniqueData; 
		private String label; 
		private StandardAddress locatedAtStandardAddress; 
		private String name; 
		private String type; 	

}
