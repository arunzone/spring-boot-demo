package me.experiment.springbootdemo.repository

import me.experiment.springbootdemo.model.Person
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository: CrudRepository<Person, Long>