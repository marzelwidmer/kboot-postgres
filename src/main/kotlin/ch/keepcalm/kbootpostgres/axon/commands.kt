package ch.keepcalm.kbootpostgres.axon

import org.axonframework.modelling.command.TargetAggregateIdentifier

//
//data class CreateOrderCommand {
//    @TargetAggregateIdentifier
//    private val orderId: String? = null
//    private val productId: String? = null // constructor, getters, equals/hashCode and toString
//}

//
//data class ConfirmOrderCommand {
//    @TargetAggregateIdentifier
//    private val orderId: String? = null // constructor, getters, equals/hashCode and toString
//}

//
//data class ShipOrderCommand {
//    @TargetAggregateIdentifier
//    private val orderId: String? = null // constructor, getters, equals/hashCode and toString
//}

data class CreateOrderCommand(
    val orderId: String,
    val productId: String,
)

data class ConfirmOrderCommand(@TargetAggregateIdentifier val orderId:  String)
