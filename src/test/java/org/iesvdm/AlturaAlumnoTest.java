package org.iesvdm;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AlturaAlumnoTest {
    @Test
    void verdadero() {
        assertTrue(1==1);
    }


    @Test
    void aniadeNombreTest1() {


        final String[] array = new String[2];

        array[0]="Jose";
        array[1]="Paco";

        String nombre = "María";
        String[] arrayActual = AlturaAlumno
                .añadeNombre(array, nombre);

        assertTrue(arrayActual[arrayActual.length-1]
                    .equals(nombre) );

        for (int i = 0; i< array.length;i++)
            assertEquals(array[i], arrayActual[i]);

//        String[] arrayExpected = Arrays.copyOf(array, array.length+1);
//        arrayExpected[arrayExpected.length-1]=nombre;
//
//        assertArrayEquals(arrayExpected, arrayActual);

    }

    @Test
    void aniadeNombreTest2() {


        final String[] array = new String[0];

        int longInicial = array.length;

        String nombre = "María";
        String[] arrayActual = AlturaAlumno
                .añadeNombre(array, nombre);

//        assertTrue(arrayActual[arrayActual.length-1]
//                .equals(nombre) );
        assertEquals(longInicial+1, arrayActual.length);
        assertEquals(nombre, arrayActual[longInicial+1]);



    }

}
