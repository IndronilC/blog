package com.emids.spring.boot.kotlin.example.blog.conf

import com.emids.spring.boot.kotlin.example.blog.data.model.Article
import com.emids.spring.boot.kotlin.example.blog.data.model.ArticleRepository
import com.emids.spring.boot.kotlin.example.blog.data.model.User
import com.emids.spring.boot.kotlin.example.blog.data.model.UserRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {

    @Bean
    fun databaseInitializer(userRepository: UserRepository,
                            articleRepository: ArticleRepository
    ) = ApplicationRunner {

        val smaldini = userRepository.save(User("smaldini", "Stéphane", "Maldini"))
        articleRepository.save(
            Article(
            title = "Reactor Bismuth is out",
            headline = "Lorem ipsum",
            content = "dolor sit amet",
            author = smaldini
        )
        )
        articleRepository.save(Article(
            title = "Reactor Aluminium has landed",
            headline = "Lorem ipsum",
            content = "dolor sit amet",
            author = smaldini
        ))
    }
}