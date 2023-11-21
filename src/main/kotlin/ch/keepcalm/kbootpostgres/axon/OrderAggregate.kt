package ch.keepcalm.kbootpostgres.axon

import org.axonframework.commandhandling.CommandHandler
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.modelling.command.AggregateIdentifier
import org.axonframework.modelling.command.AggregateLifecycle
import org.axonframework.spring.stereotype.Aggregate

@Aggregate
class OrderAggregate {
    @AggregateIdentifier
    private var orderId: String? = null
    private var orderConfirmed = false

    @CommandHandler
    constructor(command: CreateOrderCommand) {
        AggregateLifecycle.apply(OrderCreatedEvent(command.orderId, command.productId))
    }

    @EventSourcingHandler
    fun on(event: OrderCreatedEvent) {
        orderId = event.orderId
        orderConfirmed = false
    }

    protected constructor()
}
