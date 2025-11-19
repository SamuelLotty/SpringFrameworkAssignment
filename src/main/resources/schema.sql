CREATE TABLE Planet (
                        planet_id INT PRIMARY KEY AUTO_INCREMENT,
                     name VARCHAR(50),
    type VARCHAR(50),
    radius_km INT,
    mass_kg INT,
    orbital_period_days INT
    );

CREATE TABLE MyUser(
                     user_id INT PRIMARY KEY AUTO_INCREMENT,
                     username VARCHAR(50) UNIQUE NOT NULL,
                     password VARCHAR (50) NOT NULL,
                     role VARCHAR(20) NOT NULL,
                     enabled BIT DEFAULT 0
);

CREATE TABLE Moon(
                     moon_id INT PRIMARY KEY AUTO_INCREMENT,
                     name VARCHAR (50),
                     diameter_km INT,
                     orbital_period_days INT,
                     planet_id INT,
                     CONSTRAINT fk_moon FOREIGN KEY (planet_id)
                        REFERENCES Planet(planet_id)



);