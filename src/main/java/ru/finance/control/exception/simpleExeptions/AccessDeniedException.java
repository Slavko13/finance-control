package ru.finance.control.exception.simpleExeptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FORBIDDEN)
public class AccessDeniedException extends RequestException
{

    public AccessDeniedException(final String message, final Throwable cause)
    {
        super(message, cause);
    }

    public AccessDeniedException(final String message)
    {
        super(message);
    }
}
