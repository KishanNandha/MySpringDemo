package com.kishan.SpringUltimate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kishan.SpringUltimate.factoryBean.Test2;
import com.kishan.SpringUltimate.qualifierAndPrimary.Test1;
import com.kishan.SpringUltimate.scopes.ScopesService;

@SpringBootApplication
public class Application implements ApplicationRunner{

	@Autowired
	private Test1 test1;
	
	@Autowired
	private ScopesService scopesService;
	
	@Autowired
	private Test2 test2;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//test1();
		//test2();
		test3();
	}
	
	/**
	 * @throws Exception 
	 * 
	 */
	private void test3() throws Exception {
		test2.test2();
	}

	/**
	 * 
	 */
	private void test2() {
		scopesService.getBlog();
	}

	/**
	 * 
	 */
	private void test1() {
		System.out.println(test1.test1());
		System.out.println(test1.test2());
		test1.test3();
	}


}
