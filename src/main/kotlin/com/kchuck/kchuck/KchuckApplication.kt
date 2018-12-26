package com.kchuck.kchuck

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KchuckApplication

fun main(args: Array<String>) {
    runApplication<KchuckApplication>(*args)
}
