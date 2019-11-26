package ex.discovery.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloService {

    public void printMessage() {
        log.info("This is HelloService.");
    }
}
