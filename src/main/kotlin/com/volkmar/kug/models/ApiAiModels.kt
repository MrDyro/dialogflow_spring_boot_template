package com.volkmar.kug.models

data class ApiAiRequest(val id: String,
                        val timestamp: String,
                        val lang: String,
                        val result: ApiAiResult,
                        val status: ApiAiStatus,
                        val sessionId: String,
                        val originalRequest: ApiAiOriginalRequest?)

data class ApiAiStatus(val code: Int,
                       val errorType: String?,
                       val errorId: String?,
                       val errorDetails: String?)

data class ApiAiResult(val source: String,
                       val resolvedQuery: String,
                       val action: String,
                       val actionIncomplete: Boolean,
                       val parameters: Map<String, String>,
                       val contexts: List<ApiAiContext>,
                       val fulfillment: ApiAiFulfillment,
                       val score: Double,
                       val metadata: ApiAiMetadata)

data class ApiAiMetadata(val intentId: String?,
                         val webhookUsed: String?,
                         val webhookForSlotFillingUsed: String?,
                         val intentName: String?)

data class ApiAiFulfillment(val speech: String,
                            val messages: List<ApiAiMessage>)

data class ApiAiMessage(val type: Int,
                        val speech: String)

data class ApiAiContext(val name: String,
                        val parameters: Map<String, String>,
                        val lifespan: Int)

data class ApiAiResponse(val speech: String,
                         val displayText: String,
                         val data: Map<String, Any>,
                         val contextOut: List<ApiAiContext>,
                         val source: String = "KUG-CGN",
                         val followupEvent: ApiAiFollowUpEvent? = null)

data class ApiAiFollowUpEvent(val name: String,
                              val data: Map<String, Any>)

data class ApiAiOriginalRequest(val source: String?,
                                val version: Double?,
                                val data: ApiAiOriginalRequestData?)

data class ApiAiOriginalRequestData(val user: ApiAiOriginalRequestDataUser?)

data class ApiAiOriginalRequestDataUser(val accessToken: String?,
                                        val locale: String?,
                                        val userId: String?)