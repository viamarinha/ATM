package io.swagger.api;

import dev.viamarinha.validators.ValidationConverterException;
import io.swagger.model.Input;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-03-06T02:30:02.840Z[GMT]")public abstract class ConvertApiService {
    public abstract Response convertPost(Input body,SecurityContext securityContext) throws NotFoundException, ValidationConverterException;
}
