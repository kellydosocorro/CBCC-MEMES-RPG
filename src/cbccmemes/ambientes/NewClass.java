/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbccmemes.ambientes;

/**
 *
 * @author 201604940039
 */
public class NewClass {
    public static void main(String[] args) {
        Ambiente mapa = new AmbienteAberto("Mapa Geral", "Mapa Geral", 1);
        
        Ambiente profissional = new AmbienteAberto("Profissional", "Profissional", 1);
            Ambiente itec = new AmbienteAberto("ITEC", "O Instituto de Tecnologia da Universidade Federal do Pará, criado por transformação ao Centro Tecnológico, em reunião do CONSUN realizada no dia 21 de maio de 2007, abriga em sua estrutura 18 subunidades, sendo 9 Faculdades, com 11 cursos, e  9 Programas de Pós-Graduação. Assim denominadas", 1);
                itec.addDestino(new AmbienteFechado("Faculdade - Arquitetura e Urbanismo", "Criado em 1964, o Curso de Arquitetura da Universidade Federal do Pará originou-se da demanda de engenheiros locais, que atuavam como projetistas, aos quais foram destinadas duas turmas de adaptação, com duração de três anos", 1));
                itec.addDestino(new AmbienteFechado("Faculdade de Engenharia Civil - FEC", "O Curso de Engenharia Civil da UFPA, foi criado no ano de 1931, sendo reconhecido através do Decreto Lei No 7.215 de 24/05/1941. O Projeto Pedagógico versão 2001, ainda em vigor, foi aprovado pela Resolução No 2.761/2001-CONSEP e Portaria No 1483/2001-MEC.", 1));
            Ambiente icsa = new AmbienteAberto("ICSA", "Instituto Ciências Sociais Aplicadas", 1);
                icsa.addDestino(new AmbienteFechado("Biblioteconomia", "Biblioteconomia", 1));
                icsa.addDestino(new AmbienteFechado("Ciências Contábeis", "Ciências Contábeis", 1));
        
        profissional.addDestino(itec);
        profissional.addDestino(icsa);
            
        Ambiente basico = new AmbienteAberto("Básico", "Básico", 1);
            Ambiente icen = new AmbienteAberto("ICEN", "Instituto de Ciências exatas e Naturais", 1);
                icen.addDestino(new AmbienteFechado("FACOMP", "Faculdade de Computação", 1));
        basico.addDestino(icen);
        
        Ambiente pct = new AmbienteAberto("PCT Guamá", "PCT Guamá", 1);
            pct.addDestino(new AmbienteFechado("Espaço Inovação", "Espaço Inovação", 1));
        
        
        mapa.addDestino(profissional);
        mapa.addDestino(basico);
        mapa.addDestino(pct);
        
        mapa.printDados();
    }
}
