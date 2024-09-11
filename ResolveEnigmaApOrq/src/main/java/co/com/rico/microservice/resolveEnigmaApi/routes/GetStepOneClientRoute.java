package co.com.rico.microservice.resolveEnigmaApi.routes;


import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class GetStepOneClientRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("direct:get-step-one")
                .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                .to("freeMarker:templates/getStepOneClientTemplate.ftl")
                .log("antes del llamado ${body}")
                .to("http://localhost:8080/getStep")
                .log("despues del llamado ${body}");
    }
}
