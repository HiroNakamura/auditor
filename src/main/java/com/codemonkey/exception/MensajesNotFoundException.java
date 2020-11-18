package com.codemonkey.exception;

import org.springframework.core.NestedRuntimeException;

public class MensajesNotFoundException extends NestedRuntimeException {
    public MensajesNotFoundException(String id) {
        super(String.format("Mensaje con id '%s' no ha sido encontrado!!", id));
    }
}