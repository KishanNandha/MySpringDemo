/**
 * 
 */
package com.kishan.SpringUltimate.qualifierAndPrimary;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Kishan
 *
 * Apr 17, 2021
 */
@Component
@Primary
@Order(2) // order for auto wire generics
public class Hatchback implements ICar {

	@Override
	public String getEngineType() {
		return "Hatchback Engine";
	}

}
