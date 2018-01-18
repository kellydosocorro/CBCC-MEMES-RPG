/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbccmemes.ambientes;

import cbccmemes.mochila.Item;
import cbccmemes.mochila.Item_Ataque;
import cbccmemes.mochila.Item_Defesa;
import cbccmemes.mochila.Item_Vida;
import cbccmemes.personagens.Aluno;
import java.util.ArrayList;

/**
 *
 * @author 201604940039
 */
public class NewClass {
    public static void main(String[] args) {
        
        Aluno user = new Aluno();
        
        final ArrayList<Item> venda = new ArrayList<>();
        
        //Itens comuns de defesa
                                    // Nome, Poder de ação
        venda.add(new Item_Defesa("Livro", 100));
        venda.add(new Item_Defesa("Exercícios feitos", 150));
        venda.add(new Item_Defesa("Artigo", 350));

        //Itens de vida
                                    // Valor, Nome, Nível
        venda.add(new Item_Vida(50, "Garrfa de Água", 0));
        venda.add(new Item_Vida(100, "Chop da BC", 1));
        venda.add(new Item_Vida(200, "Lanche do Ver-o-pesinho", 3));
        venda.add(new Item_Vida(300, "Bandejão do RU", 4));
        
        AmbienteComercio loja = new AmbienteComercio("Loja", "Compra e venda de itens", 1, null, venda);
        Item teste = new Item_Vida(300, "Bandejão do RU", 1);
        
        loja.compraItem(user, teste);
        
        /* Ambiente mapa = new AmbienteAberto("UFPA", "Campus Belém", 1);
        
        Ambiente profissional = new AmbienteAberto("CAMPUS II", "Profissional", 1);
            Ambiente itec = new AmbienteAberto("ITEC", "O Instituto de Tecnologia da Universidade Federal do Pará, criado por transformação ao Centro Tecnológico, em reunião do CONSUN realizada no dia 21 de maio de 2007, abriga em sua estrutura 18 subunidades, sendo 9 Faculdades, com 11 cursos, e  9 Programas de Pós-Graduação. Assim denominadas", 1);
                itec.addDestino(new AmbientePredio("Faculdade - Arquitetura e Urbanismo", "Criado em 1964, o Curso de Arquitetura da Universidade Federal do Pará originou-se da demanda de engenheiros locais, que atuavam como projetistas, aos quais foram destinadas duas turmas de adaptação, com duração de três anos", 1));
                itec.addDestino(new AmbientePredio("Faculdade de Engenharia Civil - FEC", "O Curso de Engenharia Civil da UFPA, foi criado no ano de 1931, sendo reconhecido através do Decreto Lei No 7.215 de 24/05/1941. O Projeto Pedagógico versão 2001, ainda em vigor, foi aprovado pela Resolução No 2.761/2001-CONSEP e Portaria No 1483/2001-MEC.", 1));
            Ambiente icsa = new AmbienteAberto("ICSA", "Instituto Ciências Sociais Aplicadas", 1);
                icsa.addDestino(new AmbientePredio("Biblioteconomia", "Biblioteconomia", 1));
                icsa.addDestino(new AmbientePredio("Ciências Contábeis", "Ciências Contábeis", 1));
        
        profissional.addDestino(itec);
        profissional.addDestino(icsa);
            
        Ambiente basico = new AmbienteAberto("CAMPUS I", "Básico", 1);
            Ambiente icen = new AmbienteAberto("ICEN", "Instituto de Ciências exatas e Naturais", 1);
                icen.addDestino(new AmbientePredio("FACOMP", "Faculdade de Computação", 1));
        basico.addDestino(icen);
        
        Ambiente pct = new AmbienteAberto("PCT Guamá", "PCT Guamá", 1);
            pct.addDestino(new AmbientePredio("Espaço Inovação", "Espaço Inovação", 1));
        
        mapa.addDestino(basico);
        mapa.addDestino(profissional);
        mapa.addDestino(pct);*/
    }
}
