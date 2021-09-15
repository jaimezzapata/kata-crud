CREATE TABLE IF NOT EXISTS list (
id_list VARCHAR(50) NOT NULL,
PRIMARY KEY (id_list)
);

CREATE TABLE IF NOT EXISTS task (
id_task INTEGER(10) NOT NULL,
desc_task VARCHAR(50) NOT NULL,
status_task BIT NOT NULL,
id_list VARCHAR(50) NOT NULL,
PRIMARY KEY (id_task ),
FOREIGN KEY (id_list) REFERENCES list (id_list)
);