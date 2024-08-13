package com.modelagem.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import com.modelagem.entities.Ator;
import com.modelagem.entities.Direcao;
import com.modelagem.entities.Filme;
import com.modelagem.entities.Genero;
import com.modelagem.entities.Ingresso;
import com.modelagem.entities.Producao;
import com.modelagem.entities.Sala;
import com.modelagem.entities.Sessao;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 Genero generoAcao = new Genero("Ação");

	        List<Ator> atores = new ArrayList<Ator>();
	        List<Direcao> diretores = new ArrayList<Direcao>();
	        List<Producao> producoes = new ArrayList<Producao>();

	        atores.add(new Ator("Arnold Schwarzenegger", 73, 'M', "Austríaco"));
	        atores.add(new Ator("Sylvester Stallone", 74, 'M', "Americano"));

	        diretores.add(new Direcao("James Cameron"," Diretor "));

	        producoes.add(new Producao("Alex", " figurante "));

	        Filme filme = new Filme("O Exterminador do Futuro 2: O Julgamento Final", 1991, "Carolco Pictures", "Estados Unidos", "2h17m", generoAcao, atores, diretores, producoes);

	        Sala sala  = new Sala(1, "Sala01", 100);

	       LocalDate data = LocalDate.now();
	       Date dataSql = Date.valueOf(data);

	       Sessao sessao = new Sessao(dataSql, "19:00", sala, filme);

	       sessao.exibirSessao();
	       
	       String dataHora = dataSql.toString();
	       
	       Ingresso ingresso = new Ingresso(0, "Meia", 15.0f, dataHora);
	       
	       sessao.venderIngresso(ingresso);
	       
	       sessao.exibirSessao();
	       
	       ingresso.imprimirIngresso();

	}

}
