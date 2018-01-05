package com.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @author wwchang
 * @date 2017/12/12 12:16
 */
@EnableEurekaClient
@EnableZuulProxy
@SpringCloudApplication
public class MsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGatewayApplication.class, args);
	}

	/**
	 * 不同版本的服务路由
	 */
//	@Bean
//	public PatternServiceRouteMapper patternServiceRouteMapper(){
//		return new PatternServiceRouteMapper("(?<name>^.+)-(?<version>v.+$)-","${version}/${name}");
//	}
}
