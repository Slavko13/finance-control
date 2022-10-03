package ru.finance.control.dto.statistics;


import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class TinkoffInvestingStatistics
{
    Long id;
    Double currentMoney;
    Double dailyDifference;
    Double weeklyDifference;
    Double monthlyDifference;
    Double quarterDifference;
    Double annualDifference;
    Double description;
}
