package com.example.demo.model;

import com.allianz.agcs.kafka.messagemodel.messages.WorkbenchResponseMessage;
import com.example.demo.dto.InsurableEntityResponseDataDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

@JsonDeserialize(
		as = InsurableEntityResponse.class
)
@JsonTypeInfo(
		defaultImpl = InsurableEntityResponse.class,
		property = "specversion",
		use = JsonTypeInfo.Id.NAME
)
@JsonTypeName("InsurableEntityResponse1.0")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsurableEntityResponse extends WorkbenchResponseMessage {

	private static final long serialVersionUID = 1L;

	@JsonProperty("data")
	private InsurableEntityResponseDataDTO responseData;
}
