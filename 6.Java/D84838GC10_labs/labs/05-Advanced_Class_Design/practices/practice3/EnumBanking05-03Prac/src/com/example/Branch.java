/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.example;

/**
 *
 * @author Bianca
 */
public enum Branch {
    LA("Basic"), BOSTON("Loan"), BANGALORE("Full"), MUMBAI("Full");
    
    String serviceLevel;
    private Branch(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }
    
    public String getServiceLevel() {
        return serviceLevel;
    }
}
