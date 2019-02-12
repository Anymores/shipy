package com.spy;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableZuulProxy
public class ProductCusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCusApplication.class, args);
	}

//	@Bean
//	public void addInt(InterceptorRegistry regist){
//		regist.addInterceptor(new AccessInterceptor()).addPathPatterns("/**");
//	}

	@Bean
	public PaginationInterceptor paginationInterceptor() {
		PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
		return paginationInterceptor;
	}


}
