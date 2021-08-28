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
public class Jogo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Jogo")
	@SequenceGenerator(name = "s_Jogo", sequenceName = "s_Jogo", allocationSize = 1)
	private long id;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "rodada", foreignKey = @ForeignKey(name = "fk_jogo_rodada"))
	private Rodada rodada;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "campeonato", foreignKey = @ForeignKey(name = "fk_jogo_campeonato"))
	private Campeonato campeonato;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "clube1", foreignKey = @ForeignKey(name = "fk_jogo_clube1"))
	private Clube clube1;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "clube2", foreignKey = @ForeignKey(name = "fk_jogo_clube2"))
	private Clube clube2;
	
	
	@Column(nullable = true, length = 2)
	private int clube1Gol;
	
	@Column(nullable = true, length = 3)
	private int clube2Gol;
	
	@Column(nullable = true, length = 2)
	private int clube1Amarelo;
	
	@Column(nullable = true, length = 2)
	private int clube2Amarelo;
	
	@Column(nullable = true, length = 2)
	private int clube1Vermelho;
	
	@Column(nullable = true, length = 2)
	private int clube2Vermelho;
	
	@Column(nullable = true, length = 1)
	private int clube1Ponto;
	
	@Column(nullable = true, length = 1)
	private int clube2Ponto;

	
	public Jogo (Rodada rodada, Campeonato campeonato, Clube clube1, Clube clube2, int clube1Gol, int clube2Gol, int clube1Amarelo, int clube2Amarelo, int clube1Vermelho, int clube2Vermelho, int clube1Ponto, int clube2Ponto) {
		this.rodada = rodada;
		this.campeonato = campeonato;
		this.clube1 = clube1;
		this.clube2 = clube2;
		this.clube1Gol = clube1Gol;
		this.clube2Gol = clube2Gol;
		this.clube1Amarelo = clube1Amarelo;
		this.clube2Amarelo = clube2Amarelo;
		this.clube1Vermelho = clube1Vermelho;
		this.clube2Vermelho = clube2Vermelho;
		this.clube1Ponto = clube1Ponto;
		this.clube2Ponto = clube2Ponto;
	}
	

	public Clube getClube1() {
		return clube1;
	}


	public void setClube1(Clube clube1) {
		this.clube1 = clube1;
	}


	public Clube getClube2() {
		return clube2;
	}


	public void setClube2(Clube clube2) {
		this.clube2 = clube2;
	}



	@Override
	public String toString() {
		return "Jogo [rodada=" + rodada + ", campeonato=" + campeonato + ", clube1=" + clube1 + ", clube2=" + clube2
				+ ", clube1Gol=" + clube1Gol + ", clube2Gol=" + clube2Gol + ", clube1Amarelo=" + clube1Amarelo
				+ ", clube2Amarelo=" + clube2Amarelo + ", clube1Vermelho=" + clube1Vermelho + ", clube2Vermelho="
				+ clube2Vermelho + ", clube1Ponto=" + clube1Ponto + ", clube2Ponto=" + clube2Ponto + "]";
	}


	public int getClube1Gol() {
		return clube1Gol;
	}

	public void setClube1Gol(int clube1Gol) {
		this.clube1Gol = clube1Gol;
	}

	public int getClube2Gol() {
		return clube2Gol;
	}

	public void setClube2Gol(int clube2Gol) {
		this.clube2Gol = clube2Gol;
	}

	public int getClube1Amarelo() {
		return clube1Amarelo;
	}

	public void setClube1Amarelo(int clube1Amarelo) {
		this.clube1Amarelo = clube1Amarelo;
	}

	public int getClube2Amarelo() {
		return clube2Amarelo;
	}

	public void setClube2Amarelo(int clube2Amarelo) {
		this.clube2Amarelo = clube2Amarelo;
	}

	public int getClube1Vermelho() {
		return clube1Vermelho;
	}

	public void setClube1Vermelho(int clube1Vermelho) {
		this.clube1Vermelho = clube1Vermelho;
	}

	public int getClube2Vermelho() {
		return clube2Vermelho;
	}

	public void setClube2Vermelho(int clube2Vermelho) {
		this.clube2Vermelho = clube2Vermelho;
	}

	public int getClube1Ponto() {
		return clube1Ponto;
	}

	public void setClube1Ponto(int clube1Ponto) {
		this.clube1Ponto = clube1Ponto;
	}

	public int getClube2Ponto() {
		return clube2Ponto;
	}

	public void setClube2Ponto(int clube2Ponto) {
		this.clube2Ponto = clube2Ponto;
	}

	public Rodada getRodada () {return this.rodada;}
	
	public void setRodada (Rodada rodada) {this.rodada = rodada;}

	
	
}
