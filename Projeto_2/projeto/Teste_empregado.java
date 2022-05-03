package projeto;

import java.util.Scanner;

public class Teste_empregado {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Empregado e = new Empregado();

        System.out.print("Insira o salário base: ");
        e.setSalarioBase(scn.nextFloat());
        
        System.out.print("Insira código do setor: ");
        e.setCodigoSetor(scn.nextInt());
        
        System.out.print("Insira o percentual de aumento (%): ");
        e.setImposto(scn.nextFloat());
        
        e.calculaSalario();
        System.out.println("Novo Salario: "+e.getSalarioBase());
        
        System.out.println("Fim Teste! \n");

    }
}
