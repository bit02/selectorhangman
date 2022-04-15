package com.industrieit.ledger.clientledger.web.exception;


public class ServiceException extends RuntimeException {

    private String errorCode;

    private String errorMessage;

    public ServiceException(MessageDetail mess