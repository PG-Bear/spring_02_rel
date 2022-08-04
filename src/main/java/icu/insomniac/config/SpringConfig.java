package icu.insomniac.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("icu.insomniac")
@PropertySource("my.properties")
public class SpringConfig {
}
