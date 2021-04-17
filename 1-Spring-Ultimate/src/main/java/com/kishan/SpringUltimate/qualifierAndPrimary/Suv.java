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
@Component
@Order(1)
public class Suv implements ICar {

	@Override
	public String getEngineType() {
		return "Suv Engine";
	}

}
