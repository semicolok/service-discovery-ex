package ex.discovery.controller;

import com.google.common.collect.Maps;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<Map<String, Object>> hello() {
        final Map<String, Object> map = Maps.newHashMap();
        map.put("message", "This is account-service controller.");

        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
