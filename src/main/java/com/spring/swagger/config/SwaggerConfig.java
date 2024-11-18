package com.spring.swagger.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Mostafa Khater",
                        email = "mostafaaliramadan08@gmail.com",
                        url = "https://www.linkedin.com/in/mostafa-ali-khater?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app"
                ),
                description = "Api for SpringBoot",
                title = "Khater",
                version = "1.0",
                license = @License(
                        name = "Licence name",
                        url = "https://swagger.io/"
                ),
                termsOfService = "Terms of Service"

        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8080/"
                ),
                @Server(
                        description = "Swagger ENV",
                        url = "https://swagger.io/"
                )
        },
        security = {
                @SecurityRequirement(
                        name = "bearerAuth"
                )
        }
)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth descrption",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class SwaggerConfig {


}