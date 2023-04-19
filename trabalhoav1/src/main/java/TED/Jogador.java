package TED;

import java.util.Date;

public class Jogador {
    private String nome;
    private Relogio relogio;
    
    public Jogador(String nome, int tempoMaximo) {
        this.nome = nome;
        this.relogio = new Relogio(tempoMaximo);
    }
    
    public void iniciarTempo() {
        relogio.iniciar();
    }
    
    public void pausarTempo() {
        relogio.pausar();
    }
    
    public void reiniciarTempo() {
        relogio.reiniciar();
    }
    
    public int getTempoRestante() {
        return relogio.getTempoRestante();
    }
    
    public boolean isParado() {
        return relogio.isParado();
    }
    
    public Date getHoraInicio() {
        return relogio.getHoraInicio();
    }
    
    public Date getHoraFim() {
        return relogio.getHoraFim();
    }

	public int getTempoMaximo() {
		return Relogio.tempoMaximo;
	}

	public boolean isValida() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isXequeMate() {
		// TODO Auto-generated method stub
		return false;
	}

}