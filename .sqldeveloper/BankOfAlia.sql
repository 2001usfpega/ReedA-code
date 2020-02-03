--------BankOfAlia.sql for project 0 part 2!!!

CREATE USER banker IDENTIFIED BY p4ssw0rd;
GRANT CONNECT, RESOURCE TO banker;
GRANT DBA TO banker WITH ADMIN OPTION;

CREATE TABLE userwooser(

    identificationpls NUMBER(20)
    , firstname VARCHAR2(30)
    , lastname VARCHAR2(30)
    , psstpsst VARCHAR2(30)
    , firstname2 VARCHAR2(30)
    , lastname2 VARCHAR2 (30)
    , psstpsst2 VARCHAR(30)
    
    , PRIMARY KEY(identificationpls)
);

INSERT INTO userwooser(firstname, lastname) VALUES('Jinjun', 'Zhen');
INSERT INTO userwooser(firstname, lastname) VALUES('Wendy', 'Moreland');
INSERT INTO userwooser(firstname, lastname) VALUES('Amanda', 'Vocque');

DELETE FROM userwooser WHERE psstpsst = NULL;

SELECT * FROM userwooser WHERE customer_id = 2;

UPDATE userwooser SET psstpsst = 'password';

CREATE TABLE accountsmaccount(

    identificationplsacc NUMBER(20)
    , checkpls NUMBER(20)
    , savesave NUMBER(20)
    
    , PRIMARY KEY(identificationplsacc)
);

INSERT INTO accountsmaccount(checkpls) VALUES('1000');
INSERT INTO accountsmaccount(checkpls) VALUES('2000');

SELECT * FROM accountsmaccount;

DROP TABLE hempemp;

CREATE TABLE hempemp(

    identificationplsemp NUMBER (20)
    , firsthemp VARCHAR2 (30)
    , lasthemp VARCHAR2 (30)
    , psstpssthemp VARCHAR2 (30)
    , dadminboogiewoogie NUMBER (1, 0)
    
    , PRIMARY KEY(identificationplsemp)
);

CREATE SEQUENCE custywusty
    START WITH 1000
    INCREMENT BY 1;

CREATE SEQUENCE accountywounty
    START WITH 2000
    INCREMENT BY 1;

CREATE SEQUENCE employeewoyee
    START WITH 3000
    INCREMENT BY 1;

DROP SEQUENCE custywusty;

DROP TRIGGER newcrustacean;

CREATE OR REPLACE TRIGGER newcrustacean
    BEFORE INSERT ON userwooser
    FOR EACH ROW
    BEGIN
        IF : new.identificationpls IS NULL THEN
            SELECT custywusty.NEXTVAL INTO : new.identificationpls FROM dual;
        END IF;
    END;
/

CREATE OR REPLACE TRIGGER newacheywachey
    BEFORE INSERT ON accountsmaccount
    FOR EACH ROW
    BEGIN
        IF : new.identificationplsacc IS NULL THEN
            SELECT accountywounty.NEXTVAL INTO : new.identificationplsacc FROM dual;
        END IF;
    END;
/

CREATE OR REPLACE TRIGGER newhempseed
    BEFORE INSERT ON hempemp
    FOR EACH ROW
    BEGIN
        IF : new.identificationplsemp IS NULL THEN
            SELECT employeewoyee.NEXTVAL INTO : new.identificationplsemp FROM dual;
        END IF;
    END;
/

COMMIT;


