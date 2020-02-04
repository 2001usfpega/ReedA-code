--------BankOfAlia.sql for project 0 part 2!!!

CREATE USER banker IDENTIFIED BY p4ssw0rd;
GRANT CONNECT, RESOURCE TO banker;
GRANT DBA TO banker WITH ADMIN OPTION;

CREATE TABLE userwooser(

    idpls NUMBER(20)
    , firstname VARCHAR2(30)
    , lastname VARCHAR2(30)
    , psstpsst VARCHAR2(30)
    , checkpls NUMBER(20)
    , savesave NUMBER(20)
    , dadmin NUMBER (1, 0)

    , PRIMARY KEY(idpls)
);

DROP TABLE userwooser;

INSERT INTO userwooser(firstname, lastname, psstpsst, checkpls, savesave, dadmin)
    VALUES('Jinjun', 'Zhen', 'psstpsst', 500, 3000, 0);
INSERT INTO userwooser(firstname, lastname, psstpsst, checkpls, savesave, dadmin)
    VALUES('Wendy', 'Moreland', 'psstpsst', 400, 15000, 1);
INSERT INTO userwooser(firstname, lastname, psstpsst, checkpls, savesave, dadmin)
    VALUES('Amanda', 'Vocque', 'psstpsst', 3000, 4000, 0);

SELECT * FROM userwooser;

DELETE FROM userwooser;

SELECT * FROM userwooser WHERE customer_id = 2;

UPDATE userwooser SET psstpsst = 'psstpsst' WHERE idpls = 1002;

CREATE SEQUENCE custywusty
    START WITH 1000
    INCREMENT BY 1;

DROP SEQUENCE custywusty;
DROP TRIGGER newcrustacean;

CREATE OR REPLACE TRIGGER newcrustacean
    BEFORE INSERT ON userwooser
    FOR EACH ROW
    BEGIN
        IF : new.idpls IS NULL THEN
            SELECT custywusty.NEXTVAL INTO : new.idpls FROM dual;
        END IF;
    END;
/

COMMIT;