package com.example.demo.entity.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityAssessment implements Serializable {

	private static final long serialVersionUID = 1L;

	private ArcScores arcScores;
	private LocalDateTime assessmentDate;
	private String assessmentId;
	private String assessmentType;
	private AssessmentValue assessmentValues;
	private BiRiskAssessment biRiskAssessment;
	private CbiRiskAssessment cbiRiskAssessment;
	private String CORESLDMLocationId;
	private GeneralInfo generalInfo;
	private HazardScores hazardScores;
	private String insurableEntityRef;
	private Boolean isCurrent;
	private String lastUpdatedBy;
	private LocalDateTime lastUpdatedDate;
	private String owningProcess;
	private PrimarySpecifiers primarySpecifiers;
	private SecondarySpecifiers secondarySpecifiers;
	private String submissionBaseNr;
	private String versionId;

}
