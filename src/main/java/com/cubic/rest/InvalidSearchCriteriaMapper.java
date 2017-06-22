package com.cubic.rest;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.cubic.exception.InvalidSearchCriteriaException;
import com.cubic.vo.ErrorResponse;

@Component
@Provider
@Produces(MediaType.APPLICATION_JSON)
public class InvalidSearchCriteriaMapper implements ExceptionMapper<InvalidSearchCriteriaException> {

	public Response toResponse(final InvalidSearchCriteriaException exception) {
		ErrorResponse errResp = new ErrorResponse();
		errResp.setErrorCode("ERR-VAL-100");
		errResp.setErrorDesc("Search Criteria is invalid. Please search with atleast 3 characters");
		return Response.status(510).entity(errResp).build();
	}



}
