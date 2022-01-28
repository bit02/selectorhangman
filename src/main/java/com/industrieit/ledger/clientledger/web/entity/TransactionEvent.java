
package com.industrieit.ledger.clientledger.web.entity;

import com.industrieit.ledger.clientledger.web.model.ledger.Type;

/**
 * Entity which represents an accepted and enqueued high-level transaction, fully packed into a self-contained event
 * {@link TransactionEvent} can be consumed by consumer
 * On consumption, exactly one Transaction Result will be produced and persisted.
 * The full enqueued list of {@link TransactionEvent}, in a strict serial order, will form the basis of Event Sourcing.
 * Event sourcing allows the full state of the ledger be replayed, on any platform and infrastructure, with any processors.
 * This allows in-memory processing and reliable recovery from crash.
 */

public class TransactionEvent {
    private String id;
    private String type;
    private String request;

    /**