package ru.quipy.projections.task

import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface TaskProjection : MongoRepository<TaskProjectionData, UUID> {
    fun findAllByAssigneeId(id: UUID): MutableIterable<TaskProjectionData>
    fun findAllByStatusId(id: UUID): MutableIterable<TaskProjectionData>
}