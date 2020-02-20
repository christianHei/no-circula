package com.christian.nocircula.controlador;

import com.christian.nocircula.modelo.Vehiculo;
import com.christian.nocircula.servicio.VehiculoServicio;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("vehiculo")
@Api(value = "Servicio Vehículo")
public class VehiculoControlador {

    @Autowired
    VehiculoServicio vehiculoServicio;

    @RequestMapping(path = "/", method = RequestMethod.GET, produces = "application/json")
    public List<Vehiculo> obtenerTodo(){
        return vehiculoServicio.obtenerTodo();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Find a period by your ID", notes = "Return a period object")
    public Optional<Vehiculo> obtenerPorId(@PathVariable Long id) {
        return vehiculoServicio.obtenerPorId(id);
    }

    @RequestMapping(path = "/placa/{placa}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "Encuentra un vehículo por placa", notes = "Retorna un vehículo")
    public Vehiculo obtenerPorPlaca(@PathVariable("placa") String placa){
        return vehiculoServicio.obtenerPorPlaca(placa);
    }
}
