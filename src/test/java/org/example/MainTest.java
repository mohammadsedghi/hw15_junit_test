package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {
Main main;
    @BeforeEach
    void setUp() {
     main=new Main();
    }
    @ParameterizedTest
    @ValueSource(strings = {"12","25","-4000","32767","-32767"})
    void successfulConvert(String number) {
        assertEquals("ok", Main.convert(number));


    }
    @Test
    void getExceptionForSuccessfulConvert(){
       // NumberFormatException numberFormatException = assertThrows(NumberFormatException.class, () -> Main.convert("abc"));
      //  assertEquals("number format exception",numberFormatException.getMessage());
        try {
            Main.convert("abc");
        }catch (NumberFormatException e){
            assertTrue(e.getMessage().equals("number format exception"));
        }
    }
    @ParameterizedTest
   // @ValueSource(strings = {"12","25","-4000","32767","-32767"})
    @CsvSource({"12,ok","25,ok","-4000,ok","32767,ok","-32767,ok"})
    void successfulConvertTest(String number,String expected) {
        assertEquals(expected, Main.convert(number));


    }
}