package ex.discovery.config.openapi;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@Getter
@Setter
@EnableConfigurationProperties(OpenAPIProperties.class)
@ConfigurationProperties(prefix = "open.api")
public class OpenAPIProperties {
    private Info info;
    private List<Server> servers;
}
