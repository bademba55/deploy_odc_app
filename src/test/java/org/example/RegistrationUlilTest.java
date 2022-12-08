package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationUlilTest {

    RegistrationUlil register;

    @BeforeEach
    void setUp() {
        register = new RegistrationUlil();
    }
    @Test
    void test_correct_input(){

    }

    @Test
    void si_les_champs_sont_remplis(){
        assertTrue(register.validateUserInput("Bademba", "12345","12345"));
    }
    @Test
    void si_les_champs_sont_vide(){
        assertFalse(register.validateUserInput("", "", ""));
    }

}