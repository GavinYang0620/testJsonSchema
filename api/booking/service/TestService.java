package com.shipmentonline.msb1bk.api.booking.service;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import io.swagger.annotations.Api;

@Api(tags="TEST")
public interface TestService {
	@PostMapping(value = "/test/anyOf", produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public ResponseEntity<Object> anyOf(
			@RequestBody(required = true) String str
	);
	
	@PostMapping(value = "/test/oneOf", produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public ResponseEntity<Object> oneOf(
			@RequestBody(required = true) String str
	);
}
