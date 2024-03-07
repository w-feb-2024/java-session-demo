package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mybeans.Account;
import mybeans.Address;

@Configuration
public class AppConfig {

	//@Bean(name = {"account"})
	@Bean
	public Account retrieveAccount() {
		return new Account(8888, "Jenifer Lopez", retrieveAddress());
	}
	
//	@Bean(name = {"address"})
	@Bean
	public Address retrieveAddress() {
		return new Address("Bangalore", "Karnataka");
	}
}
