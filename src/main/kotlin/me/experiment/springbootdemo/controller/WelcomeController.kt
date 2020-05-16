package me.experiment.springbootdemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class WelcomeController{
    @GetMapping("/")
    fun root(): String{
        return "Welcome"
    }
    @GetMapping("/welcome")
    fun welcome(@RequestParam name: String): String{
        return "Welcome $name"
    }
}