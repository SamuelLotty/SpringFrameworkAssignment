CREATE TABLE Moon(
  moon_id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR (50),
  diameter_km INT,
  orbital_period_days INT,
  planet_id INT FOREIGN KEY
);