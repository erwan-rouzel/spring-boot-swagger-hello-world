package hello;

import io.swagger.annotations.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@ComponentScan("hello")
public class HelloWorld {

    @ApiOperation(value = "hello", nickname = "hello")
    @RequestMapping(method = RequestMethod.GET, path="/hello", produces = "application/json")
    @ResponseBody
    String hello() {
        return "{message: Hello World!}";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorld.class, args);
    }
}
