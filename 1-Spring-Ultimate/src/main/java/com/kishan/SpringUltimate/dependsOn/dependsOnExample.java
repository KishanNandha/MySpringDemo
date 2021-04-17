/**
 * 
 */
package com.kishan.SpringUltimate.dependsOn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * @author Kishan
 *
 *         Apr 17, 2021
 */
//@Configuration
public class dependsOnExample {

	@Bean
	@DependsOn({ "fileReader", "fileWriter" })
	public FileProcessor fileProcessor() {
		return new FileProcessor();
	}

	@Bean("fileReader")
	public FileReader fileReader() throws FileNotFoundException {
		return new FileReader("");
	}

	@Bean("fileWriter")
	public FileWriter fileWriter() throws IOException {
		return new FileWriter("");
	}
}
