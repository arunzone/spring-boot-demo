package me.experiment.springbootdemo.controller

import me.experiment.springbootdemo.model.Person
import me.experiment.springbootdemo.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController (@Autowired private val repository: PersonRepository){
    @GetMapping("/person")
    fun persons(): Iterable<Person>{
        return repository.findAll()
    }

}