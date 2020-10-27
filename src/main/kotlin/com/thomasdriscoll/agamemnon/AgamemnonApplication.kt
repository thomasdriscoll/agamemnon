package com.thomasdriscoll.agamemnon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AgamemnonApplication

fun main(args: Array<String>) {
    runApplication<AgamemnonApplication>(*args)
}
