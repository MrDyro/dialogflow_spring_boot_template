package com.volkmar.dialogflow

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration

@SpringBootApplication
@EnableAutoConfiguration(exclude = arrayOf(JacksonAutoConfiguration::class))
open class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}