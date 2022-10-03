package ru.finance.control.exception.simpleExeptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NotFoundException extends RequestException
{
    public NotFoundException(final String message, final Throwable cause)
    {
        super(message, cause);
    }

    public NotFoundException(final String message)
    {
        super(message);
    }
}
