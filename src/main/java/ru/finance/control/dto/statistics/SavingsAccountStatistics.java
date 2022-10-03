package ru.finance.control.dto.statistics;


import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class SavingsAccountStatistics
{
    Long id;
    Double fullMoneySaved;
    Double dailyMoneySaved;
    Double weeklyMoneySaved;
    Double monthlyMoneySaved;
    Double quarterMoneySaved;
    Double annualMoneySaved;
    Double description;
}
