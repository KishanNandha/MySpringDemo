/**
 * 
 */
package com.kishan.SpringUltimate.qualifierAndPrimary;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Kishan
 *
 * Apr 17, 2021
 */
//@Component("sedan") no need to write this as by default it will have sedan name
@Component
@Order(3)
public class Sedan implements ICar {

	@Override
	public String getEngineType() {
		return "Sedan Engine";
	}

}
