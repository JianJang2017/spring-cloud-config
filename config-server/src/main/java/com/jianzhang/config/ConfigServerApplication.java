package com.jianzhang.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/***
 *注冊中心
 * http://localhost:9091/cloud-config/dev
 * {
 "name": "cloud-config",
 "profiles": [
 "dev"
 ],
 "label": null,
 "version": "ec60bb49c84967e6082336b3af66077f757c1d3e",
 "state": null,
 "propertySources": []
 }
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
