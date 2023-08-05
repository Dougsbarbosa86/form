package br.senai.sp.form;

import java.util.Scanner;

public class form {
   public static void main( String[] args) {


       /** importe da class Scanner */
       Scanner teclado = new Scanner(System.in);

       /** Coleta dados do User */








//       /** importe da class Scanner */
//       Scanner teclado2 = new Scanner(System.in);
//
//       /** Coleta dados do User2 */
//
//       System.out.print("Bom dia! Qual é o seu nome Prof 2:");
//       String nome2 = teclado.next();
//
//       System.out.print("Qual sua idade :");
//       int idade2 = teclado.nextInt();
//
//       System.out.print("Qual é seu peso:");
//       int peso2 = teclado.nextInt();
//
//       System.out.print("Qual sua altura:");
//       float altura2 = teclado.nextFloat();
//
//       System.out.print("Qual número do seu RG:");
//       int rg2 = teclado.nextInt();
//
//       System.out.print("Qual número do seu CPF:");
//       long cpf2 = teclado.nextLong();
//
//       System.out.print("Qual é sua profissão:");
//       String profissao2 = teclado.next();
//
//       System.out.print("Qual é o seu curso:");
//       String curso2 = teclado.next();
//
//       /** Printa as informações */
//
//       System.out.println("------------------------------");
//       System.out.println("-----------Formulario---------\n");
//       System.out.println("Olá" + nome + " Seja bem vindo!!");
//       System.out.println("Sua idade é:" + idade);
//       System.out.println("Sua peso é:" + peso);
//       System.out.println("sua altura é" + altura);
//       System.out.println("Seu RG" + rg);
//       System.out.println("Seu CPF" + cpf);
//       System.out.println("Sua Profissão" + profissao);
//       System.out.println("Seu curso: " + curso);
//
//
//       /** Printa as informações */
//
//       System.out.println("------------------------------");
//       System.out.println("-----------Formulario---------\n");
//       System.out.println("Olá" + nome2 + " Seja bem vindo!!");
//       System.out.println("Sua idade é:" + idade2);
//       System.out.println("Sua peso é:" + peso2);
//       System.out.println("sua altura é" + altura2);
//       System.out.println("Seu RG" + rg2);
//       System.out.println("Seu CPF" + cpf2);
//       System.out.println("Sua Profissão" + profissao2);
//       System.out.println("Seu curso: " + curso2);
//

       String[] nomes = new String[2];
       String[] profissao = new String[2];

       System.out.println("Qual o nome do Prof1:");
       nomes[0] = teclado.nextLine();

       System.out.println("Qual o nome do Prof2:");
       nomes[1] = teclado.nextLine();

       System.out.println("Olá Profºs:" + nomes[0] + " e " + nomes[1] +  " Sejam bem vindos");

       System.out.println("Qual sua profissão Prof1:");
       profissao[0] = teclado.nextLine();

       System.out.println("Qual sua profissão Prof2:");
       profissao[1] = teclado.next();









   }

    }
