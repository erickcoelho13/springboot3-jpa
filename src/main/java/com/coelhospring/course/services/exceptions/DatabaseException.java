package com.coelhospring.course.services.exceptions;

import javax.xml.crypto.Data;

public class DatabaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DatabaseException(String msg) {
        super(msg);
    }
}
