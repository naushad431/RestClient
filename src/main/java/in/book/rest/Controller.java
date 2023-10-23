package in.book.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@GetMapping("/")
	public ResponseEntity<String> inedx(){
		return new ResponseEntity<String>("Hello this is naushad",HttpStatus.OK);
	}
	
}
