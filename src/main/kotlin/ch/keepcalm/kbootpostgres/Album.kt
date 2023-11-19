package ch.keepcalm.kbootpostgres

import jakarta.validation.constraints.NotEmpty
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Version
import java.util.*

class Album(
    @Id
    val id: UUID,
    @NotEmpty
    val userId: String,
    @NotEmpty
    val title: String,
    @Version val version: Int?
)
