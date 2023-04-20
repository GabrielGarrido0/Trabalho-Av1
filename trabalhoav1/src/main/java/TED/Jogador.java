package TED;

import java.util.Date;

public class Jogador {
    private String nome;
    private Relogio relogio;
    
    
    /**
     * construtor do jogador
     */
    public Jogador(String nome, int tempoMaximo) {
        this.nome = nome;
        this.relogio = new Relogio(tempoMaximo);
    }
    
    /**
     * usado para começar a contar o tempo do Relogio
     */
    public void iniciarTempo() {
        relogio.iniciar();
    }
    
    /**
     * usado para pausar tempo do jogador
     */
    public void pausarTempo() {
        relogio.pausar();
    }
    
    /**
     * usado para reiniciar o tempo do jogador
     */
    public void reiniciarTempo() {
        relogio.reiniciar();
    }
    
    /**
     * usado para retornar tempo do jogador
     */
    public int getTempoRestante() {
        return relogio.getTempoRestante();
    }
    
    /**
     * usado para retornar se o tempo do jogador esta parado
     */
    public boolean isParado() {
        return relogio.isParado();
    }
    
    /**
     * usado para retornar a hora do inicio da jogada
     */
    public Date getHoraInicio() {
        return relogio.getHoraInicio();
    }
    
    /**
     * usado para retornar hora do final da jogada
     */
    public Date getHoraFim() {
        return relogio.getHoraFim();
    }

    /**
     * usado para retornar tempo maximo da jogada
     */
	public int getTempoMaximo() {
		return Relogio.tempoMaximo;
	}

	/**
     * usado para retornar se a jogada e valida "ainda não implementada"
     */
	public boolean isValida() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
     * usado para retornar xeque mate "ainda nao implementada"
     */
	public boolean isXequeMate() {
		// TODO Auto-generated method stub
		return false;
	}

}