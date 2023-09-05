DROP TABLE IF EXISTS brands;
CREATE TABLE IF NOT EXISTS brands (
id                  VARCHAR(32) UNIQUE PRIMARY KEY,
name                TEXT NOT NULL,
);

DROP TABLE IF EXISTS business;
CREATE TABLE IF NOT EXISTS business (
id                  VARCHAR(32) UNIQUE PRIMARY KEY,
name                TEXT NOT NULL,
color_primary       VARCHAR(7) NOT NULL,
color_secondary     VARCHAR(7) NOT NULL,
color_tertiary      VARCHAR(7) NOT NULL,
color_error         VARCHAR(7) NOT NULL,
color_warning       VARCHAR(7) NOT NULL,
color_success       VARCHAR(7) NOT NULL
);

DROP TABLE IF EXISTS operations;
CREATE TABLE IF NOT EXISTS operations (
id                  VARCHAR(32) UNIQUE PRIMARY KEY,
type                TEXT NOT NULL,
timestamp           VARCHAR(32) NOT NULL,
quantity            INTEGER NOT NULL,
price_unit          DOUBLE NOT NULL,
price_total         DOUBLE NOT NULL,
amount              DOUBLE NOT NULL,
product_            VARCHAR(32) FOREIGN KEY REFERENCES product(id),
user_               VARCHAR(32) FOREIGN KEY REFERENCES users(id),
);

DROP TABLE IF EXISTS products;
CREATE TABLE IF NOT EXISTS products (
id                  VARCHAR(32) UNIQUE PRIMARY KEY,
name                TEXT NOT NULL,
description         TEXT NOT NULL,
price               DOUBLE NOT NULL,
price_discounted    DOUBLE NOT NULL,
hasDiscount         BOOLEAN NOT NULL,
discount_percentage INT NOT NULL,
stock               INT NOT NULL,
brand_              VARCHAR(32) FOREIGN KEY REFERENCES brands(id),
);

DROP TABLE IF EXISTS users;
CREATE TABLE IF NOT EXISTS users (
id                  VARCHAR(32) UNIQUE PRIMARY KEY,
username            TEXT NOT NULL,
password            TEXT NOT NULL,
name                TEXT NOT NULL,
birthdate           DATE NOT NULL,
email               TEXT NOT NULL,
business_           VARCHAR(32) FOREIGN KEY REFERENCES business(id),
);