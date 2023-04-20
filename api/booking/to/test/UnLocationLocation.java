package com.shipmentonline.msb1bk.api.booking.to.test;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE)
public class UnLocationLocation implements PlaceOfBLIssue {
	public String locationName;
	
	@NotBlank
	public String UNLocationCode;
	
	public String getLocationName() {
		return locationName;
	}
	
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	public String getUNLocationCode() {
		return UNLocationCode;
	}

	public void setUNLocationCode(String UNLocationCode) {
		this.UNLocationCode = UNLocationCode;
	}
}
