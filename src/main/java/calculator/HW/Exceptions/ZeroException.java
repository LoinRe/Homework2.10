package calculator.HW.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ZeroException extends RuntimeException {
    public ZeroException() {
        super("Делить на ноль нельзя");
    }
}

