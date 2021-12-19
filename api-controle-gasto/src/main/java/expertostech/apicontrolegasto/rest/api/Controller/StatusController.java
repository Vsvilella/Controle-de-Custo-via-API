package expertostech.apicontrolegasto.rest.api.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class StatusController {

    @GetMapping(path = "/api/status")
    public String check(){
        return "online";

    }

    @PostMapping(path = "/api/testeok")
    public String checkteste(){
        return "altissima";

    }

}
