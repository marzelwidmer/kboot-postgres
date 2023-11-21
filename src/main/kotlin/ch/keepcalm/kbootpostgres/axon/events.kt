package ch.keepcalm.kbootpostgres.axon

data class OrderCreatedEvent(
    val orderId: String,
    val productId: String
)

//class OrderCreatedEvent {
//    private val orderId: String? = null
//    private val productId: String? = null // default constructor, getters, equals/hashCode and toString
//}
//
//
//class OrderConfirmedEvent {
//    private val orderId: String? = null // default constructor, getters, equals/hashCode and toString
//}
//
//
//class OrderShippedEvent {
//    private val orderId: String? = null // default constructor, getters, equals/hashCode and toString
//}
