/**
 * 
 */
package com.kishan.SpringUltimate.factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Kishan
 *
 *         Apr 17, 2021
 */
public class PostFactory implements FactoryBean<Post> {

	@Override
	public Post getObject() throws Exception {
		return new Post();
	}

	@Override
	public Class<?> getObjectType() {
		return Post.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
