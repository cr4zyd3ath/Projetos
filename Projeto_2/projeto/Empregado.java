package projeto;

public class Empregado extends Pessoa {

private int codigoSetor;
private float salarioBase;
private float imposto;

public void setCodigoSetor(int codigoSetor){this.codigoSetor = codigoSetor;}
public void setSalarioBase(float salarioBase){this.salarioBase = salarioBase;}
public void setImposto(float imposto){this.imposto = imposto;}

public int   getCodigoSetor(){return(codigoSetor);}
public float getSalarioBase(){return(salarioBase);}
public float getImposto    (){return(imposto);}

public void calculaSalario(){
    this.salarioBase += this.salarioBase*this.imposto/100;
}
}