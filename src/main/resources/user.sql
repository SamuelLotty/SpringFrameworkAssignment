CREATE TABLE User(
user_id INT PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(50) UNIQUE,
password VARCHAR (50), /* Hashed*/
role VARCHAR(20),
enabled BIT DEFAULT FALSE /* Boolean = BIT */
);