-- Populate Planet table
INSERT INTO Planet (name, type, radius_km, mass_kg, orbital_period_days) VALUES
                                                                             ('Mercury', 'Terrestrial', 2439, 312312321, 88),
                                                                             ('Venus', 'Terrestrial', 6052, 321312321, 225),
                                                                             ('Earth', 'Terrestrial', 6371, 321312312, 365),
                                                                             ('Mars', 'Terrestrial', 3389, 61421421, 687),
                                                                             ('Jupiter', 'Gas Giant', 69911, 189000, 4333),
                                                                             ('Saturn', 'Gas Giant', 58232, 5683000, 10759),
                                                                             ('Uranus', 'Ice Giant', 25362, 868100000, 30687),
                                                                             ('Neptune', 'Ice Giant', 24622, 10240000, 60190);

-- -- Populate User table
-- INSERT INTO User (username, password, role, enabled) VALUES
--                                                          ('astro_alice', 'hash_example1', 'admin', 1),
--                                                          ('sky_bob', 'hash_example2', 'moderator', 1),
--                                                          ('galileo', 'hash_example3', 'user', 1),
--                                                          ('hubble', 'hash_example4', 'user', 0);

-- Populate Moon table
INSERT INTO Moon (name, diameter_km, orbital_period_days, planet_id) VALUES
                                                                         ('Moon', 3474, 27, 3),
                                                                         ('Phobos', 22, 0, 4),
                                                                         ('Deimos', 12, 1, 4),
                                                                         ('Io', 3643, 2, 5),
                                                                         ('Europa', 3122, 4, 5),
                                                                         ('Ganymede', 5268, 7, 5),
                                                                         ('Callisto', 4821, 16, 5),
                                                                         ('Titan', 5150, 16, 6),
                                                                         ('Enceladus', 504, 1, 6),
                                                                         ('Mimas', 396, 1, 6),
                                                                         ('Triton', 2706, 6, 8),
                                                                         ('Oberon', 1523, 14, 7),
                                                                         ('Titania', 1577, 9, 7),
                                                                         ('Miranda', 471, 2, 7),
                                                                         ('Ariel', 1158, 3, 7),
                                                                         ('Umbriel', 1169, 4, 7),
                                                                         ('Dione', 1123, 3, 6),
                                                                         ('Rhea', 1527, 5, 6),
                                                                         ('Iapetus', 1469, 79, 6),
                                                                         ('Proteus', 420, 1, 8);
