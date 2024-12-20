package com.pantxi.Perssonage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerssonageTest {
    @Test
 void  tournerde1_devraitretourne_EST(){

        //GIVEN
               String  expectedresult="EST";


        //WHEN

         String resultat =Perssonage.tourner(1 );

        //THEN

        assertEquals(expectedresult, resultat);
    }
@Test
void  tournerde2_devraitretourne_SUD(){

    //GIVEN
    String  expectedresult="SUD";


    //WHEN

    String resultat =Perssonage.tourner(2 );

    //THEN

    assertEquals(expectedresult, resultat);}

@Test
void  tournerde3_devraitretourne_ouest(){

    //GIVEN
    String  expectedresult="ouest";


    //WHEN

    String resultat =Perssonage.tourner(3 );

    //THEN

    assertEquals(expectedresult, resultat);}

@Test
void  tournerde4_devraitretourne_ouest(){

    //GIVEN
    String  expectedresult="nord";


    //WHEN

    String resultat =Perssonage.tourner(4 );

    //THEN

    assertEquals(expectedresult, resultat);}

@Test
void  tournerde5_devraitretourne_EST(){

    //GIVEN
    String  expectedresult="EST";


    //WHEN

    String resultat =Perssonage.tourner(5 );

    //THEN

    assertEquals(expectedresult, resultat);}
}






