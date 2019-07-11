package com.repos.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import io.github.jhipster.config.JHipsterDefaults;
import io.github.jhipster.config.JHipsterProperties.Async;
import io.github.jhipster.config.JHipsterProperties.Http.Cache;

/**
 * Properties specific to Repos.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
	
	
	private static boolean lazy;
	
	public static final boolean uuu = lazy;
	
	public static boolean isLazy() {
		return lazy;
	}

	@Value("${application.lazy}")
	public void setLazy(boolean lazy) {
		ApplicationProperties.lazy = lazy;
	}

//	private static final Lazyness lazyness = new Lazyness(lazy);
	
//	public final boolean isLazy ;
//	
//	
//	
//	public ApplicationProperties(boolean isLazy) {
//		this.isLazy = isLazy;
//	}

//	public Lazyness getLazyness() {
//		return lazyness;
//	}
//
//	public static class Lazyness {
//
//        private final boolean lazy ;
//  
//		public Lazyness(@Value("${some.value}")boolean lazy) {
//			this.lazy = lazy;
//		}
//
//		public boolean isLazy() {
//			return lazy;
//		}
//
//		
//
//    }
}
