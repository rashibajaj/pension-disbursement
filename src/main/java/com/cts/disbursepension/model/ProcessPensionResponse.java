package com.cts.disbursepension.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProcessPensionResponse {

	@ApiModelProperty(value = "Status code after processing pension. 10 for success and 21 for failure")
	private int processPensionStatusCode;

}
