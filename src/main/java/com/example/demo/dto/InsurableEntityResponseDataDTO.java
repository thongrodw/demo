package com.example.demo.dto;


import com.allianz.agcs.kafka.messagemodel.dtos.WorkbenchDataDTO;
import com.example.demo.entity.assessment.EntityAssessment;
import com.example.demo.entity.insurableentity.InsurableEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@JsonDeserialize(as = InsurableEntityResponseDataDTO.class)
@JsonTypeInfo(defaultImpl = InsurableEntityResponseDataDTO.class, property = "specversion", use = JsonTypeInfo.Id.NAME)
@JsonTypeName("InsurableEntityResponseDataDTO1.0")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class InsurableEntityResponseDataDTO extends WorkbenchDataDTO {

	private static final long serialVersionUID = 1L;
	private InsurableEntity locationEntity;
	private List<EntityAssessment> locationAssessmentEntity;

}
