package ru.finance.control.exception.simpleExeptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestException extends RequestException
{

    public BadRequestException(final String message, final Throwable cause)
    {
        super(message, cause);
    }

    public BadRequestException(final String message)
    {
        super(message);
    }
}
