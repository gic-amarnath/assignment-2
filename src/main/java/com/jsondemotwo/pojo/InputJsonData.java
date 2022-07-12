package com.jsondemotwo.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

import lombok.Data;

@Data
@JsonInclude(value=Include.NON_NULL)
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
@Entity
@Table(name="save_json")
public class InputJsonData implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@Type(type = "jsonb")
	@Column(columnDefinition = "jsonb")
	private JsonNode data;
	
	@JsonProperty("ResponseJson")
	@Column(columnDefinition = "text")
	private String responseJson;
	
	@Column(name="status")
	private String status;
}
