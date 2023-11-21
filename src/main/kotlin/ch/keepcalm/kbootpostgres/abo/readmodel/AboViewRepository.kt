package ch.keepcalm.kbootpostgres.abo.readmodel

import org.springframework.data.repository.CrudRepository
import java.util.*

interface AboViewRepository : CrudRepository<AboView, UUID>
