/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelapimodel.auto.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hotelbeds.hotelapimodel.auto.convert.json.DateSerializer;
import com.hotelbeds.hotelapimodel.auto.model.Hotel;
import java.time.LocalDate;
import java.util.List;

import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.Data;

@JsonInclude(Include.NON_NULL)
@ToString
@NoArgsConstructor
@Data
public class Hotels {

	private List<Hotel> hotels;
	@JsonProperty
	@JsonSerialize(using = DateSerializer.class)
	private LocalDate checkIn;
	@JsonProperty
	@JsonSerialize(using = DateSerializer.class)
	private LocalDate checkOut;
	@JsonProperty
	private Integer total;


}