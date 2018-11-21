
package tecnologiainterprincipal;

/**
 *
 * @author icast
 */
public class Computadora extends Tecnologia {
/// private varibales
    private String Procesador;
    private int Ram;
    /// constructor
    public Computadora(){}
    public Computadora(String noSerie,String Anio,String Modelo,String Procesador,int Ram){
    super(noSerie, Anio, Modelo);
    this.Procesador=Procesador;
    this.Ram=Ram;
    }
    // Geter and Setter
    
    
    /**
     * @return the Procesador
     */
    public String getProcesador() {
        return Procesador;
    }

    /**
     * @param Procesador the Procesador to set
     */
    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    /**
     * @return the Ram
     */
    public int getRam() {
        return Ram;
    }

    /**
     * @param Ram the Ram to set
     */
    public void setRam(int Ram) {
        this.Ram = Ram;
    }
    
    
    
}
