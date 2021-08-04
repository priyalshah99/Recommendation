DROP TABLE IF EXISTS orders;
create table orders
(
    id int,
    product_id varchar(100),
    customer_ip varchar2(100),
    product_name varchar2(500),
    PRIMARY KEY (id)
);