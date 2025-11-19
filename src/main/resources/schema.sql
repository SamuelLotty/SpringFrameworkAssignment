CREATE TABLE Planet (
                        planet_id INT PRIMARY KEY AUTO_INCREMENT,
                     name VARCHAR(50),
    type VARCHAR(50),
    radius_km INT,
    mass_kg INT,
    orbital_period_days INT
    );

-- CREATE TABLE User(
--                      user_id INT PRIMARY KEY AUTO_INCREMENT,
--                      username VARCHAR(50) UNIQUE,
--                      password VARCHAR (50), /* Hashed*/
--                      role VARCHAR(20),
--                      enabled BIT DEFAULT FALSE /* Boolean = BIT */
-- );

CREATE TABLE Moon(
                     moon_id INT PRIMARY KEY AUTO_INCREMENT,
                     name VARCHAR (50),
                     diameter_km INT,
                     orbital_period_days INT,
                     planet_id INT,
                     CONSTRAINT fk_moon FOREIGN KEY (planet_id)
                        REFERENCES Planet(planet_id)



);