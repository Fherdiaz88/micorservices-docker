CREATE TABLE students
(
    id       SERIAL PRIMARY KEY,
    fullname VARCHAR(100) NOT NULL,
    age      INTEGER,
    email    VARCHAR(100) UNIQUE
);

INSERT INTO students (fullname, age, email)
VALUES ('Ana Torres', 20, 'ana.torres@example.com'),
       ('Luis Pérez', 22, 'luis.perez@example.com'),
       ('María García', 19, 'maria.garcia@example.com'),
       ('Carlos Ramírez', 21, 'carlos.ramirez@example.com'),
       ('Elena Soto', 23, 'elena.soto@example.com');