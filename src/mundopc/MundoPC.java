package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

/**
 *
 * @author DIDIER JAVIER
 */
public class MundoPC {
    public static void main(String[] args) {
        Raton raton1 = new Raton("Ps/1", "IBM");
        Raton raton2 = new Raton("Ps/2", "MBI");
        Raton raton3 = new Raton("Serial", "SER");
        Raton raton4 = new Raton("Inalambrica", "INA");
        
        Teclado teclado1 = new Teclado("Ps/1", "AAA");
        Teclado teclado2 = new Teclado("Ps/2", "BBB");
        Teclado teclado3 = new Teclado("Serial", "CCC");
        Teclado teclado4 = new Teclado("Inalambrica", "DDD");
        
        Monitor monitor1 = new Monitor("DELL", 14.0);
        Monitor monitor2 = new Monitor("TOSHIBA", 17.2);
        Monitor monitor3 = new Monitor("MABE", 14.5);
        Monitor monitor4 = new Monitor("KTRON", 19.0);
        
        Computadora computadora1 = new Computadora("HP", monitor4, teclado3, raton2);
        Computadora computadora2 = new Computadora("LG", monitor1, teclado1, raton1);
        Computadora computador3 = new Computadora ("APPLE", monitor2, teclado4, raton1);
        Computadora computadora4 = new Computadora ("LENOVO", monitor3, teclado2, raton4);
        
        System.out.println(computadora1);
    }
}
