package ru.finance.control.dto.properties;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class InvestingPropertiesDto
{
    Long id;
    FinanceUser user;
    Long userId;
    String tinkoffApiSecretKey;

}
