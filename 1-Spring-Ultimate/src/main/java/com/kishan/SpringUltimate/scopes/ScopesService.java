/**
 * 
 */
package com.kishan.SpringUltimate.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author Kishan
 *
 * Apr 17, 2021
 */
@Service
public class ScopesService {

    @Autowired
    private ApplicationContext applicationContext;
    
    public void getBlog() {
        Blog blogInstance1 = applicationContext.getBean("blog2", Blog.class);
        Blog blogInstance2 = applicationContext.getBean("blog2", Blog.class);
        Blog blogInstance3 = applicationContext.getBean("blog1", Blog.class);
        Blog blogInstance4 = applicationContext.getBean("blog1", Blog.class);
        System.out.println(blogInstance1);
        System.out.println(blogInstance2);
        
        //singleton
        System.out.println(blogInstance3);
        System.out.println(blogInstance4);
        
        //op:
        //com.kishan.SpringUltimate.scopes.Blog@7f5b9db
        //com.kishan.SpringUltimate.scopes.Blog@507d64aa
        //com.kishan.SpringUltimate.scopes.Blog@37045b48
        //com.kishan.SpringUltimate.scopes.Blog@37045b48
    }
}
