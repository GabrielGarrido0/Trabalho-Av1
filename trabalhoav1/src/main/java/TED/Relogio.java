package TED;
import java.util.Date;

public class Relogio implements Runnable {
    static int tempoMaximo;
    private int tempoRestante;
    private boolean parado;
    private Date horaInicio;
    private Date horaFim;
    
    public Relogio(int tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
        this.tempoRestante = tempoMaximo;
        this.parado = true;
    }
    
    public void iniciar() {
        this.parado = false;
        this.horaInicio = new Date();
        new Thread(this).start();
    }
    
    public void pausar() {
        this.parado = true;
    }
    
    public void reiniciar() {
        this.parado = true;
        this.tempoRestante = tempoMaximo;
    }
    
    public int getTempoRestante() {
        return tempoRestante;
    }
    
    public boolean isParado() {
        return parado;
    }
    
    public Date getHoraInicio() {
        return horaInicio;
    }
    
    public Date getHoraFim() {
        return horaFim;
    }
    
    public static int getTempoMaximo() {
		return tempoMaximo;
	}
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