/**
 * 
 */
package com.kishan.SpringUltimate.factoryBean;

import org.springframework.stereotype.Service;

/**
 * @author Kishan
 *
 * Apr 17, 2021
 */
@Service
public class Test2 {

	private PostFactory postFactory = new PostFactory();
	private PostFactorySingleTon pfs = new PostFactorySingleTon();
	
	public void test2() throws Exception {
		System.out.println(postFactory.getObject());
		System.out.println(postFactory.getObject());
		
		System.out.println(pfs.getObject());
		System.out.println(pfs.getObject());
		
	}
}
