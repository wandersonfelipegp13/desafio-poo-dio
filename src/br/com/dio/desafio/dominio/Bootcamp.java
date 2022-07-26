package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String descricao;
	private final LocalDate dataInicio = LocalDate.now();
	private final LocalDate dataFinal = dataInicio.plusDays(45);
	// Descomente a linha abaixo, e comente a de cima, para testar a validação de fechamento do bootcamp
	// private final LocalDate dataFinal = LocalDate.of(2022, 6, 25);
	private Set<Dev> devs = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<Conteudo>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Set<Dev> getDevs() {
		return devs;
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInicio, descricao, devs, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicio, other.dataInicio) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devs, other.devs) && Objects.equals(nome, other.nome);
	}
}
