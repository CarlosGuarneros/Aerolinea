public class Aerolinea{
  private Aeropuerto aeropuerto;
  private String nombre;
  private String registro;
//Simplemente estan los set y get de los datos de Aeropuerto
  public void setAeropuerto(Aeropuerto aeropuerto){
    this.aeropuerto = aeropuerto;
  }

  public Aeropuerto getAeropuerto(){
    return this.aeropuerto;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getNombre(){
    return this.nombre;
  }

  public void setRegistro(String registro){
    this.registro = registro;
  }

  public String getRegistro(){
    return this.registro;
  }
}
