package com.cubic.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.cubic.util.Employee;

@Service
@Path("/helloworld")
public class HelloRest {

	@GET
	public String sayHello() {
		return "welcome to Hello world rest";
	}

	@GET
	@Path("/emp/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee findEmployeeById(@PathParam("id") final String emp) {
		Employee employee = new Employee();
		employee.setName("Jim Smith");
		employee.setAge(30);
		return employee;
	}

}
