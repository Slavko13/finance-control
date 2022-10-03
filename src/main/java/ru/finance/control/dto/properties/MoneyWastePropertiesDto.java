package ru.finance.control.dto.properties;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class MoneyWastePropertiesDto
{
    Long id;
    Integer roundingUpPayment;
}
