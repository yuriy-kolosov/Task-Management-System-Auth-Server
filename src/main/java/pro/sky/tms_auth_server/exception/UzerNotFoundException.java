package pro.sky.tms_auth_server.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UzerNotFoundException extends RuntimeException {

    public UzerNotFoundException(String message) {
        super(message);
    }

}
