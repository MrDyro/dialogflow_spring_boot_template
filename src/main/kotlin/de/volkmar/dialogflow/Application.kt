package de.volkmar.dialogflow

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration
import org.springframework.boot.web.support.SpringBootServletInitializer

@SpringBootApplication
@EnableAutoConfiguration(exclude = [(JacksonAutoConfiguration::class)])
class Application : SpringBootServletInitializer()

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}