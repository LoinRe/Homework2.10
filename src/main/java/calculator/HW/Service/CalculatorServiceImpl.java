package calculator.HW.Service;

import calculator.HW.Exceptions.NoParameterException;
import calculator.HW.Exceptions.ZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Integer sum(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NoParameterException();
        }
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NoParameterException();
        }
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NoParameterException();
        }
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new ZeroException();
        }
        if (num1 == null || num2 == null) {
            throw new NoParameterException();
        }
        return num1 / num2;
    }

}
