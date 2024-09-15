package pro.sky.skyprocalculatorspring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NullParameterException extends RuntimeException {

    public NullParameterException(String message) {
        super(message);
    }
}
