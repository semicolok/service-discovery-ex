package ex.discovery.controller;

import com.google.common.collect.Maps;
import ex.discovery.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping("/hello")
    public ResponseEntity<Map<String, Object>> hello() {
        helloService.printMessage();

        final Map<String, Object> map = Maps.newHashMap();
        map.put("message", "This is setting-service controller.");

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

}
