package ExercicioMod13;

import ExercicioMasculinoEFeminino.Masculino;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<PessoaFisica> listaPessoaFisica = new ArrayList<>();
        List<PessoaJuridica> listaPessoaJuridica = new ArrayList<>();
        System.out.println("Pessoa Juridica ou Física ? Digite J ou F => ");
        String resp = sc.nextLine();
        if (resp.equals("F")) {
            System.out.println("Digite o nome da pessoa =>");
            String nome1 = sc.nextLine();
            System.out.println("Digite o cpf da pessoa para validar => ");
            String cpf = sc.nextLine();
            PessoaFisica pessoaFisica = new PessoaFisica(nome1, cpf);
            listaPessoaFisica.add(pessoaFisica);
            if (cpf.length() != 11) {
                System.out.println("O CPF É INVÁLIDO.");
            }

            System.out.println("Pessoa Física => ");
            for (PessoaFisica pf : listaPessoaFisica) {
                System.out.println(pf);
            }
        }
        else if (resp.equals("J")) {
            System.out.println("Digite o nome da pessoa =>");
            String nome2 = sc.nextLine();
            System.out.println("Digite o cnpj da pessoa para validar => ");
            String cnpj = sc.nextLine();
            PessoaJuridica pessoaJuridica = new PessoaJuridica(nome2, cnpj);
            listaPessoaJuridica.add(pessoaJuridica);
            if (cnpj.length() != 14) {
                System.out.println("O CNPJ É INVÁLIDO.");
            }
            System.out.println("Pessoa Juridica => ");
            for (PessoaJuridica pj : listaPessoaJuridica) {
                System.out.println(pj);
            }
        }
        else {
            System.out.println("ERRO NA DIGITAÇÃO. PORFAVOR, DIGITE UMA OPÇÃO VÁLIDA.");
        }


        sc.close();

    }
}
