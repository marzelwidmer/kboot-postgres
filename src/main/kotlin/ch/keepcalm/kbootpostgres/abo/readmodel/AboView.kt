package ch.keepcalm.kbootpostgres.abo.readmodel

import org.springframework.data.annotation.Id
import java.time.LocalDate
import java.util.*

class AboView(
    @Id val id: UUID,
    var eMail: String,
    var startDatum: LocalDate,
    var endeDatum: LocalDate?,
    var recipe: String?
)


