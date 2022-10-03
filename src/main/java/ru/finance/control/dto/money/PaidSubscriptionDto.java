package ru.finance.control.dto.money;


import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class PaidSubscriptionDto
{

    Long id;
    String paymentInterval;
    LocalDate paymentDate;
    Double subscriptionCost;
    String description;

}
