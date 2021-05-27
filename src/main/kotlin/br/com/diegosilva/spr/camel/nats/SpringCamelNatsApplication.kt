package br.com.diegosilva.spr.camel.nats

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCamelNatsApplication

fun main(args: Array<String>) {
	runApplication<SpringCamelNatsApplication>(*args)
}
