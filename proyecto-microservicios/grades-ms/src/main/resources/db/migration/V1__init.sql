CREATE TABLE grades
(
    id         SERIAL PRIMARY KEY,
    subject    VARCHAR(100) NOT NULL,
    grade      NUMERIC(5, 2),
    student_id INTEGER      NOT NULL
);

-- Notas para Ana Torres (id = 1)
INSERT INTO grades (subject, grade, student_id)
VALUES ('Matemáticas', 9.5, 1),
       ('Historia', 8.0, 1),
       ('Biología', 9.0, 1);

-- Notas para Luis Pérez (id = 2)
INSERT INTO grades (subject, grade, student_id)
VALUES ('Matemáticas', 7.5, 2),
       ('Historia', 8.5, 2),
       ('Biología', 7.8, 2);

-- Notas para María García (id = 3)
INSERT INTO grades (subject, grade, student_id)
VALUES ('Matemáticas', 10.0, 3),
       ('Historia', 9.2, 3),
       ('Biología', 9.8, 3);

-- Notas para Carlos Ramírez (id = 4)
INSERT INTO grades (subject, grade, student_id)
VALUES ('Matemáticas', 6.5, 4),
       ('Historia', 7.0, 4),
       ('Biología', 6.8, 4);

-- Notas para Elena Soto (id = 5)
INSERT INTO grades (subject, grade, student_id)
VALUES ('Matemáticas', 8.9, 5),
       ('Historia', 9.1, 5),
       ('Biología', 8.7, 5);
