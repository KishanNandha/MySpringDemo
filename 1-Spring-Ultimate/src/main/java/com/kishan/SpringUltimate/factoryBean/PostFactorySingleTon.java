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
public class PostFactorySingleTon implements FactoryBean<Post> {

	private Post instance = null;
	@Override
	public Post getObject() throws Exception {
		if(null == instance) {
			instance = new Post();
		}
		return instance;
	}

	@Override
	public Class<?> getObjectType() {
		return Post.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
