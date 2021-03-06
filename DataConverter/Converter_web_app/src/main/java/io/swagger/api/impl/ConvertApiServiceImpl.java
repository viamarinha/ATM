package io.swagger.api.impl;

import dev.viamarinha.Converter;
import dev.viamarinha.jsontoxml.JsonConverter;
import dev.viamarinha.validators.ValidationConverterException;
import dev.viamarinha.xmltojson.XmlConverter;
import io.swagger.api.*;

import io.swagger.model.BadConversationResult;
import io.swagger.model.Input;

import io.swagger.api.NotFoundException;
import io.swagger.model.Type;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-03-06T02:30:02.840Z[GMT]")
public class ConvertApiServiceImpl extends ConvertApiService {
    @Override
    public Response convertPost(Input body, SecurityContext securityContext) throws NotFoundException, ValidationConverterException {


        if (body.getType().equals(Type.JSON)) {
            Converter converter = new JsonConverter();
            try {
                converter.convert(body.getCustomerData());
            }catch(ValidationConverterException ex){
                BadConversationResult response = new BadConversationResult();
                response.validation(false);
                response.setValidationMessage(ex.getMessage());
                return Response.status(Response.Status.BAD_REQUEST).entity(response).build();

            }
        } else if (body.getType().equals(Type.XML)) {
            Converter converter = new XmlConverter();
            converter.convert(body.getCustomerData());
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
