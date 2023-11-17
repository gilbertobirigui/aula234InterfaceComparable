/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Ilha Edição
 */

// classe funcionario = employee


//interface Compareble serve pra quando vc quiser comparar um objeto com outro basta vc implementar o contrato 
// que he operacao compareTo


public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    
    
    // pra que serve essa classe compareTo = serve pra comparar um objeto com outro
    @Override
    public int compareTo(Employee o) {   // porque esse compareTo retorna um numero inteiro
        
        // exemplo 
        // System.out.println("Maria".compareTo("Alex");  resultado  12 no alfabetico maria maior alex 
        // System.out.println("Alex".compareTo("Maria");  resultado -12  aqui alex esta inferior a maria 
        // System.out.println("Maria".compareTo("Maria"); resultado 0  resultado iguais porque sao iguais
        // retorno disso sempre vai ser negativo integer
        // retorno zero
        // retorno positivo
        // aqui vai comparar nomes entao retorno
        
        //return name.compareTo(o.getName());
        
        
        // se eu quiser ordenar por salario e nao por nome 
        //return salary.compareTo(o.getSalary());
        
        
        // se eu quizer em ordem decrescente
        return -salary.compareTo(o.getSalary());
        
    }

    
    
}
