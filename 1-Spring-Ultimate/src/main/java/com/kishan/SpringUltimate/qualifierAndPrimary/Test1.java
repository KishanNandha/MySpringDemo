/**
 * 
 */
package com.kishan.SpringUltimate.qualifierAndPrimary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Kishan
 *
 * Apr 17, 2021
 */
@Service
public class Test1 {

	//This will have primary car impl
	@Autowired
	private ICar car;
	
	@Autowired
	@Qualifier("sedan")
	private ICar car2;
	
	//auto wire generics
	@Autowired
	private List<ICar> listOFCars;
	
	public String test1() {
		String engineType = car.getEngineType();
		return engineType;
	}
	
	public String test2() {
		String engineType = car2.getEngineType();
		return engineType;
	}
	public void test3() {
		listOFCars.stream().forEach(System.out::println);
	}
}
