package com.volkmar.dialogflow.models

data class DialogflowRequest(val id: String,
                             val timestamp: String,
                             val lang: String,
                             val result: DialogflowResult,
                             val status: DialogflowStatus,
                             val sessionId: String,
                             val originalRequest: DialogflowOriginalRequest?)

data class DialogflowStatus(val code: Int,
                            val errorType: String?,
                            val errorId: String?,
                            val errorDetails: String?)

data class DialogflowResult(val source: String,
                            val resolvedQuery: String,
                            val action: String,
                            val actionIncomplete: Boolean,
                            val parameters: Map<String, String>,
                            val contexts: List<DialogflowContext>,
                            val fulfillment: DialogflowFulfillment,
                            val score: Double,
                            val metadata: DialogflowMetadata)

data class DialogflowMetadata(val intentId: String?,
                              val webhookUsed: String?,
                              val webhookForSlotFillingUsed: String?,
                              val intentName: String?)

data class DialogflowFulfillment(val speech: String,
                                 val messages: List<Any>)

data class DialogflowContext(val name: String,
                             val parameters: Map<String, String>,
                             val lifespan: Int)

data class DialogflowResponse(val speech: String,
                              val displayText: String,
                              val data: Map<String, Any>,
                              val contextOut: List<DialogflowContext>,
                              val source: String,
                              val messages: List<Any>? = null,
                              val followupEvent: DialogflowFollowUpEvent? = null)

data class DialogflowFollowUpEvent(val name: String,
                                   val data: Map<String, Any>)

data class DialogflowOriginalRequest(val source: String,
                                     val version: Double?,
                                     val data: DialogflowOriginalRequestData?)

data class DialogflowOriginalRequestData(val user: DialogflowOriginalRequestDataUser?,
                                         val message: DialogflowOriginalRequestDataMessage?)

data class DialogflowOriginalRequestDataUser(val accessToken: String?,
                                             val locale: String?,
                                             val userId: String?)

data class DialogflowOriginalRequestDataMessage(val chat: DialogflowOriginalRequestDataMessageChat?)

data class DialogflowOriginalRequestDataMessageChat(val last_name: String?,
                                                    val id: String?,
                                                    val type: String?,
                                                    val first_name: String?,
                                                    val username: String?)

abstract class DialogflowMessage {
    abstract val type: Int
    abstract val platform: String?
}

data class DialogflowCardResponse(override val type: Int = 1,
                                  override val platform: String? = null,
                                  val title: String,
                                  val imageUrl: String? = null,
                                  val subtitle: String? = null,
                                  val buttons: List<CardButtons>? = null) : DialogflowMessage() {

    data class CardButtons(val text: String,
                           val postback: String)
}

data class DialogflowImageResponse(override val type: Int = 3,
                                   override val platform: String? = null,
                                   val imageUrl: String) : DialogflowMessage()

data class DialogflowQuickReplyResponse(override val type: Int = 2,
                                        override val platform: String? = null,
                                        val title: String,
                                        val replies: List<String>) : DialogflowMessage()

data class DialogflowTextResponse(override val type: Int = 0,
                                  override val platform: String? = null,
                                  val speech: String) : DialogflowMessage()

