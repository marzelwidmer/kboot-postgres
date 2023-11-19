package ch.keepcalm.kbootpostgres

import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface AlbumRepository : CrudRepository<Album, UUID>
