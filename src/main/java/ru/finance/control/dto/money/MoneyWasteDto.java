package ru.finance.control.dto.money;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.finance.control.entity.users.FinanceUser;
import ru.finance.control.enums.money.MoneyWasteType;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class MoneyWasteDto
{
    Long id;
    Double moneySpent;
    MoneyWasteType moneyWasteType;
    String description;

}
