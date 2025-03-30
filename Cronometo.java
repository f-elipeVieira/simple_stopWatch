import java.util.Timer;
import java.util.TimerTask;

public class Cronometo {

    int tempo = 0;
    Timer timer;
    TimerTask timerTask;

    public void run(){
        System.out.println("Cronomêtro iniciado");

        timer = new Timer();
        timerTask = new TimerTask() {
            @Override
            public void run() {
                tempo++;
                mostrarTempo();
            }
        };

        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }

    public void parar(){
        if(timer == null){
            System.out.println("Cronômetro não iniciado");
            return;
        }
        timer.cancel();
        System.out.print("");
        mostrarTempo();
    }

    public void reiniciar(){
        if(timer == null){
            System.out.println("Cronômetro não iniciado");
            return;
        }

        timer.cancel();
        tempo = 0;
        run();
    }

    public void mostrarTempo(){
        System.out.print("\r" + tempo + " segundos");
    }
}
