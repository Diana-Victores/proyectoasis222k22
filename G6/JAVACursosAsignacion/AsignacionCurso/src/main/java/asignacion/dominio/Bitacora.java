/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignacion.dominio;

/**
 *
 * @author Diana
 */
public class Bitacora {

    private String Id_Bitacora;
    private String Id_Usuario;
    private String Fecha;
    private String Hora;
    private String Host;
    private String Ip;
    private String Accion;
    private String CodigoAplicacion;
    private String Modulo;

    public String getId_Bitacora() {
        return Id_Bitacora;
    }

    public void setId_Bitacora(String Id_Bitacora) {
        this.Id_Bitacora = Id_Bitacora;
    }

    public String getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(String Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String Host) {
        this.Host = Host;
    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public String getAccion() {
        return Accion;
    }

    public void setAccion(String Accion) {
        this.Accion = Accion;
    }

    public String getCodigoAplicacion() {
        return CodigoAplicacion;
    }

    public void setCodigoAplicacion(String CodigoAplicacion) {
        this.CodigoAplicacion = CodigoAplicacion;
    }

    public String getModulo() {
        return Modulo;
    }

    public void setModulo(String Modulo) {
        this.Modulo = Modulo;
    }

    @Override
    public String toString() {
        return "Bitacora{" + "Id_Bitacora=" + Id_Bitacora + ", Id_Usuario=" + Id_Usuario + ", Fecha=" + Fecha + ", Hora=" + Hora + ", Host=" + Host + ", Ip=" + Ip + ", Accion=" + Accion + ", CodigoAplicacion=" + CodigoAplicacion + ", Modulo=" + Modulo + '}';
    }

}
