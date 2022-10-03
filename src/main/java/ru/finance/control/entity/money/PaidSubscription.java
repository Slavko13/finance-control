package ru.finance.control.entity.money;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.finance.control.entity.users.FinanceUser;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Class for control ur money waste per day.
 *
 * @author Petrenko Viacheslav
 */

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_paid_subscription")
@Entity
public class PaidSubscription
{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    FinanceUser user;

    @Column(name = "user_id", updatable = false, insertable = false)
    Long userId;

    @Column(name = "payment_interval")
    String paymentInterval;

    @Column(name = "payment_date")
    LocalDate paymentDate;

    @Column(name = "subscription_cost")
    Double subscriptionCost;

    @Column(name = "description")
    String description;

}
