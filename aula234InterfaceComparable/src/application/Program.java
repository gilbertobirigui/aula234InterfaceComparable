/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Faça um programa para ler um arquivo contendo funcionario( nome e salario) no formato .csv, armazenando-os em uma lista
 * Depois, ordenar a lista por nome e mostrar o resultado na tela.
 * 
 */
public class Program {

    public static void main(String[] args) {

        // lista nao vai ser mais String vai ser de funcionario employee
        // List<String> list = new ArrayList<>();
        
        List<Employee> list = new ArrayList<>();
        String path = "C:\\in.txt";   // caminho do arquivo

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

           // String name = br.readLine();  // vou ler uma linha do arquivo nao vou mais ta lendo texto e sim funcionario e salario
            
            String employeeCsv = br.readLine(); 
            
            while (employeeCsv != null) {  // enquanto variavel name for diferente null ela add uma lista
                // mas como vou pegar nome e salario do arquivo 
                // vou criar um vetor strings
                
                String[] fields = employeeCsv.split(",");
                
                // agora tem dois campos fields nome e salario 
                
                
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));     // fields[0] = nome   fields[1] = salario  tem q converter double pq vem texto
                
                // feito isso ler proxima linha do arquivo
                employeeCsv = br.readLine();
                
                
                
            }
            
            //  verificar a documentacao 
            // digitar google  javadoc collections
            // aqui deu erro antes claro porque classe collections.sor nao pode implementar lista
            // ela precisa implementar a classe Comparable
            
            
            //Collections.sort(list); // chamando a classe collections.sort passando minha lista como argumento
                                    // forma padrao uma da forma de ordenar uma colecao 
            // tenho q ir na classe Employee e implementar a interface Comparable
                                    
            Collections.sort(list);
                                
                                    
            for(Employee emp: list){   // pra cada funcionario na minha lista 
                System.out.println(emp.getName() + "' " + emp.getSalary());
            }

        } catch (IOException e ){
           System.out.println("Error: " + e.getMessage());
        }

    }

}
