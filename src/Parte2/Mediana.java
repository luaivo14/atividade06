/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte2;
/**
 *
 * @author Lua
 */
public class Mediana {

    public Mediana() {
    }
    
   public double acharMediana(double vetor[]) throws Exception{
       if(vetor == null){
               throw new Exception("Erro vetor e nulo");
       }
       if(vetor.length == 0){
               throw new Exception("Erro vetor e vazio");
       }
       int aux = vetor.length%2;
       if(aux != 0){
           int meio = vetor.length/2;
           return vetor[meio];
       }
       return 0;
   }
}
