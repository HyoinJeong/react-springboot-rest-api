package com.example.gccoffee.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {
    @Test
    public void testInvalidEmail(){
        assertThrows(IllegalArgumentException.class,()->{
            var email = new Email("asdf");
        });
    }

    @Test
    public void testValidEmail(){
        var email = new Email("test@gmail.com");
        assertTrue(email.getAddress().equals("test@gmail.com"));
    }

    @Test
    public void testEqEmail(){
        var email = new Email("test@gmail.com");
        var email2 = new Email("test@gmail.com");
        assertEquals(email,email2);
    }
}