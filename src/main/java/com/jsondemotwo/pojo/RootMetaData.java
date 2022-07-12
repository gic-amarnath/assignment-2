package com.jsondemotwo.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RootMetaData {
 public String processName;
 public String processId;
 public String stageId;
 public String task;
 public String taskGroupId;
 public String requestDate;
 public String requestId;
 public String version;
 public String attempt;
 public String multiTask;
 public String requestAuthToken;
 public String txLabel;
}
