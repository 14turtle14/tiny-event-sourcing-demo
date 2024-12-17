package ru.quipy.projections.status

import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface StatusProjection : MongoRepository<StatusProjectionData, UUID> {
}