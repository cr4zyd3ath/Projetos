package projeto;

public class Pessoa {

        private String nome;
        private String endereco;
        private String telefone;
        private String sexo; 
        private int idade;

public Pessoa()
        {
            this.nome = "";
            this.endereco = "";
            this.telefone = "";
            this.idade = 0;
            this.sexo = "";
        }
public Pessoa(String nome, String endereco, String telefone, int idade, String sexo)
{
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.idade = idade;
    this.sexo = sexo;
}


public String getNome()
{
    return this.nome;
}

public void setNome(String nome)
{
    this.nome = nome;
}


    public String getEndereco()
    {
        return this.endereco;
    }
   
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }


    public String getTelefone()
    {
        return this.telefone;
    }
   
    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public int getIdade()
    {
        return this.idade;
    }
   
    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public String getSexo() {
        return this.sexo;
    }
}