package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias({"Title", "Titulo"}) String titulo, 
						@JsonAlias("titalSeasons") Integer totalTemporadas,
						@JsonAlias("imdbRating") String avaliacao) {
	
	
	
}
