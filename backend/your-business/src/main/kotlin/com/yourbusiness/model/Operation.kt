package com.yourbusiness.model

import java.time.Instant
import java.util.UUID

data class Operation(val id: String = UUID.randomUUID().toString(),
                     val type: String,
                     val timestamp: String = Instant.now().toString()) {}