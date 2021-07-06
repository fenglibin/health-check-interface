package com.eeeffff.monitor.healthcheck.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eeeffff.monitor.healthcheck.bean.Status;

/**
 * @author fenglibin
 */
@Controller
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class HealthController {

	@ResponseBody
	@RequestMapping("app/health")
	public Status appHhealth() {
		return new Status();
	}

}
