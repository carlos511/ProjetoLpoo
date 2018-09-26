
package projetolpoo;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Cliente extends Pessoa {

    public String login;
    private String senha;
    private int cartao;
    String dados = "";
    int i;
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public Cliente(){}
    public void Cliente(String login, String senha, int cartao, String nome, String cpf, int idade, String endereco, String tel){
        this.login = login;
        this.senha = senha;
        this.cartao = cartao;
        Cliente novoCliente = new Cliente();
        novoCliente.nome = nome;
        novoCliente.cpf = cpf;
        novoCliente.idade = idade;
        novoCliente.endereco = endereco;
        novoCliente.tel = tel;
        novoCliente.login = login;
        novoCliente.senha = senha;
        novoCliente.cartao = cartao;
        clientes.add(novoCliente);
        JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso!!! ", "Cliente Cadastro", JOptionPane.INFORMATION_MESSAGE);
    }
    public String listaClientes(){
  for(int i=0;i<clientes.size();i++)
      clientes.iterator();
  for (Cliente clientes : clientes) {
dados += " Nome do Cliente: " + clientes.nome
+ " CPF do Cliente: " + clientes.cpf
+ " Idade: " + clientes.idade
        + " Telefone do Cliente: " + clientes.tel
        + " Login: " + clientes.login
        + " Senha: " + clientes.senha
        + " Número do cartao: " + clientes.cartao
        + " Endereco do CLiente: " + clientes.endereco + "\n";
}
return dados;
    }
    public String removerCliente(){
        clientes.remove(clientes);
      for (Cliente clientes : clientes) {
    }
        return dados;
    }
    public int alterarCliente(){
        return 0;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getCartao() {
        return cartao;
    }

    public void setCartao(int cartao) {
        this.cartao = cartao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    private void contains(int i) {
    }

    }

