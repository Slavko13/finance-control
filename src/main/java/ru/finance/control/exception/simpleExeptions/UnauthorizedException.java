package ru.finance.control.exception.simpleExeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends RequestException
{
    public UnauthorizedException(final String message, final Throwable cause)
    {
        super(message, cause);
    }

    public UnauthorizedException(final String message)
    {
        super(message);
    }
}
