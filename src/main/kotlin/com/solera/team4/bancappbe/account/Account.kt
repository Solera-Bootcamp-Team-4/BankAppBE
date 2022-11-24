package com.solera.team4.bancappbe.account

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import java.io.File

val accountsFile: File = File("accounts.json")

@JsonIgnoreProperties(ignoreUnknown = true)
@Serializable
data class Account(
  val ownerID: Int,
  val balance: Double
) {
  companion object {
    @JvmStatic
    fun deserializeTeams(): List<Account> {
      return Json.decodeFromStream(accountsFile.inputStream())
    }
  }
}