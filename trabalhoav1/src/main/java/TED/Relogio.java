package TED;
import java.util.Date;

public class Relogio implements Runnable {
    static int tempoMaximo;
    private int tempoRestante;
    private boolean parado;
    private Date horaInicio;
    private Date horaFim;
    
    /**
     * construtor do relogio
     */
    public Relogio(int tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
        this.tempoRestante = tempoMaximo;
        this.parado = true;
    }
    /**
     * usado para iniciar o relogio
     */
    public void iniciar() {
        this.parado = false;
        this.horaInicio = new Date();
        new Thread(this).start();
    }
    /**
     * usado para pausar o relogio
     */
    public void pausar() {
        this.parado = true;
    }
    /**
     * usado para reiniciar o relogio
     */
    public void reiniciar() {
        this.parado = true;
        this.tempoRestante = tempoMaximo;
    }
    
    /**
     * retorna tempo restante 
     */
    public int getTempoRestante() {
        return tempoRestante;
    }
    
    /**
     * retonra valor da variavel parado, para verificação 
     */
    public boolean isParado() {
        return parado;
    }
    
    /**
     * usado para retornar hora do inicio
     */
    public Date getHoraInicio() {
        return horaInicio;
    }
    
    /**
     * usado para retornar a hora final
     */
    public Date getHoraFim() {
        return horaFim;
    }
    
    /**
     * usado para retornar o tempo maximo
     */
    public static int getTempoMaximo() {
		return tempoMaximo;
	}
    
    /**
     * usado para rodar o relogio
     */
    @Override
    public void run() {
        while (tempoRestante > 0 && !parado) {
            try {
                Thread.sleep(1000); // espera um segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tempoRestante--;
        }
        horaFim = new Date();
    }
}