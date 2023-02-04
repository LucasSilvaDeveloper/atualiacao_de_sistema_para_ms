package br.com.fisio.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Atendimento API")
                        .description("Api de agendamento de atendimento")
                        .version("v0.0.1")
                        .contact(new Contact().email("LucasSilva_Developer@hotmail.com")
                                .name("Lucas de Oliveira da Silva")));
    }
}
