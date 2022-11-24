package com.solera.team4.bancappbe.user

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import java.io.File

val usersFile: File = File("users.json")

@JsonIgnoreProperties(ignoreUnknown = true)
@Serializable
data class User(
  val ownerID: Int,
  val userName: String
) {
  companion object {
    @JvmStatic
    fun deserializeUsers(): List<User> {
      return Json.decodeFromStream(usersFile.inputStream())
    }
  }
}
