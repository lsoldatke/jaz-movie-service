CREATE TABLE movie(
    id BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    title VARCHAR(50) NOT NULL,
    category ENUM('COMEDY','DOCUMENTARY','THRILLER') NOT NULL,
    is_available BOOL NOT NULL);