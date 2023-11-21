package ch.keepcalm.kbootpostgres

import ch.keepcalm.kbootpostgres.axon.CreateOrderCommand
import ch.keepcalm.kbootpostgres.axon.OrderAggregate
import ch.keepcalm.kbootpostgres.rest.AlbumService
import ch.keepcalm.kbootpostgres.store.AlbumRepository
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component


const val SCHEDULE_TIME = 30000L // 30 Sec


@Component
@EnableScheduling
class ScheduledTasks(
    private val albumRepository: AlbumRepository,
    private val albumService: AlbumService
    ) {

    @OptIn(DelicateCoroutinesApi::class)
    @Scheduled(fixedRate = SCHEDULE_TIME)
    fun fixedRateScheduledTask() {


      /*  val createOrderCommand = CreateOrderCommand(orderId = "oderId1", productId = "TODO")
        OrderAggregate(createOrderCommand)*/


        GlobalScope.launch {

            println("Found ${albumRepository.findAll().count()} - records")

            albumRepository.findAll().forEach { album ->

                println("Album Id: ${album.albumId}")
                println("UserId: ${album.userId}")

                while (isActive) { // checks if the coroutine is still active
                    val albumList = albumService.getAllAlbums(userId = album.userId)
                        .map { albumResponse ->
                            println(albumResponse.title)
                        }
                    println("--------------------->>>>>>>>>>>>>>>>>>>   $albumList <<<<<<<<<<<<<<<<<<<<<<<<------------------")
                }
            }
        }
    }
}
