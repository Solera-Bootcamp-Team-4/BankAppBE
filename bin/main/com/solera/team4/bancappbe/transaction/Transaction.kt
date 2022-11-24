package com.solera.team4.bancappbe.transaction

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import java.io.File

val transactionsFile: File = File("transactions.json")

@JsonIgnoreProperties(ignoreUnknown = true)
@Serializable
data class Transaction(
  val transactionID: Int,
  val senderAccount: Int,
  val recipientAccount: Int,
  val amount: Double
) {
  companion object {
    @JvmStatic
    fun deserializeTransactions(): List<Transaction> {
      return Json.decodeFromStream(transactionsFile.inputStream())
    }
  }
}
