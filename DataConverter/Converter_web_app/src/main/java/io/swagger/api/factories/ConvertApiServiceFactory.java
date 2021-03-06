package io.swagger.api.factories;

import io.swagger.api.ConvertApiService;
import io.swagger.api.impl.ConvertApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-03-06T02:30:02.840Z[GMT]")public class ConvertApiServiceFactory {
    private final static ConvertApiService service = new ConvertApiServiceImpl();

    public static ConvertApiService getConvertApi() {
        return service;
    }
}
