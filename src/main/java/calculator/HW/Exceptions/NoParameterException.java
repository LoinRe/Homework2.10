package calculator.HW.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoParameterException extends RuntimeException{
    public NoParameterException() {
        super("Параметры не заданы");
    }
}
