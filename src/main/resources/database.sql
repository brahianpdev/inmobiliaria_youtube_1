-- Insertar la inmobiliaria
INSERT INTO inmobiliaria (razon_social, matricula, cuit, mail, direccion, telefono)
VALUES ('Inmobiliaria de Springfield', 'Matrícula', 123456789, 'inmobiliaria@mail.com', '123 Calle Principal, Springfield', '123456789');

-- Obtener el ID de la inmobiliaria recién insertada
SET @inmobiliaria_id = LAST_INSERT_ID();

-- Insertar los clientes
INSERT INTO clientes (tipo_cliente, direccion, dni, mail, nombre, apellido, telefono, inmobiliaria_id)
VALUES
('INQUILINO', '742 Evergreen Terrace, Springfield', 11111111, 'homer@mail.com', 'Homer', 'Simpson', 111111111, @inmobiliaria_id),
('INQUILINO', '744 Evergreen Terrace, Springfield', 22222222, 'marge@mail.com', 'Marge', 'Simpson', 222222222, @inmobiliaria_id),
('INQUILINO', '742 Evergreen Terrace, Springfield', 33333333, 'bart@mail.com', 'Bart', 'Simpson', 333333333, @inmobiliaria_id),
('INQUILINO', '742 Evergreen Terrace, Springfield', 44444444, 'lisa@mail.com', 'Lisa', 'Simpson', 444444444, @inmobiliaria_id),
('INQUILINO', '742 Evergreen Terrace, Springfield', 55555555, 'maggie@mail.com', 'Maggie', 'Simpson', 555555555, @inmobiliaria_id),
('PROPIETARIO', '123 Calle del Árbol, Springfield', 66666666, 'ned@mail.com', 'Ned', 'Flanders', 666666666, @inmobiliaria_id),
('ASSISTANT_INMOBILIARIA', '456 Calle de la Quema, Springfield', 77777777, 'smithers@mail.com', 'Waylon', 'Smithers', 777777777, @inmobiliaria_id),
('OWNER_INMOBILIARIA', '123 Calle del Árbol, Springfield', 66666666, 'burns@mail.com', 'Montgomery', 'Burns', 666666666, @inmobiliaria_id);