package com.yourbusiness.model

import java.util.UUID

data class Brand(val id: String = UUID.randomUUID().toString(),
                 val name: String) {}