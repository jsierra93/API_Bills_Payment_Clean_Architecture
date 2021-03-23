DROP TABLE IF EXISTS bills;

CREATE TABLE bills (
    numBill VARCHAR(255) PRIMARY KEY,
    dateBill DATE,
    detailBill VARCHAR(255),
    amountBill NUMERIC(10,2),
    codProvider VARCHAR(255),
    codClient VARCHAR(255),
    cost NUMERIC(10,2),
    active BOOLEAN NOT NULL
    );

INSERT INTO bills (numBill, dateBill, detailBill, amountBill, codClient, codProvider, cost, active)
 values ('B001', '2021-03-22','Internet Services', 300.00, 'C001', 'P001', 10.00, true );
