package com.example.Payroll.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Data
@AllArgsConstructor
@Entity
public
class ClientBank {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private Double balance;

    public ClientBank() {}

    public ClientBank(String name, double balance) {

        this.name = name;
        this.balance = balance;
    }

//    public Long getId() {
//        return this.id;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public double getBalance() {
//        return this.balance;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//
//        if (this == o)
//            return true;
//        if (!(o instanceof ClientBank))
//            return false;
//        ClientBank clientBank = (ClientBank) o;
//        return Objects.equals(this.id, clientBank.id) && Objects.equals(this.name, clientBank.name)
//                && Objects.equals(this.balance, clientBank.balance);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(this.id, this.name, this.balance);
//    }
//
//    @Override
//    public String toString() {
//        return "ClientBank{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.balance + '\'' + '}';
//    }
}