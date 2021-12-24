
package jugador;

/**
 * Reloj digital de ajedrez
 * 
 * @author MARTÍN
 * @version 1.0
 * @see Jugador
 */
public class Reloj {
    
    // Tiempo en segundos:
    private int tiempo;
    
    /**
     * Constructor 
     * 
     * @param tiempo Tiempo en segundos
     */
    public Reloj(int tiempo){
        this.tiempo = tiempo;
    }
    
    /**
     * Método que sirve para reducir el tiempo en un segundo:
     */
    public void reducirTiempo(){
        if (tiempo>0){
            tiempo--;
        }
    }

    /**
     * Método que permite obtener el tiempo del reloj en segundos
     * 
     * @return Tiempo del reloj en segundos
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * Método que permite establecer el tiempo del reloj en segundos 
     * 
     * @param tiempo Nuevo tiempo del reloj en segundos
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    /**
     * Método que permite obtener el tiempo con un formato determinado
     * 
     * @return El tiempo con segundos formateado
     */
    public String getTiempoFormateado(){
        int minutos = this.tiempo / 60;
        int segundos = this.tiempo % 60;

        String output = String.format("%02d:%02d", minutos, segundos);

        return (output);
    }
    
    /**
     * Método que comprueba si quedan segundos en el reloj
     * 
     * @return Un booleano que confirma si quedan segundos en el reloj
     */
    public boolean isActivo(){
        return(this.tiempo>0);
    }
}
