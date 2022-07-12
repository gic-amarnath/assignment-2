package com.jsondemotwo.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskSpecs {
	
	@JsonProperty("ComponentScoping")
	private List<ComponentScoping> componentScoping;
	
	public List<ComponentScoping> getComponentScopings(){
		return componentScoping;
	}
	
	public void setComponentScoping( List<ComponentScoping> componentScoping) {
		this.componentScoping=componentScoping;
	}
}
