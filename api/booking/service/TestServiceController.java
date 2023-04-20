package api.booking.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import api.booking.to.test.AddressLocation;
import api.booking.to.test.PlaceOfBLIssue;
import api.booking.to.test.UnLocationLocation;

@CrossOrigin({ "http://" })
@RestController
public class TestServiceController implements TestService {
    @Override
    public ResponseEntity<Object> anyOf(String str) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode result = mapper.createObjectNode();
        try {
            mapper.registerSubtypes(AddressLocation.class);
            mapper.registerSubtypes(UnLocationLocation.class);
            
            PlaceOfBLIssue pob = mapper.readValue(str, PlaceOfBLIssue.class);
            result.putPOJO("placeOfBLIssue", pob);
            
            return new ResponseEntity<Object>(result, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Object> oneOf(String str) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode result = mapper.createObjectNode();
        try {
            mapper.registerSubtypes(AddressLocation.class);
            mapper.registerSubtypes(UnLocationLocation.class);
            
            PlaceOfBLIssue pob = mapper.readValue(str, PlaceOfBLIssue.class);
            result.putPOJO("placeOfBLIssue", pob);
            
            return new ResponseEntity<Object>(result, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
