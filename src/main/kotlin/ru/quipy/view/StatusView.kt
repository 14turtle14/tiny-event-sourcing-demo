package ru.quipy.view

import ru.quipy.projections.status.StatusProjectionData
import java.util.*

data class StatusView (
    val id: UUID,
    val name: String,
) {
    companion object {
        fun fromProjection(projection: StatusProjectionData) = with(projection) {
            StatusView(id, name)
        }

        fun fromProjection(projection: Optional<StatusProjectionData>) =
            if (projection.isPresent) Optional.of(Companion.fromProjection(projection.get()))
            else Optional.empty()
    }
}
