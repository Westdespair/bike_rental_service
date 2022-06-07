package no.ntnu.bikerental.controller.web;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FooterController {


    /**
     *
     * @return
     */
    @GetMapping("/blog")
    public ResponseEntity<String> getBlog(){
        ResponseEntity<String> response;
        response = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return response;
    }

    /**
     *
     * @return
     */
    @GetMapping("/demo")
    public ResponseEntity<String> getDemo(){
        ResponseEntity<String> response;
        response = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return response;
    }

    /**
     *
     * @return
     */
    @GetMapping("/Customers")
    public ResponseEntity<String> getCustomers(){
        ResponseEntity<String> response;
        response = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return response;

    }

    /**
     *
     * @return
     */
    @GetMapping("/investors")
    public ResponseEntity<String> getInvestors(){
        ResponseEntity<String> response;
        response = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return response;

    }

    /**
     *
     * @return
     */
    @GetMapping("/terms-of-service")
    public ResponseEntity<String> getTermsOfService(){
        ResponseEntity<String> response;
        response = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return response;
    }

    /**
     *
     * @return
     */
    @GetMapping("/jobs")
    public ResponseEntity<String> getJobs(){
        ResponseEntity<String> response;
        response = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return response;
    }

    /**
     *
     * @return
     */
    @GetMapping("/support")
    public ResponseEntity<String> getSupport(){
        ResponseEntity<String> response;
        response = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return response;
    }

    /**
     * @return
     */
    @GetMapping("/contact")
    public ResponseEntity<String> getContact(){
        ResponseEntity<String> response;
        response = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return response;
    }

    /**
     *
     * @return
     */
    @GetMapping("/sponsorship")
    public ResponseEntity<String> getSponsorship(){
        ResponseEntity<String> response;
        response = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return response;
    }

    /**
     *
     * @return
     */
    @GetMapping("/instagram")
    public ResponseEntity<String> getInstagram(){
        ResponseEntity<String> response;
        response = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return response;
    }

    /**
     *
     *
     * @return
     */
    @GetMapping("/facebook")
    public ResponseEntity<String> getFacebook(){
        ResponseEntity<String> response;
        response = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return response;
    }

    /**
     *
     *
     * @return
     */

    @GetMapping("/youtube")
    public ResponseEntity<String> getYoutube(){
        ResponseEntity<String> response;
        response = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return response;
    }

    /**
     *
     * @param
     * @return
     */
    @GetMapping("/twitter")
    public ResponseEntity<String> getTwitter(){
        ResponseEntity<String> response;
        response = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return response;
    }
}
