package org.iesvdm;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.iesvdm.AlturaAlumno.buscaNombre;
import static org.iesvdm.AlturaAlumno.mostrar;
import static org.junit.jupiter.api.Assertions.*;

public class AlturaAlumnoTest {
    private AlturaAlumno Altura;

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
        void aniadeAltura(){
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

        void buscarNombre() {
            // Datos de prueba
            String[] nombres = {"Ana", "Juan", "María", "Pedro"};
            String nombreAlumno = "Jose";
            int posicionEsperada = -1; // Suponiendo que "Jose" no se encuentra en el arreglo

            // Llamamos al método para buscar el nombre
            int posicionEncontrada = buscaNombre(nombres, nombreAlumno);

            // Comprobamos si la posición encontrada es la esperada
            assertEquals(posicionEsperada, posicionEncontrada);
        }
    private String nombreAlumno(String[] nombres, int posicion) {
        // Verificamos si la posición es válida
        if (posicion >= 0 && posicion < nombres.length) {
            // Devolvemos el nombre del alumno en la posición dada
            return nombres[posicion];
        } else {
            // Si la posición no es válida, devolvemos una cadena vacía o lanzar una excepción según sea necesario
            return "";
        }
    }

    private void assertsEquals(String nombreAlumno, double v) {
    }

    @Test
    void testModificaAltura() {
        // Crear un array de prueba
        double[] alturas = {1.7};
        int pos = 0;
        double alturanueva = 1.85;

        // Creamos un nuevo arreglo con el tamaño necesario
        double[] array = new double[alturas.length];
        // Copiar los valores del arreglo original al nuevo arreglo
        System.arraycopy(alturas, 0, array, 0, alturas.length);

        // Llamamos al método modificaAltura con el nuevo arreglo
        AlturaAlumno.modificaAltura(array, pos, alturanueva);

        // Verificamos si la altura en la posición indicada fue modificada correctamente
        assertEquals(alturanueva, array[pos]);
    }

    // Método de prueba que llama al método buscaNombre
    @Test
    void testBuscaNombre() {
        String[] nombres = {"jose", "cesar", "lucas"};
        String nombre = "lucas";
        int indiceEsperado = 2;

        int resultado = buscaNombre(nombres, nombre); // Llamada al método buscaNombre

        assertEquals(indiceEsperado, resultado);
    }

    @Test
        void testMostrar() {
            // Creamos un array de nombres y alturas de prueba
            String[] nombres = {"Ana", "Juan", "María", "Pedro"};
            double[] alturas = {1.65, 1.75, 1.70, 1.80};

            // Llamamos al método mostrar y obtenemos la salida
            String salidaObtenida = mostrar(nombres, alturas);
        }
    @Test
    void aniadeNombreTest2() {
        final String[] array = new String[0];
        int longInicial = array.length;

        String nombre = "María";
        String[] arrayActual = AlturaAlumno.añadeNombre(array, nombre);

        assertEquals(longInicial + 1, arrayActual.length);
        assertEquals(nombre, arrayActual[longInicial]); // Accede al último índice válido
    }


    @Test
    public void testCalculaMaximo() {
        double[] array = {3.5, 2.0, 7.8, 4.2, 5.1};

        // Llamamos al método calculaMaximo de la clase AlturaAlumno
        double[] resultado = AlturaAlumno.calculaMaximo(array);

        // Ponemos como quedaría el resultado
        double[] resultadoEsperado = {2.0, 7.8}; // La posición del máximo es 2 y el máximo es 7.8

        // Comprobamos si son iguales los resultados
        assertArrayEquals(resultadoEsperado, resultado, 0.01);
    }

    @Test
    public void testCalculaMedia() {

        double[] array = {3.5, 2.0, 7.8, 4.2, 5.1};

        // Llamamos al método calculaMedia de la clase AlturaAlumno
        double calculoMedia = AlturaAlumno.calculaMedia(array);

        //Calculamos la media
        double suma = 0.0;
        for (double valor : array) {
            suma += valor;
        }
        double mediaResultado = suma / array.length;

        // Verificamos que los resultados son iguales
        assertEquals(mediaResultado, calculoMedia, 0.0001);
    }




}
