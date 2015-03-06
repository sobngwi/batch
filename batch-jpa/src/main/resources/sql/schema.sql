 alter table transaction drop foreign key FK_syue16450hrqk910w0if4e778
 alter table transaction drop foreign key FK_ocsrbo97xdo28v6i4i2xl07wm
 drop table if exists account
 drop table if exists customer
 drop table if exists ticker
 drop table if exists transaction
 
 create table account (account_id bigint not null auto_increment, 
 accountnumber varchar(255), 
 cashBalance decimal(19,2), 
 customer_id bigint, 
 tier bigint, primary key (account_id))
 
 create table customer (customer_id bigint not null auto_increment, 
 address1 varchar(255), 
 city varchar(255), 
 state varchar(255), 
 zip varchar(255), 
 firstname varchar(255), 
 lastname varchar(255), 
 ssn varchar(255), 
 taxid varchar(255), 
 primary key (customer_id))
 
 create table ticker (ticker_id bigint not null auto_increment, 
 currentprice decimal(19,2), 
 ticker varchar(255),
 primary key (ticker_id))
 
 create table transaction (transaction_id bigint not null auto_increment, 
 dollaramount decimal(19,2), 
 executedtime datetime, 
 fee varchar(255), quantity bigint, 
 tradetimestamp datetime, 
 transactiontype integer,
 account_id bigint, 
 ticker_id bigint, 
 primary key (transaction_id))
 alter table transaction add index FK_syue16450hrqk910w0if4e778 (account_id), 
 add constraint FK_syue16450hrqk910w0if4e778 foreign key (account_id) references account (account_id)
 alter table transaction add index FK_ocsrbo97xdo28v6i4i2xl07wm (ticker_id), 
 add constraint FK_ocsrbo97xdo28v6i4i2xl07wm foreign key (ticker_id) references ticker (ticker_id)
 
 --- version 2
 Hibernate: alter table transaction drop foreign key FK_syue16450hrqk910w0if4e778
 alter table transaction drop foreign key FK_ocsrbo97xdo28v6i4i2xl07wm
 drop table if exists account
 drop table if exists customer
 drop table if exists ticker
 drop table if exists transaction
 create table account (account_id bigint not null auto_increment, accountnumber varchar(255), cashBalance decimal(19,2), customer_id bigint, tier integer, primary key (account_id))
 create table customer (customer_id bigint not null auto_increment, address1 varchar(255), city varchar(255), state varchar(255), zip varchar(255), firstname varchar(255), lastname varchar(255), ssn varchar(255), taxid varchar(255), primary key (customer_id))
 create table ticker (ticker_id bigint not null auto_increment, currentprice decimal(19,2), ticker varchar(255), primary key (ticker_id))
 create table transaction (transaction_id bigint not null auto_increment, 
 accountId bigint not null, 
 accountNumber varchar(255), 
 dollaramount decimal(19,2), 
 executedtime datetime, 
 fee varchar(255), 
 quantity bigint, 
 tickerId bigint not null, 
 tradetimestamp datetime, 
 transactiontype integer, 
 type integer, 
 account_id bigint, 
 ticker_id bigint, 
 primary key (transaction_id))
 
 alter table transaction add index FK_syue16450hrqk910w0if4e778 (account_id), 
 add constraint FK_syue16450hrqk910w0if4e778 foreign key (account_id) references account (account_id)
 alter table transaction add index FK_ocsrbo97xdo28v6i4i2xl07wm (ticker_id), 
 add constraint FK_ocsrbo97xdo28v6i4i2xl07wm foreign key (ticker_id) references ticker (ticker_id)