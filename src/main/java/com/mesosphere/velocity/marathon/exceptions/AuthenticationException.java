package com.mesosphere.velocity.marathon.exceptions;

public class AuthenticationException extends Exception {

    public AuthenticationException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}