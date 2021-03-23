DROP TABLE IF EXISTS public.payment;

CREATE TABLE payment (
    id uuid PRIMARY KEY,
    numBill VARCHAR(255),
    datePayment DATE,
    amountPayment NUMERIC(10,2),
    codProvider VARCHAR(255),
    codClient VARCHAR(255),
    cost NUMERIC(10,2),
    channel VARCHAR(255)
    );

INSERT INTO payment (id, numBill, datePayment, amountPayment, codClient, codProvider, cost, channel)
 values ('6cfc0f2f-5d34-45c9-8aa2-f5ac39b1e02f', 'B001', '2021-03-22', 300.00, 'C001', 'P001', 10.00, 'api');
