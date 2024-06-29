package pl.pjatk.jaz_s27144_nbp;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nbp")
@Tag(name="NBP Waluty", description = "Endpointy na sprawdzenie walut")
public class NBPController {


    @Operation(summary = "CheckOK", description = "Returns simple text to check if everything is working")
    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {

        return ResponseEntity.ok("Hello World OK :)");


    }




}
