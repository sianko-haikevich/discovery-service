package by.senko.gaykevich.discoveryservice

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import kotlin.jvm.JvmStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.runApplication

@EnableEurekaServer
@EnableConfigServer
@SpringBootApplication
class DiscoveryServiceApplication

fun main() {
    runApplication<DiscoveryServiceApplication>()
}

