create table USERS (
    ID serial PRIMARY KEY,
    EMAIL varchar(100),
    PASSWORD varchar(100)
);

create table PICTURES (
    ID serial PRIMARY KEY,
    USER_ID integer,
    PICTURE_URL varchar(500),
    GRAYSCALE varchar(100),
    SATURATE varchar(100),
    BLUR varchar(100),
    SEPIA varchar(100),
    HUEROTATE varchar(100),
    BRIGHTNESS varchar(100),
    CONTRAST varchar(100),
    INVERT varchar(100),
    OPACITY varchar(100),
    CONSTRAINT USER_ID FOREIGN KEY(USER_ID)
        REFERENCES USERS (ID)
--        ON UPDATE RESTRICT ON DELETE CASCADE
);
