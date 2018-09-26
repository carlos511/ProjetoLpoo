
package projetolpoo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProjetoLpoo {

    public static void main(String[] args) {
        Cliente novoCliente = new Cliente();
        int opcao,i;
        do{
        opcao = Integer.parseInt(JOptionPane.showInputDialog("\n"
        +"              ESCOLHA A OPÇÃO \n"
        +"\n"
        +"              1. CADASTRAR CLIENTE\n"
        +"\n"
        +"              2. LISTAR CLIENTE\n"
        +"\n"
        +"              3. DELETAR CLIENTE\n"
        +"\n"
        +"              4. ALTERAR CLIENTE\n"
        +"\n"
        +"              5. Sair\n"));
               switch(opcao){
                case 1:
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente: ");
                    String cpf = JOptionPane.showInputDialog(null, "Digite o cpf do cliente: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do cliente: "));
                    String endereco = JOptionPane.showInputDialog(null, "Digite o endereço do cliente: ");
                    String tel = JOptionPane.showInputDialog(null, "Digite o tel do cliente: ");
                    String login = JOptionPane.showInputDialog(null, "Digite o login do cliente: ");
                    String senha = JOptionPane.showInputDialog(null, "Digite a senha do cliente: ");
                    int cartao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do cartão do cliente: "));
                    novoCliente.Cliente(login, senha, cartao, nome, cpf, idade, endereco, tel);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Lista de clientes cadastrados: "+
                novoCliente.listaClientes(),"Lista de clientes",JOptionPane.INFORMATION_MESSAGE);
                   break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Deletar Ciente"+novoCliente.removerCliente(),"Cliente deletado",JOptionPane.WARNING_MESSAGE);
               break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Deletar Ciente"+novoCliente.alterarCliente(),"Cliente deletado",JOptionPane.INFORMATION_MESSAGE);
               }
       }while(opcao!=5);        
    }
}

