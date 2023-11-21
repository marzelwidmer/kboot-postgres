package ch.keepcalm.kbootpostgres.rest


import org.springframework.stereotype.Service


@Service
class AlbumService(private val albumRestRepository: AlbumRestRepository) {
    fun getAllAlbums(userId: Int): List<AlbumResponse> {
        return albumRestRepository.findAllAlbumsForUser(userId = userId)
    }
}


