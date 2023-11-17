/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Ilha Edição
 */
public class Program {

    public static void main(String[] args) {

        // lista
        List<String> list = new ArrayList<>();
        String path = "C:\\in.txt";   // caminho do arquivo

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String name = br.readLine();  // vou ler uma linha do arquivo
            while (name != null) {  // enquanto variavel name for diferente null ela add uma lista
                list.add(name);     // vai guarda cada nome  list
                name = br.readLine();
            }
            Collections.sort(list); // chamando a classe collections.sort passando minha lista como argumento
                                    // forma padrao uma da forma de ordenar uma colecao 
            for(String s: list){
                System.out.println(s);
            }

        } catch (IOException e ){
           System.out.println("Error: " + e.getMessage());
        }

    }

}
