package com.emids.spring.boot.kotlin.example.blog

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
//@ComponentScan(basePackages = arrayOf("com.emids.spring.boot.kotlin.example.blog.controller"))
class BlogApplication

	fun main(args: Array<String>) {
		runApplication<BlogApplication>(*args) {
			setBannerMode(Banner.Mode.OFF)
		}
	}
