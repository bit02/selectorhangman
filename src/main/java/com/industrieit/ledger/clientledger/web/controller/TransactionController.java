package com.industrieit.ledger.clientledger.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.industrieit.ledger.clientledger.web.entity.TransactionEvent;
import com.industrieit.ledger.clientledger.web.exception.LedgerServiceErrorMessage;
import com.industrieit.ledger.clientledger.web.exception.ServiceException;
import com.industrieit.ledger.clientledger.web.model.ledger.Type;
import com.industrieit.ledger.clientledger.web.model.request.RequestEnvelop;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * REST Controller which is exclusively allowed to POST on the Ledger through creating and enqueuing {@link TransactionEvent}
 */
@RestControlle