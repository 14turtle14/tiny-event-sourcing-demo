package ru.quipy.projections.project

import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface ProjectProjection : MongoRepository<ProjectProjectionData, UUID>