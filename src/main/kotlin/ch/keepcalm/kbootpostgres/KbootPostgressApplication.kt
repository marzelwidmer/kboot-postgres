package ch.keepcalm.kbootpostgres


import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.beans
import java.util.*

@SpringBootApplication
class KbootPostgressApplication

fun main(args: Array<String>) {
    runApplication<KbootPostgressApplication>(*args) {
        addInitializers(
            beans {
                bean {
                    val repository = ref<AlbumRepository>()
                    ApplicationRunner {
                        println("ApplicationRunner ----------------->")

                        val albumList = listOf(Album(UUID.randomUUID(), "justAUserId", "just a title", version = null))
                        repository.saveAll(albumList)
                    }
                }
            }
        )


    }
}
