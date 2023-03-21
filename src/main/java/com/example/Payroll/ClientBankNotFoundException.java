package com.example.Payroll;

class ClientBankNotFoundException extends RuntimeException {

    ClientBankNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}