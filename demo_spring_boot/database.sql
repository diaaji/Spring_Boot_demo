CREATE DATABASE Demo_Spring_Boot;

USE Demo_Spring_Boot;

CREATE TABLE users (
    username VARCHAR(50) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    token VARCHAR(100),
    expire_at BIGINT NOT NULL,
    PRIMARY KEY (username),
    UNIQUE (token)
)ENGINE =InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE Contacts (
    id INT NOT NULL AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50),
    email VARCHAR(100),
    phone_number VARCHAR(20),
    address VARCHAR(255),
    PRIMARY KEY (id),
    FOREIGN KEY fk_users_contacts (username) REFERENCES users(username)
)ENGINE InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE Addresses
(
    id INT NOT NULL AUTO_INCREMENT,
    contact_id INT NOT NULL,
    adress_line1 VARCHAR(255) NOT NULL,
    adress_line2 VARCHAR(255),
    city VARCHAR(100) NOT NULL,
    state VARCHAR(100) NOT NULL,
    country VARCHAR(100) NOT NULL,
    postal_code VARCHAR(20) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY fk_contacts_addresses (contact_id) REFERENCES Contacts(id)

)
SELECT * FROM Contacts;
ALTER TABLE Contacts DROP COLUMN address;

ALTER TABLE users MODIFY expire_at DATETIME;
SELECT * FROM users;
DESC users;
SELECT * FROM Contacts;
DESC Contacts;

SELECT * FROM Addresses;
DESC Addresses;

SHOW COLUMNS FROM users LIKE 'expire_at';