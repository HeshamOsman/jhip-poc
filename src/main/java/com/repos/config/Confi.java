//package com.repos.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.core.env.Profiles;
//
//import com.repos.repository.UserRepoForH2;
//import com.repos.repository.UserReposatoryForMaria;
//import com.repos.repository.UserRepository;
//import com.repos.repository.usertworepo;
//
//@Configuration
//public class Confi {
//	private final Environment env;
//
//    public Confi(Environment env) {
//        this.env = env;
//    }
//    
//    @Autowired
//    private ApplicationContext applicationContext;
//	
//	@Bean
//    public usertworepo buildMachineService() {
//		System.out.println("CONFIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
//		if (env.acceptsProfiles(Profiles.of("dev"))) {
//			return applicationContext.getBean(UserRepoForH2.class);
//		} else {
//			return applicationContext.getBean(UserReposatoryForMaria.class);
//		}
//		
//    }
//}
