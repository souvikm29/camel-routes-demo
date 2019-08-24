package com.practice.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:demo").log("${body}").to("bean:camelRoutesService?method=testRoute");
	}
}
