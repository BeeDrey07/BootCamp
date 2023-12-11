/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author Bianca
 */
public class InvalidOperationException extends Exception {
    InvalidOperationException() {
        super();
    }
    
    InvalidOperationException(String message) {
        super(message);
    }
    
     InvalidOperationException(Throwable cause) {
        super(cause);
    }
    
     InvalidOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
