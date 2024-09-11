package co.com.rico.microservice.resolveEnigmaApi.api;

import co.com.rico.microservice.resolveEnigmaApi.model.GetEnigmaStepResponse;
import co.com.rico.microservice.resolveEnigmaApi.model.JsonApiBodyRequest;
import co.com.rico.microservice.resolveEnigmaApi.model.JsonApiBodyResponseSuccess;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.apache.camel.EndpointInject;
import org.apache.camel.FluentProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-02-27T19:20:23.716-05:00[America/Bogota]")
@Controller
public class GetStepApiController implements GetStepApi {

    private static final Logger log = LoggerFactory.getLogger(GetStepApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GetStepApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @EndpointInject(uri = "direct:get-step-one")
    private FluentProducerTemplate producerTemplateResolveEnigma;

    public ResponseEntity<JsonApiBodyResponseSuccess> getStepsPost(@ApiParam(value = "body", required = true)@Valid @RequestBody JsonApiBodyRequest body) {
        try{
            producerTemplateResolveEnigma.request();
            log.debug("entro por aqui");
            return new ResponseEntity<JsonApiBodyResponseSuccess>(objectMapper.readValue("{  \"data\" : [ {     \"answer\" : \"answer\",    \"header\" : { } ]}", JsonApiBodyResponseSuccess.class), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<JsonApiBodyResponseSuccess>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<List<JsonApiBodyResponseSuccess>> getStep(JsonApiBodyRequest body) {
        return null;
    }
}
