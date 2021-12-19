package expertostech.apicontrolegasto.rest.api.Controller;

import expertostech.apicontrolegasto.rest.api.Model.UsuarioModel;
import expertostech.apicontrolegasto.rest.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioContoller {
     @Autowired
     private UsuarioRepository repository;

     @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario){
         return repository.save(usuario);
     }



}
