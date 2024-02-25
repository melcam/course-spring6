package com.melcam.springbootweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//personalizando el properties por defecto
@PropertySources({
        @PropertySource("classpath:application.properties"),
        @PropertySource(value = "classpath:values.properties",encoding = "UTF-8")
})
public class ValuesConfig {
}
