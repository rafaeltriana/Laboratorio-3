
package laboratorio3.pkg2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;





public  class Laboratorio3 {
    
    
    

    public  static void main(String[] args) {
        
        Timer temporizador = new Timer();

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("  ---Alarma Consola--- ");
        System.out.println("     ");
        

        System.out.print("Hour : ");
        int hour = teclado.nextInt();

        System.out.print("Minutes : ");
        int minutes = teclado.nextInt();

        System.out.print("Seconds : ");
        int seconds = teclado.nextInt();

        LocalTime inicialhour = LocalTime.now();
        LocalTime finalhour;
        finalhour = LocalTime.of(hour, minutes, seconds);

        long time = Duration.between(inicialhour, finalhour).getSeconds();
  

        TimerTask temp = new TimerTask () {

            int x = 0 - 10;
            
            @Override
            public void run() {
                DateFormat format = new SimpleDateFormat("HH:mm:ss");
                Date fecha = new Date();
                System.out.println("  ");
                System.out.println("Hora Actual: " + format.format(fecha));
                System.out.println("La Alarma a estado activa por : " + (x + 10) + " segundos");
                System.out.println("   ");
                

                if (x > 15) {
                    System.out.println(" La Alarma se Desactivo ");
                    temporizador.cancel();
                   
                }
                 x = x + 10;
                 
            }
        };
        
      
        temporizador.scheduleAtFixedRate(temp,time*1000, 10000);
       
        
        
        

    }

}

