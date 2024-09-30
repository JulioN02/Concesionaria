package logica;

import java.io.Serializable;
import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora implements Serializable {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    Automovil auto = new Automovil();
    public void agregarAutomovil(String modelo, String marca, String motor, String color, String placa, int cantidadPuerta) {
        
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCantidadPuertas(cantidadPuerta);
        
        controlPersis.agregarAutomovil(auto);
        
    }

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
    }

    public void eliminarAuto(int idAuto) {
        controlPersis.eliminarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void editarAutomovil(Automovil auto, String modelo, String marca, String motor, String color, String placa, int cantidadPuerta) {
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCantidadPuertas(cantidadPuerta);
        controlPersis.editarAuto(auto);
    }

    
}
