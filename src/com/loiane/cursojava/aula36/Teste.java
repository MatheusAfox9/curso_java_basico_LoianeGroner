package com.loiane.cursojava.aula36;

public class Teste {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("Matheus");
        //contato.setEndereco("Cabedelo");
        //contato.setTelefone("83 99829-1716");


        //relacionamento tem-um endereco

        Endereco end = new Endereco();

        end.setNomeRua("Rua Edson Ataide de Lima");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Cabedelo");
        end.setEstado("PB");
        end.setCep("58100188");

        contato.setEndereco(end);


        //relacionamento tem-um Telefone

        Telefone telefone = new Telefone();

        telefone.setTipo("Celular");
        telefone.setDdd("83");
        telefone.setNumero("83 998291716");


        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("83");
        telefone2.setNumero("83 3228-4217");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);



        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        if (contato != null && contato.getTelefones() != null){
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

    }


}
