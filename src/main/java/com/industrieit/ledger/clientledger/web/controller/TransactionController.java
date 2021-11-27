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
@RestController
@RequestMapping("/transaction")
public class TransactionController {

    private final ObjectMapper objectMapper;
    private final KafkaTemplate<String, TransactionEvent> kafkaTemplate;
    public static final String TOPIC = "Transaction_Event";



    public TransactionController(
            ObjectMapper objectMapper,
            KafkaTemplate<String, TransactionEvent> kafkaTemplate) {
        this.objectMapper = objectMapper;
        this.kafkaTemplate = kafkaTemplate;
    }

    /**
     * Create and Enqueue one {@link Transactio