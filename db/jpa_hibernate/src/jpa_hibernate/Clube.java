package jpa_hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Clube implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Clube")
	@SequenceGenerator(name = "s_Clube", sequenceName = "s_Clube", allocationSize = 1)
	private long id;
	
	@OneToMany(mappedBy = "clube1")
	private List<Jogo> jogo1;
	
	@OneToMany(mappedBy = "clube2")
	private List<Jogo> jogo2;
	
	@OneToMany(mappedBy = "clube")
	private List<ClassificacaoRodada> classificacaoRodada;
	
	@OneToMany(mappedBy = "clube")
	private List<ClubeJogador> clubejogador;
	
	@OneToMany(mappedBy = "clube")
	private List<ClubeTecnico> clubetecnico;
	
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	@Column(nullable = false)
	private Date dtFundacao;
	
	public Clube () {
		jogo1 = new ArrayList<>();
		jogo2 = new ArrayList<>();
		classificacaoRodada = new ArrayList<>();
		clubejogador = new ArrayList<>();
		clubetecnico = new ArrayList<>();
	}
	
	public List<ClassificacaoRodada> getClassificacaoRodada() {
		return classificacaoRodada;
	}

	public List<ClubeJogador> getClubejogador() {
		return clubejogador;
	}

	public void setClubejogador(List<ClubeJogador> clubejogador) {
		this.clubejogador = clubejogador;
	}

	public List<ClubeTecnico> getClubetecnico() {
		return clubetecnico;
	}

	public void setClubetecnico(List<ClubeTecnico> clubetecnico) {
		this.clubetecnico = clubetecnico;
	}

	public void setClassificacaoRodada(List<ClassificacaoRodada> classificacaoRodada) {
		this.classificacaoRodada = classificacaoRodada;
	}

	public Clube (String nome, Date dtFundacao) {
		this.nome = nome;
		this.dtFundacao = dtFundacao;
	}

	public List<Jogo> getJogo1() {
		return jogo1;
	}

	public void setJogo1(List<Jogo> jogo1) {
		this.jogo1 = jogo1;
	}
	
	public List<Jogo> getJogo2() {
		return jogo2;
	}

	public void setJogo2(List<Jogo> jogo2) {
		this.jogo2 = jogo2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtFundacao() {
		return dtFundacao;
	}

	public void setDtFundacao(Date dtFundacao) {
		this.dtFundacao = dtFundacao;
	}

	@Override
	public String toString() {
		return "Clube [getClassificacaoRodada()=" + getClassificacaoRodada() + ", getClubejogador()="
				+ getClubejogador() + ", getClubetecnico()=" + getClubetecnico() + ", getJogo1()=" + getJogo1()
				+ ", getJogo2()=" + getJogo2() + ", getNome()=" + getNome() + ", getDtFundacao()=" + getDtFundacao()
				+ "]";
	}


	
	
}
