package me.experiment.springbootdemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Person(
        val name: String,
        val age: Int,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1){
    private constructor(): this("",0)
}