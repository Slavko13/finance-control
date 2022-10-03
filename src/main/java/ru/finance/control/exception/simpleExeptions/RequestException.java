package ru.finance.control.exception.simpleExeptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class RequestException extends RuntimeException
{
    public RequestException(final String message, final Throwable cause)
    {
        super(message, cause);
    }

    public RequestException(final String message)
    {
        super(message);
    }

}
