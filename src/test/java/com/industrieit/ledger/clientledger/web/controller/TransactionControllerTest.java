package com.industrieit.ledger.clientledger.web.controller;

import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.industrieit.ledger.clientledger.web.entity.TransactionEvent;
import com.industrieit.ledger.clientledger.web.exception.LedgerServiceErrorMessage;
import com.industrieit.ledger.clientledger.web.exception.ServiceException;
import com.industrieit.ledger.clientledger.web.model.ledger.Type;
import com.industrieit.ledger.clientledger.web.model.request.RequestEnvelop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.kafka.core.KafkaTemplate;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.nullable;

public class TransactionControllerTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Mock
    private ObjectMapper objectMapper;
    @Mock
    private KafkaTemplate<String, TransactionEvent> kafkaTemplate;
    @InjectMocks
    private TransactionController transactionController;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
        Mockito.when(kafkaTemplate.send(nullable(String.class), nullable(TransactionEvent.class))).thenReturn(null);
    }

    @Test
    public void testQueueTransaction() throws IOException {
        RequestEnvelop requestEnvelop = new RequestEnvelop();
        requestEnvelop.setId("1234");
        requestEnvelop.setType(Type.P2P.toString());
        requestEnvelop.setRequest(null);
        Mockito.when(objectMapper.writeValueAsString(nullable(Object.class))).thenReturn("{}");
        TransactionEvent transactionEvent = transactionController.queue