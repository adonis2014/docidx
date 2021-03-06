package net.deckerego.docidx.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "parser")
@Data
public class ParserConfig {
    private int ocrTimeoutSeconds = 300;
    private String ocrLanguage = "eng";
    private Boolean enableOcr = Boolean.TRUE;
}
