package com.industrieit.ledger.clientledger.web.exception;


import com.industrieit.ledger.clientledger.web.entity.TransactionEvent;
import com.industrieit.ledger.clientledger.web.model.request.RequestEnvelop;

/**
 * Runtime transaction thrown before {@link RequestEnvelop} is accepted
 * No {@link TransactionEvent} will be created and enqueued when the exception is thrown
 */
public enum LedgerServiceErrorMessage implements MessageDetail {
    TYPE_NOT_SUPPORTED("LDR-1001", "Transaction Type Not Supported"),
    REQUEST_UNREADABLE("LDR-100