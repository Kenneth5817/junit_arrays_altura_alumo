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
        void aniadeNombreArrayVacio() {

            //When (Cuando)
            //Array lleno
            //nombre no nulo ni vacio
            String[] array = new String[0];
            String nombre = "Jose";

            String[] arrayActual = AlturaAlumno.añadeNombre(array, nombre);

            //Then (Entonces)

            //arrayActual es posicion longitud +1 que array
            //arrayActual tiene en la última posicion nombre
            // arrayActual contiene a Array inicial

            assertTrue(arrayActual.length == array.length + 1);
            assertEquals(nombre, arrayActual[arrayActual.length - 1]);
            //for(int =0; i<array.length; i++) assertEquals(array[i], arrayActual[i]);

            //Arrays.CopyOf()
            assertArrayEquals(array,
                    Arrays.copyOfRange(arrayActual, 0, array.length));

        }

        @Test
        void modificaAltura(){
            //        when //
            double [] array= {1.7d,1.8d,2.1d};

            int posicion=1;
            double altura=2;

            AlturaAlumno.modificaAltura(array, posicion, altura);
            assertEquals(altura, array[posicion]);
            //do    //
            //then    //
        }

        @Test
        void añadeAltura(){
            double [] array= {1.7d,1.8d,2.1d};

            double alturaDefecto=1.5;

            double[] arrayActual = AlturaAlumno.añadeAltura(array);

            //Then (Entonces)

            //ArrayActuales posicion es longitud +1 que array
            //arrayActualtiene en la ultima posicion nombre
            //arrayActual contiene Array inicial

            assertTrue(arrayActual.length == array.length +1);
            assertEquals(alturaDefecto, arrayActual[arrayActual.length-1]);

            //Arrays CopyOF
            double [] actual= Arrays.copyOfRange(arrayActual,0, array.length);
            assertArrayEquals(array,
                    actual);

        }

        @Test

        void buscarNombre(){
            //when
            String nombreAlumno= "Jose";
            int posicion= 1;

            double [] arrayActual= nombreAlumno(posicion);
            assertsEquals(nombreAlumno, arrayActual[arrayActual.length -1]);

            //do
            //then
        }

        @Test
        void testModificaAltura() {
            // Crear un array de prueba
            double[] alturas = {1.7};
            int pos=0;
            double= alturanueva=1.85;
            Altura.modificaAltura(array, pos, alternativa);

            assertEquals(aray[pos], alturanueva);
        }

        @Test
        void testBuscaNombre() {
            // Crear un array de prueba
            String[] nombres = {"Ana", "Juan", "María", "Pedro"};

            // Buscar un nombre existente en el array
            int posicion = buscaNombre(nombres, "María");

            // Comprobar que la posición encontrada es la correcta
            assertEquals(2, posicion);

            // Buscar un nombre que no existe en el array
            int posicionNoEncontrada = buscaNombre(nombres, "Luis");

            // Comprobar que devuelve -1 cuando el nombre no existe
            assertEquals(-1, posicionNoEncontrada);
        }

        @Test
        void testMostrar() {
            // Crear un array de nombres y alturas de prueba
            String[] nombres = {"Ana", "Juan", "María", "Pedro"};
            double[] alturas = {1.65, 1.75, 1.70, 1.80};

            // Llamar al método mostrar y obtener la salida
            String salidaObtenida = mostrar(nombres, alturas);
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

    @Test
    void buscaNombre(){
        int indice=1;
        String[]nombres={"jose","cesar","lucas"};
        String nombre="lucas";

        int result = AlturaAlumno.buscaNombre(nombres,nombre);
        assertTrue(indice==result);
    }

}
