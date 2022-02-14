package com.excellence.OnlineOfficialWebsite.service;



import org.springframework.stereotype.Service;

import com.excellence.OnlineOfficialWebsite.model.ExcellenceClassesDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Service
public class ExcellenceService {
	
	
	private ExcellenceClassesDetails excellenceDetails;

	public ExcellenceClassesDetails getExcellenceDetails() {
		return excellenceDetails;
	}

	public void setExcellenceDetails(ExcellenceClassesDetails excellenceDetails) {
		this.excellenceDetails = excellenceDetails;
	}

	@Override
	public String toString() {
		return "ExcellenceService [excellenceDetails=" + excellenceDetails + "]";
	}
	
	

	
	
	
	
	
	

}
