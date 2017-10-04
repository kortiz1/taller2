package com.example.android.taller2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void caso1() throws Exception {
        int p = 0, opcion1 = 0, opcion2 = 0, opcion3 = 0, cant = 1;
        int resultado = 0;


        if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 0;

        } else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 1;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 2;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 3;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 4;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 5;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 6;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 7;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 8;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 9;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 10;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 11;
        }


        switch (p) {

            case 0:
                resultado = (120) * cant;

                break;

            case 1:
                resultado = (50) * cant;

                break;

            case 2:
                resultado = (140) * cant;

                break;

            case 3:
                resultado = (80) * cant;

                break;

            case 4:
                resultado = (130) * cant;

                break;

            case 5:
                resultado = (100) * cant;

                break;

            case 6:
                resultado = (100) * cant;

                break;

            case 7:
                resultado = (60) * cant;

                break;

            case 8:
                resultado = (130) * cant;

                break;

            case 9:
                resultado = (70) * cant;

                break;

            case 10:
                resultado = (110) * cant;

                break;

            case 11:
                resultado = (120) * cant;

                break;

        }

        assertEquals(resultado * 1000, 120000);

    }



    @Test
    public void caso2() throws Exception {
        int p = 1, opcion1 = 0, opcion2 = 0, opcion3 = 1, cant = 1;
        int resultado = 0;


        if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 0;

        } else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 1;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 2;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 3;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 4;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 5;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 6;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 7;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 8;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 9;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 10;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 11;
        }


        switch (p) {

            case 0:
                resultado = (120) * cant;

                break;

            case 1:
                resultado = (50) * cant;

                break;

            case 2:
                resultado = (140) * cant;

                break;

            case 3:
                resultado = (80) * cant;

                break;

            case 4:
                resultado = (130) * cant;

                break;

            case 5:
                resultado = (100) * cant;

                break;

            case 6:
                resultado = (100) * cant;

                break;

            case 7:
                resultado = (60) * cant;

                break;

            case 8:
                resultado = (130) * cant;

                break;

            case 9:
                resultado = (70) * cant;

                break;

            case 10:
                resultado = (110) * cant;

                break;

            case 11:
                resultado = (120) * cant;

                break;

        }

        assertEquals(resultado * 1000, 50000);

    }

    @Test
    public void caso3() throws Exception {
        int p = 2, opcion1 = 0, opcion2 = 1, opcion3 = 0, cant = 1;
        int resultado = 0;


        if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 0;

        } else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 1;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 2;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 3;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 4;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 5;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 6;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 7;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 8;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 9;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 10;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 11;
        }


        switch (p) {

            case 0:
                resultado = (120) * cant;

                break;

            case 1:
                resultado = (50) * cant;

                break;

            case 2:
                resultado = (140) * cant;

                break;

            case 3:
                resultado = (80) * cant;

                break;

            case 4:
                resultado = (130) * cant;

                break;

            case 5:
                resultado = (100) * cant;

                break;

            case 6:
                resultado = (100) * cant;

                break;

            case 7:
                resultado = (60) * cant;

                break;

            case 8:
                resultado = (130) * cant;

                break;

            case 9:
                resultado = (70) * cant;

                break;

            case 10:
                resultado = (110) * cant;

                break;

            case 11:
                resultado = (120) * cant;

                break;

        }

        assertEquals(resultado * 1000, 140000);

    }

    @Test
    public void caso4() throws Exception {
        int p = 3, opcion1 = 0, opcion2 = 1, opcion3 = 1, cant = 1;
        int resultado = 0;


        if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 0;

        } else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 1;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 2;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 3;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 4;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 5;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 6;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 7;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 8;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 9;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 10;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 11;
        }


        switch (p) {

            case 0:
                resultado = (120) * cant;

                break;

            case 1:
                resultado = (50) * cant;

                break;

            case 2:
                resultado = (140) * cant;

                break;

            case 3:
                resultado = (80) * cant;

                break;

            case 4:
                resultado = (130) * cant;

                break;

            case 5:
                resultado = (100) * cant;

                break;

            case 6:
                resultado = (100) * cant;

                break;

            case 7:
                resultado = (60) * cant;

                break;

            case 8:
                resultado = (130) * cant;

                break;

            case 9:
                resultado = (70) * cant;

                break;

            case 10:
                resultado = (110) * cant;

                break;

            case 11:
                resultado = (120) * cant;

                break;

        }

        assertEquals(resultado * 1000, 80000);

    }

    @Test
    public void caso5() throws Exception {
        int p = 4, opcion1 = 0, opcion2 = 2, opcion3 = 0, cant = 1;
        int resultado = 0;


        if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 0;

        } else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 1;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 2;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 3;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 4;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 5;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 6;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 7;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 8;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 9;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 10;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 11;
        }


        switch (p) {

            case 0:
                resultado = (120) * cant;

                break;

            case 1:
                resultado = (50) * cant;

                break;

            case 2:
                resultado = (140) * cant;

                break;

            case 3:
                resultado = (80) * cant;

                break;

            case 4:
                resultado = (130) * cant;

                break;

            case 5:
                resultado = (100) * cant;

                break;

            case 6:
                resultado = (100) * cant;

                break;

            case 7:
                resultado = (60) * cant;

                break;

            case 8:
                resultado = (130) * cant;

                break;

            case 9:
                resultado = (70) * cant;

                break;

            case 10:
                resultado = (110) * cant;

                break;

            case 11:
                resultado = (120) * cant;

                break;

        }

        assertEquals(resultado * 1000, 130000);

    }

    @Test
    public void caso6() throws Exception {
        int p = 5, opcion1 = 0, opcion2 = 2, opcion3 = 1, cant = 1;
        int resultado = 0;


        if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 0;

        } else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 1;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 2;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 3;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 4;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 5;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 6;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 7;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 8;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 9;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 10;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 11;
        }


        switch (p) {

            case 0:
                resultado = (120) * cant;

                break;

            case 1:
                resultado = (50) * cant;

                break;

            case 2:
                resultado = (140) * cant;

                break;

            case 3:
                resultado = (80) * cant;

                break;

            case 4:
                resultado = (130) * cant;

                break;

            case 5:
                resultado = (100) * cant;

                break;

            case 6:
                resultado = (100) * cant;

                break;

            case 7:
                resultado = (60) * cant;

                break;

            case 8:
                resultado = (130) * cant;

                break;

            case 9:
                resultado = (70) * cant;

                break;

            case 10:
                resultado = (110) * cant;

                break;

            case 11:
                resultado = (120) * cant;

                break;

        }

        assertEquals(resultado * 1000, 100000);

    }

    @Test
    public void caso7() throws Exception {
        int p = 6, opcion1 = 1, opcion2 = 0, opcion3 = 0, cant = 1;
        int resultado = 0;


        if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 0;

        } else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 1;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 2;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 3;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 4;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 5;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 6;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 7;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 8;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 9;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 10;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 11;
        }


        switch (p) {

            case 0:
                resultado = (120) * cant;

                break;

            case 1:
                resultado = (50) * cant;

                break;

            case 2:
                resultado = (140) * cant;

                break;

            case 3:
                resultado = (80) * cant;

                break;

            case 4:
                resultado = (130) * cant;

                break;

            case 5:
                resultado = (100) * cant;

                break;

            case 6:
                resultado = (100) * cant;

                break;

            case 7:
                resultado = (60) * cant;

                break;

            case 8:
                resultado = (130) * cant;

                break;

            case 9:
                resultado = (70) * cant;

                break;

            case 10:
                resultado = (110) * cant;

                break;

            case 11:
                resultado = (120) * cant;

                break;

        }

        assertEquals(resultado * 1000, 100000);

    }

    @Test
    public void caso8() throws Exception {
        int p = 7, opcion1 = 1, opcion2 = 0, opcion3 = 1, cant = 1;
        int resultado = 0;


        if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 0;

        } else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 1;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 2;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 3;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 4;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 5;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 6;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 7;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 8;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 9;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 10;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 11;
        }


        switch (p) {

            case 0:
                resultado = (120) * cant;

                break;

            case 1:
                resultado = (50) * cant;

                break;

            case 2:
                resultado = (140) * cant;

                break;

            case 3:
                resultado = (80) * cant;

                break;

            case 4:
                resultado = (130) * cant;

                break;

            case 5:
                resultado = (100) * cant;

                break;

            case 6:
                resultado = (100) * cant;

                break;

            case 7:
                resultado = (60) * cant;

                break;

            case 8:
                resultado = (130) * cant;

                break;

            case 9:
                resultado = (70) * cant;

                break;

            case 10:
                resultado = (110) * cant;

                break;

            case 11:
                resultado = (120) * cant;

                break;

        }

        assertEquals(resultado * 1000, 60000);

    }

    @Test
    public void caso9() throws Exception {
        int p = 8, opcion1 = 1, opcion2 = 1, opcion3 = 0, cant = 1;
        int resultado = 0;


        if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 0;

        } else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 1;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 2;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 3;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 4;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 5;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 6;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 7;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 8;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 9;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 10;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 11;
        }


        switch (p) {

            case 0:
                resultado = (120) * cant;

                break;

            case 1:
                resultado = (50) * cant;

                break;

            case 2:
                resultado = (140) * cant;

                break;

            case 3:
                resultado = (80) * cant;

                break;

            case 4:
                resultado = (130) * cant;

                break;

            case 5:
                resultado = (100) * cant;

                break;

            case 6:
                resultado = (100) * cant;

                break;

            case 7:
                resultado = (60) * cant;

                break;

            case 8:
                resultado = (130) * cant;

                break;

            case 9:
                resultado = (70) * cant;

                break;

            case 10:
                resultado = (110) * cant;

                break;

            case 11:
                resultado = (120) * cant;

                break;

        }

        assertEquals(resultado * 1000, 130000);

    }


    @Test
    public void caso10() throws Exception {
        int p = 9, opcion1 = 1, opcion2 = 1, opcion3 = 1, cant = 1;
        int resultado = 0;


        if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 0;

        } else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 1;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 2;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 3;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 4;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 5;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 6;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 7;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 8;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 9;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 10;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 11;
        }


        switch (p) {

            case 0:
                resultado = (120) * cant;

                break;

            case 1:
                resultado = (50) * cant;

                break;

            case 2:
                resultado = (140) * cant;

                break;

            case 3:
                resultado = (80) * cant;

                break;

            case 4:
                resultado = (130) * cant;

                break;

            case 5:
                resultado = (100) * cant;

                break;

            case 6:
                resultado = (100) * cant;

                break;

            case 7:
                resultado = (60) * cant;

                break;

            case 8:
                resultado = (130) * cant;

                break;

            case 9:
                resultado = (70) * cant;

                break;

            case 10:
                resultado = (110) * cant;

                break;

            case 11:
                resultado = (120) * cant;

                break;

        }

        assertEquals(resultado * 1000, 70000);

    }

    @Test
    public void caso11() throws Exception {
        int p = 10, opcion1 = 1, opcion2 = 2, opcion3 = 0, cant = 1;
        int resultado = 0;


        if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 0;

        } else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 1;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 2;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 3;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 4;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 5;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 6;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 7;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 8;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 9;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 10;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 11;
        }


        switch (p) {

            case 0:
                resultado = (120) * cant;

                break;

            case 1:
                resultado = (50) * cant;

                break;

            case 2:
                resultado = (140) * cant;

                break;

            case 3:
                resultado = (80) * cant;

                break;

            case 4:
                resultado = (130) * cant;

                break;

            case 5:
                resultado = (100) * cant;

                break;

            case 6:
                resultado = (100) * cant;

                break;

            case 7:
                resultado = (60) * cant;

                break;

            case 8:
                resultado = (130) * cant;

                break;

            case 9:
                resultado = (70) * cant;

                break;

            case 10:
                resultado = (110) * cant;

                break;

            case 11:
                resultado = (120) * cant;

                break;

        }

        assertEquals(resultado * 1000, 110000);

    }


    @Test
    public void caso12() throws Exception {
        int p = 11, opcion1 = 1, opcion2 = 2, opcion3 = 1, cant = 1;
        int resultado = 0;


        if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 0;

        } else if ((opcion1 == 0) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 1;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 2;
        } else if ((opcion1 == 0) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 3;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 4;
        } else if ((opcion1 == 0) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 5;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 0)) {

            p = 6;

        } else if ((opcion1 == 1) && (opcion2 == 0) && (opcion3 == 1)) {

            p = 7;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 0)) {

            p = 8;
        } else if ((opcion1 == 1) && (opcion2 == 1) && (opcion3 == 1)) {

            p = 9;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 0)) {

            p = 10;
        } else if ((opcion1 == 1) && (opcion2 == 2) && (opcion3 == 1)) {

            p = 11;
        }


        switch (p) {

            case 0:
                resultado = (120) * cant;

                break;

            case 1:
                resultado = (50) * cant;

                break;

            case 2:
                resultado = (140) * cant;

                break;

            case 3:
                resultado = (80) * cant;

                break;

            case 4:
                resultado = (130) * cant;

                break;

            case 5:
                resultado = (100) * cant;

                break;

            case 6:
                resultado = (100) * cant;

                break;

            case 7:
                resultado = (60) * cant;

                break;

            case 8:
                resultado = (130) * cant;

                break;

            case 9:
                resultado = (70) * cant;

                break;

            case 10:
                resultado = (110) * cant;

                break;

            case 11:
                resultado = (120) * cant;

                break;

        }

        assertEquals(resultado * 1000, 120000);

    }




}