package Capitulo_4;

/**
 *
 * @author Guilherme
 */
public class Finalize_FDemo {

    int x;

    public Finalize_FDemo(int i) {
        x = i;
    }

    protected void finalize() {
        System.out.println("Finalizando " + x);
    }
    
    void generator (int i) {
        Finalize_FDemo o = new Finalize_FDemo(i);
    }

}
