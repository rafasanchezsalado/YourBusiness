package com.yourbusiness.model

import java.util.UUID

data class User(val id: String = UUID.randomUUID().toString(),
                val username: String,
                val password: String,
                val name: String,
                val email: String,
                val business: Business) {}