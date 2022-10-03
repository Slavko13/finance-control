//связать все ключами добавить третью таблицу к юзерам
CREATE TABLE finance_user (
     id bigint NOT NULL,
     firstname character varying(255) NOT NULL,
     lastname character varying(255),
     login character varying(255) NOT NULL,
     password character varying(255) NOT NULL,
);

CREATE TABLE user_investing_properties (
    id bigint NOT NULL,
    user_id bigint NOT NULL,
    tinkoff_api_secret_key character varying(255),
);

CREATE TABLE user_roles (
      id bigint NOT NULL,
      user_id bigint NOT NULL,
      role_name character varying(255),
);

CREATE TABLE user_money_waste_properties (
    id bigint NOT NULL,
    user_id bigint NOT NULL,
    rounding_up_the_payment integer NOT NULL,
);

CREATE TABLE money_waste (
    id bigint NOT NULL,
    user_id bigint NOT NULL,
    money_spent bigint NOT NULL,
    type_of_spending character varying(255) NOT NULL,
    description character varying(255),
);

CREATE TABLE user_tinkoff_investing_statistics (
    id bigint NOT NULL,
    user_id bigint NOT NULL,
    current_money double precision,
    daily_difference double precision,
    weekly_difference double precision,
    monthly_difference double precision,
    quarter_difference double precision,
    annual_difference double precision,
    description character varying(255),
);

CREATE TABLE user_invest_piggy_bank_statistics (
    id bigint NOT NULL,
    user_id bigint NOT NULL,
    current_money double precision,
    daily_difference double precision,
    weekly_difference double precision,
    monthly_difference double precision,
    quarter_difference double precision,
    annual_difference double precision,
    description character varying(255),
);

CREATE TABLE user_savings_account_statistics (
    id bigint NOT NULL,
    user_id bigint NOT NULL,
    rate double precision,
    full_money_saved double precision,
    daily_money_saved double precision,
    weekly_money_saved double precision,
    monthly_money_saved double precision,
    quarter_money_saved double precision,
    annual_money_saved double precision,
    description character varying(255),
);

CREATE TABLE user_money_spent_statistics (
    id bigint NOT NULL,
    user_id bigint NOT NULL,
    full_money_spent double precision,
    daily_money_spent double precision,
    weekly_money_spent double precision,
    monthly_money_spent double precision,
    quarter_money_spent double precision,
    annual_money_spent double precision,
    description character varying(255),
);

CREATE TABLE user_paid_subscription (
    id bigint NOT NULL,
    payment_interval character varying(255),
    payment_date date,
    subscription_cost double precision,
    description character varying(255),
);
