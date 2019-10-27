/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {

    public static void main(String[] args) {
        
        //CONSTANTES
        String MUU = "Vaca";
        String BEE = "Oveja";
        String HIPHOP = "Burro";
        String KOROKO = "Gallina";
        int CANTIDAD_MUU = 3;
        int CANTIDAD_BEE = 14;
        int CANTIDAD_HIPHOP = 2;
        int CANTIDAD_KOROKO = 18;
        int CUADRUPEDOS = 4;
        int BIPEDOS = 2;
        
        //Variable
        int patasMuu = CANTIDAD_MUU * CUADRUPEDOS;
        int patasBee = CANTIDAD_BEE * CUADRUPEDOS;
        int patasHipHop = CANTIDAD_HIPHOP * CUADRUPEDOS;
        int patasKoroko = CANTIDAD_KOROKO * BIPEDOS;
        int totalPatas = patasMuu + patasBee + patasHipHop + patasKoroko;
        int totalPares = totalPatas / 2;
        //Rotulo
        System.out.printf("Secuencia de Patas %n====================%n");
        
        //Mensaje
        System.out.printf("Animal  ........: %s%n", MUU);
        System.out.printf("Cantidad .......: %d%n", CANTIDAD_MUU);
        System.out.printf("Patas ..........: %d%n---%n", patasMuu);
        System.out.printf("Animal  ........: %s%n", BEE);
        System.out.printf("Cantidad .......: %d%n", CANTIDAD_BEE);
        System.out.printf("Patas ..........: %d%n---%n", patasBee);
        System.out.printf("Animal  ........: %s%n", HIPHOP);
        System.out.printf("Cantidad .......: %d%n", CANTIDAD_HIPHOP);
        System.out.printf("Patas ..........: %d%n---%n", patasHipHop);
        System.out.printf("Animal  ........: %s%n", KOROKO);
        System.out.printf("Cantidad .......: %d%n", CANTIDAD_KOROKO);
        System.out.printf("Patas ..........: %d%n---%n", patasKoroko);
        System.out.printf("Total de Patas .: %d%n", totalPatas);
        System.out.printf("Total de Pares .: %d%n", totalPares);
        
                
       
        

    }
}
