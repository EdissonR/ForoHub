create table medicos(

    id bigint not null auto_increment,
    titulo VARCHAR(255) NOT NULL,
    email varchar(100) not null unique,
    autor_id INT NOT NULL,
    fecha_de_creacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    mensaje TEXT NOT NULL,
    titulo VARCHAR(255) NOT NULL,

    primary key(id)
    );