package com.kchuck.kchuck.repositories

import com.kchuck.kchuck.models.KhuckModel
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface KhuckRepository : MongoRepository<KhuckModel, String>
