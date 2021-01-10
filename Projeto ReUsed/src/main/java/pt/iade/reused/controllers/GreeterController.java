/*
package pt.iade.reused.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// mvnw spring-boot:run

@RestController                                 // http://localhost:8080/api/greeter/Joao A
@RequestMapping(path="/api/greeter")            // http://localhost:8080/api/greeter
public class GreeterController {            
    private Logger logger = LoggerFactory.getLogger(GreeterController.class);
    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public String getGreeting() {
        logger.info("Saying to you Za warudo");
        return "Za warudo";
 }
    @GetMapping(path = "{name}",
    produces= MediaType.APPLICATION_JSON_VALUE)
    public String getGreeting(@PathVariable("name") String name) {
        logger.info("Saying Hello to "+name);
        return "Hello "+name;
    }

}   // ola teste funcional 
*/