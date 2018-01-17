package com.jianzhang.springboot;

import com.jianzhang.utils.dao.MyMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//启注解事务管理
@EnableTransactionManagement  // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@MapperScan(basePackages = "com.jianzhang.springboot.dao", markerInterface = MyMapper.class)
@EnableAutoConfiguration
public class ConfigWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigWebApplication.class, args);
	}
}
