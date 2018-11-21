
package tecnologiainterprincipal;

public class Tecnologia {

   
    private  String noSerie;
    private  String Anio;
    private String Modelo;
    
    public Tecnologia (){}
    public Tecnologia(String noSerie,String Anio,String Modelo){
        this.Modelo=Modelo;
        this.noSerie=noSerie;
        this.Anio=Anio;
        
    }
    
     /// Getter y Setter
    public String getNoSerie() {
        return noSerie;
    }

   
    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

   
    public String getAnio() {
        return Anio;
    }

    
    public void setAnio(String Anio) {
        this.Anio = Anio;
    }

   
    public String getModelo() {
        return Modelo;
    }

   
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    } 
    
    
    
    
    
}
