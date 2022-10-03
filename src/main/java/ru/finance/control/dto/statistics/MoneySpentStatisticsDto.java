package ru.finance.control.dto.statistics;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class MoneySpentStatisticsDto
{
    Long id;
    Double fullMoneySpent;
    Double dailyMoneySpent;
    Double weeklyMoneySpent;
    Double monthlyMoneySpent;
    Double quarterMoneySpent;
    Double annualMoneySpent;
    Double description;
}
