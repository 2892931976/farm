package com.farm.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 版权所有: 2018 ® kexin Company  <br />
 * 单元名称: App.java  <br />
 * 说        明: 注册中心 <br />
 * 作        者: yunnet <br />
 * 创建时间: 2018-08-31 15:23:04 <br />
 * 最后修改: 2018-08-31 15:23:04 <br />
 * 修改历史: <br />
 */
@EnableEurekaServer
@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
