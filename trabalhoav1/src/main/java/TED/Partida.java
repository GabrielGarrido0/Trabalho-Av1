package TED;
import java.util.Date;

public class Partida {
    private Jogador jogador1;
    private Jogador jogador2;
    private int numeroJogadas;
    private boolean terminada;
    
    public Partida(String nomeJogador1, String nomeJogador2, int tempoMaximo) {
        this.jogador1 = new Jogador(nomeJogador1, tempoMaximo);
        this.jogador2 = new Jogador(nomeJogador2, tempoMaximo);
        this.numeroJogadas = 0;
        this.terminada = false;
    }
    
    public void iniciar() {
        jogador1.iniciarTempo();
        jogador2.iniciarTempo();
    }
    
    public void realizarJogada(Jogador jogada) {
        if (!terminada && jogada.isValida()) {
            Jogador jogadorAtual = null;
			jogadorAtual.pausarTempo();
            jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
            jogadorAtual.iniciarTempo();
            numeroJogadas++;
            if (jogada.isXequeMate()) {
                terminada = true;
            }
        }
    }
    
    public void terminar() {
        jogador1.pausarTempo();
        jogador2.pausarTempo();
        this.terminada = true;
    }
    
    public int getNumeroJogadas() {
        return numeroJogadas;
    }
    
    public boolean isTerminada() {
        return terminada;
    }
    
    public Date getHoraInicio() {
        return jogador1.getHoraInicio();
    }
    
    public Date getHoraFim() {
        return jogador1.getHoraFim();
    }
    
    public int getTempoGastoJogador1() {
        int tempoTotal = jogador1.getTempoRestante();
        if (!jogador1.isParado()) {
            tempoTotal += (int) ((new Date().getTime() - jogador1.getHoraInicio().getTime()) / 1000);
        }
        return jogador1.getTempoMaximo() - tempoTotal;
    }
    
    public int getTempoGastoJogador2() {
        int tempoTotal = jogador2.getTempoRestante();
        if (!jogador2.isParado()) {
            tempoTotal += (int) ((new Date().getTime() - jogador2.getHoraInicio().getTime()) / 1000);
        }
        return jogador2.getTempoMaximo() - tempoTotal;
    }
}