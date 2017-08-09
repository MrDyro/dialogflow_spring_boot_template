package com.volkmar.kug

import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.GsonHttpMessageConverter
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@Configuration
@EnableWebMvc
open class Config : WebMvcConfigurerAdapter() {
    override fun configureMessageConverters(converters: MutableList<HttpMessageConverter<*>>?) {
        converters?.add(GsonHttpMessageConverter())
        super.configureMessageConverters(converters)
    }
}