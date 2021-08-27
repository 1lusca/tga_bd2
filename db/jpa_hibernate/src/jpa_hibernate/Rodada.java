package jpa_hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Rodada implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "s_Rodada")
	@SequenceGenerator(name = "s_Rodada", sequenceName = "s_Rodada", allocationSize = 1)
	private long id;
	
	//@OneToMany(mappedBy = "campeonato")
	@ManyToOne(optional = false)
	@JoinColumn(name = "campeonato", foreignKey = @ForeignKey(name = "fk_rodada_campeonato"))
	private Campeonato campeonato;
	
	@OneToMany(mappedBy = "rodada")
	private List<ClassificacaoRodada> classificacaorodada;
	
	//@Column(nullable = false, length = 2, unique = true)
	//private int idRodada;
	
	@Column(nullable = true, length = 2)
	private int totalJogos;
	
	@Column(nullable = true, length = 3)
	private int totalAmarelos;
	
	@Column(nullable = true, length = 3)
	private int totalVermelhos;

	@Column(nullable = true, length = 3)
	private int totalGols;

	public Rodada () {
		classificacaorodada = new ArrayList<>();
	}
	
	public Rodada (Campeonato campeonato, int totalJogos, int totalAmarelos, int totalVermelhos, int totalGols) {
		this.campeonato = campeonato;
		this.totalJogos = totalJogos;
		this.totalAmarelos = totalAmarelos;
		this.totalVermelhos = totalVermelhos;
		this.totalGols = totalGols;
	}
	
	public Campeonato getCampeonato () {return this.campeonato;}
	
	public void setCampeonato (Campeonato campeonato) {this.campeonato = campeonato;}
	
	public int getTotalJogos () {return this.totalJogos;}
	
	public void setTotalJogos (int totalJogos) {this.totalJogos = totalJogos;}
	
	public int getTotalAmarelos () {return this.totalAmarelos;}
	
	public void setTotalAmarelos (int totalAmarelos) {this.totalAmarelos = totalAmarelos;}
	
	public int getTotalVermelhos () {return this.totalVermelhos;}
	
	public void setTotalVermelhos (int totalVermelhos) {this.totalVermelhos = totalVermelhos;}
	
	public int getTotalGols () {return this.totalGols;}
	
	public void setTotalGols (int totalGols) {this.totalGols = totalGols;}
	
	public String toString () {
		return ("Campeonato: "+getCampeonato()+"%n"+"Total de jogos: "+getTotalJogos()+"%n"+"Total de amarelos: "+getTotalAmarelos()+"%n"+"Total de vermelhos: "+getTotalVermelhos()+"%n"+"Total de gols: "+getTotalGols());
	}
	
}
