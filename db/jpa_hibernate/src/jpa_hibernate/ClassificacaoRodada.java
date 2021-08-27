package jpa_hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class ClassificacaoRodada implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "s_ClassificacaoRodada")
	@SequenceGenerator(name = "s_ClassificacaoRodada", sequenceName = "s_ClassificacaoRodada", allocationSize = 1)
	private long id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "rodada", foreignKey = @ForeignKey(name = "fk_classificacaorodada_rodada"))
	private Rodada rodada;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "campeonato", foreignKey = @ForeignKey(name = "fk_classificacaorodada_campeonato"))
	private Campeonato campeonato;
	
	@Column(nullable = false, length = 2, unique = true)
	private int posicao;
	
	@Column(nullable = true, length = 3)
	private int totalPontos;
	
	@Column(nullable = true, length = 2)
	private int totalVitorias;
	
	@Column(nullable = true, length = 2)
	private int totalEmpates;
	
	@Column(nullable = true, length = 2)
	private int totalDerrotas;
	
	@Column(nullable = true, length = 3)
	private int totalGolsPro;
	
	@Column(nullable = true, length = 3)
	private int totalGolsContra;
	
	public ClassificacaoRodada () {}
	
	public ClassificacaoRodada (Rodada rodada, Campeonato campeonato, int posicao, int totalPontos, int totalVitorias, int totalEmpates, int totalDerrotas, int totalGolsPro, int totalGolsContra) {
		this.rodada = rodada;
		this.campeonato = campeonato;
		this.posicao = posicao;
		this.totalPontos = totalPontos;
		this.totalVitorias = totalVitorias;
		this.totalEmpates = totalEmpates;
		this.totalDerrotas = totalDerrotas;
		this.totalGolsPro = totalGolsPro;
		this.totalGolsContra = totalGolsContra;
	}
	
	public Rodada getRodada () {return this.rodada;}
	
	public void setRodada (Rodada rodada) {this.rodada = rodada;}
	
	public Campeonato getCampeonato () {return this.campeonato;}
	
	public void getCampeonato (Campeonato campeonato) {this.campeonato = campeonato;}
	
	public int getPosicao () {return this.posicao;}
	
	public void setPosicao (int posicao) {this.posicao = posicao;}
	
	public int getTotalPontos () {return this.totalPontos;}
	
	public void setTotalPonto (int totalPontos) {this.totalPontos = totalPontos;}
	
	public int getTotalVitorias () {return this.totalVitorias;}
	
	public void setTotalVitorias (int totalVitorias) {this.totalVitorias = totalVitorias;}
	
	public int getTotalEmpates () {return this.totalEmpates;}
	
	public void setTotalEmpates (int totalEmpates) {this.totalEmpates = totalEmpates;}
	
	public int getTotalDerrotas () {return this.totalDerrotas;}
	
	public void setTotalDerrotas (int totalDerrotas) {this.totalDerrotas = totalDerrotas;}
	
	public int getTotalGolsPro () {return this.totalGolsPro;}
	
	public void setTotalGolsPro (int totalGolsPro) {this.totalGolsPro = totalGolsPro;}
	
	public int getTotalGolsConta () {return this.totalGolsContra;}
	
	public void setTotalGolsContra (int totalGolsContra) {this.totalGolsContra = totalGolsContra;}

}


























