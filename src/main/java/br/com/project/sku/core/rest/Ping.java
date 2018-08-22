package br.com.project.sku.core.rest;


import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(path = "${application.rest.endpoint.ping}")
public class Ping {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@ApiOperation(value = "Check application health")
	@GetMapping
	public String ping() {
		logger.info("Success ping operation {}", this.getClass());
		return "Ping at " + LocalDateTime.now().toString();
	}
	
}