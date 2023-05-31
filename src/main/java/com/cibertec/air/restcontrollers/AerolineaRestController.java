package com.cibertec.air.restcontrollers;

import com.cibertec.air.domain.Aerolinea;
import com.cibertec.air.service.AerolineaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/aerolinea")
public class AerolineaRestController {

    @Autowired
    private AerolineaService aerolineaService;

    @RequestMapping(value = "/find/{idAerolinea}", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Aerolinea> find(Aerolinea aerolinea, Model model, @PathVariable Long idAerolinea) {
            try {
                return new ResponseEntity<Aerolinea>(aerolineaService.listarAerolineas().stream().filter(aer -> aer.getIdAerolinea().equals(idAerolinea)).findFirst().orElse(null),HttpStatus.OK);

            }catch (Exception e){
                return new ResponseEntity<Aerolinea>(HttpStatus.BAD_REQUEST);
            }
    }
}
