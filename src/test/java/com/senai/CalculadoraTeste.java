package com.senai;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTeste {
    // Cria uma anotação Test
    @Test 
    void testarSoma(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(3, 2);

        //metodo para comparar o resultado
        assertEquals(5, resultado);
    }
}
