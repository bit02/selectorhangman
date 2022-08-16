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
import org.mockito.InjectMock