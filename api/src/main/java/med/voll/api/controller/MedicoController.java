package med.voll.api.controller;

import med.voll.api.medico.DatosRegistroMedico;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    public void registraMedico(@RequestBody DatosRegistroMedico datosRegistroMedico){
        System.out.println(datosRegistroMedico);
    }

}
