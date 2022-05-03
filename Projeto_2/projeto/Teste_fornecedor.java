package projeto;

import java.util.Scanner;

public class Teste_fornecedor {
    public class main (string arg []){
        
        Scanner vc = new Scanner(System.in);
        Scanner vd = new Scanner(System.in);
        
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("alimentos sa");
        fornecedor.setEndereco("rua bico de pato");
        fornecedor.setTelefone("36521-8956");
        System.out.println("Nome :", +fornecedor.getNome());
        
        system.out.println("Endereco :". +fornecedor.getEndereco());
        system.out.println("Telefone :", +fornecedor.getTelefone());
        
        system.out.printf("Insira o valor do seu credito e dividas respectivamentes");
        vc = valorCredito.nextfloat(system); 
        vd = valorDivida.nextfloat(system); 
        
        system.out.println("Seu Saldo :", +fornecedor.calculaSaldo());
       }
     
}