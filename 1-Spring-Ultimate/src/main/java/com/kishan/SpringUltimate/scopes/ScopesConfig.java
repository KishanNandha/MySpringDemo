/**
 * 
 */
package com.kishan.SpringUltimate.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Kishan
 *
 * Apr 17, 2021
 */
@Configuration
public class ScopesConfig {


	//5 types of bean scopes supported :

	   // singleton – Return a single bean instance per Spring IoC container
	   // prototype – Return a new bean instance each time when requested
	   // request – Return a single bean instance per HTTP request. *
	   // session – Return a single bean instance per HTTP session. *
	   // globalSession – Return a single bean instance per global HTTP session. *

	//In most cases, you may only deal with the Spring’s core scope – singleton and prototype, and the default scope is singleton.
	
    @Bean(name = "blog2")
    @Scope("prototype")
    public Blog getBlog() {
        return new Blog();
    }
    
    @Bean(name = "blog1")
    public Blog getBlogd() {
        return new Blog();
    }
}
