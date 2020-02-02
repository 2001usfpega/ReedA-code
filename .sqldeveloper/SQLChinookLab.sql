--SQL Lab!
--Made by Alia Reed

----Task 2.1!
--Select all records from the Employee table.
SELECT * FROM employee;

--Select all records from the Employee table where last name is King.
SELECT * FROM employee WHERE lastname = 'King';

--Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
SELECT * FROM employee WHERE firstname = 'Andrew' AND reportsto IS NULL;

----Task 2.2!
--Select all albums in Album table and sort result set in descending order by title.
SELECT * FROM album ORDER BY title DESC;

--Select first name from Customer and sort result set in ascending order by city
SELECT * FROM customer ORDER BY city ASC;

----Task 2.3!
--Insert two new records into Genre table.
SELECT * FROM genre;
INSERT INTO genre VALUES(26, 'Anime OSTs');
INSERT INTO genre VALUES(27, 'Video Game OSTs');

--Insert two new records into Employee table.
SELECT * FROM employee;
INSERT INTO employee VALUES(9, 'Lane',' Mazikeen', 'Secretary', NULL,' 08-JUN-32'
    ,'09-JUN-75','18 Deadman''s Wonderland', 'Heck', 'Heck', 'Heck', '666'
    ,'+1 (666) 666-6669', '+1 (666) 420-4200', 'mazikeen@chinookcorp.com');
INSERT INTO employee VALUES(10, 'Beur', 'Zaqary', 'Secretary', NULL, '12-APR-27'
    ,'01-APR-77','19 Deadman''s Wonderland', 'Heck', 'Heck', 'Heck', '666'
    , '+1 (666) 666-6669' ,'+1 (666) 420-4200', 'zaqary@chinookcorp.com');

--Insert two new records into Customer table.
SELECT * FROM customer;
INSERT INTO customer VALUES(60, 'Baby', 'Corner', NULL, '99 Mulberry Lane', 'Mulberry'
    , 'Mulberry', 'Mulberry', '99', '+420 (228) 194-2319', NULL, 'babybaby@gmail.com', '2');
INSERT INTO customer VALUES(61, 'Wazowski', 'Mike', NULL, '99 Pookie Poo Lane', 'Sully''s Place'
    , 'Sully''s Place', 'Sully''s Place', '98', '+420 (224) 941-2319', NULL, 'mikeythebigmike@gmail.com', '4');

----Task 2.4!
--Update Aaron Mitchell in Customer table to Robert Walter.
UPDATE customer SET firstname = 'Robert' WHERE firstname= 'Aaron';
UPDATE customer SET lastname = 'Walter' WHERE lastname= 'Mitchell';

--Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”.
SELECT * FROM artist;
UPDATE artist SET name = 'CCR' WHERE name = 'Creedence Clearwater Revival';

----Task 2.5!
--Select all invoices with a billing address like “T%”.
SELECT * FROM invoice;
SELECT * FROM invoice WHERE billingaddress LIKE 'T%';

----Task 2.6!
--Select all invoices that have a total between 15 and 50.
SELECT * FROM invoice WHERE total < 50 AND total > 15;

--Select all employees hired between 1st of June 2003 and 1st of March 2004.
SELECT * FROM employee WHERE hiredate BETWEEN '01-Jun-03' AND '01-MAR-04';

----Task 2.7!
--Delete a record in Customer table where the name is Robert Walter.
--(There may be constraints that rely on this, find out how to resolve them.)
ALTER TABLE invoice  
DISABLE CONSTRAINT FK_INVOICECUSTOMERID;  
DELETE FROM customer WHERE firstname='Robert' AND lastname='Walter';

----Task 3.1!
--Create a function that returns the current time.
CREATE OR REPLACE PROCEDURE what_time_is_it
IS
    BEGIN
        DBMS_OUTPUT.PUT_LINE('What time is it??? It''s '
        || TO_CHAR(SYSDATE, 'MM-DD-YY HH:MI:SS AM')
    );
END;
/
BEGIN
 what_time_is_it;
END;
/
--Create a function that returns the length of name in MEDIATYPE table.
SELECT * FROM mediatype;
CREATE OR REPLACE PROCEDURE getLengths
AS
    BEGIN
        SELECT LENGTH(name) AS namelength
        INTO VIEW
        FROM mediatype;
    END;
/
SELECT LENGTH(name) AS namelength
        FROM mediatype;
---------------- weirdly only works as a statement but not as a procedure or function?????

----Task 3.2!
--Create a function that returns the average total of all invoices.
SELECT * FROM invoice;
CREATE OR REPLACE FUNCTION invoiceAverage
RETURN NUMBER
AS AVERAGE NUMBER;
    BEGIN
        SELECT AVG(total) INTO AVERAGE
        FROM invoice;
        RETURN AVERAGE;
    END;
/
DECLARE
    avAv NUMBER;
BEGIN
    avAv := invoiceAverage;
    DBMS_OUTPUT.PUT_LINE(avAv);
END;
/

--Create a function that returns the most expensive track
SELECT * FROM track;
CREATE OR REPLACE FUNCTION mostExpensiveTrack
RETURN NUMBER
IS
    maxid NUMBER;
BEGIN
    SELECT MAX(unitprice) INTO maxid FROM track;
    RETURN  maxid;
END;
/
DECLARE
    maxid NUMBER;
BEGIN
    maxid := mostExpensiveTrack();
    DBMS_OUTPUT.PUT_LINE('THE MAX: ' || maxid);
END;
/

----Task 3.3!
--Create a function that returns the average price of invoiceline items in the invoiceline table.
SELECT * FROM invoiceline;
CREATE OR REPLACE FUNCTION invoicelineAverage
RETURN NUMBER
AS AVERAGE NUMBER;
    BEGIN
        SELECT AVG(unitprice) INTO AVERAGE
        FROM invoiceline;
        RETURN AVERAGE;
    END;
/
DECLARE
    avAv NUMBER;
BEGIN
    avAv := invoicelineAverage;
    DBMS_OUTPUT.PUT_LINE(avAv);
END;
/

----Task 3.4!
--Create a function that returns all employees who are born after 1968.
CREATE OR REPLACE FUNCTION after_1968 RETURN SYS_REFCURSOR
IS
  employee_c SYS_REFCURSOR;
BEGIN
  OPEN employee_c FOR SELECT * FROM employee
                        WHERE birthdate >= TO_DATE('01-01-1968','DD-MM-YYYY');
  RETURN employee_c;
END;
/
SELECT after_1968 FROM dual;

----Task 4.1!
--Create a stored procedure that selects the first and last names of all the employees.
SELECT * FROM employee;
CREATE OR REPLACE PROCEDURE getNames
IS
        CURSOR n IS SELECT firstname, lastname FROM employee;
        fname employee.firstname%TYPE;
        lname employee.lastname%TYPE;
    BEGIN
        OPEN n;
        LOOP
            FETCH n INTO fname, lname;
            DBMS_OUTPUT.PUT_LINE(fname || ' ' || lname);
            EXIT WHEN n%NOTFOUND;
        END LOOP;
    END;
/
BEGIN
    getNames;
END;
/
------------- it's printing laura callahan twice at the end????

----Task 4.2!
--Create a stored procedure that updates the personal information of an employee.
CREATE OR REPLACE PROCEDURE updateemployee
IS
BEGIN
    UPDATE employee SET firstname = 'Lauraaa' WHERE firstname = 'Laura';
    UPDATE employee SET lastname = 'Callahen' WHERE lastname = 'Callahan';
    UPDATE employee SET birthdate = '09-JAN-69' WHERE birthdate = '09-JAN-68';
END;
/
BEGIN
    updateemployee;
END;
/

--Create a stored procedure that returns the managers of an employee.
CREATE OR REPLACE PROCEDURE returnmanager(id IN NUMBER, manager OUT VARCHAR2)
IS
    managerid NUMBER(10);
BEGIN
    SELECT reportsto INTO managerid FROM employee WHERE employeeid = id;
    SELECT firstname || ' ' || lastname INTO manager FROM employee WHERE employeeid = managerid;
END;
/
DECLARE
    manager VARCHAR2(50);
BEGIN
    returnmanager(6, manager);
    DBMS_OUTPUT.PUT_LINE(manager);
END;
/
----Task 4.3!
--Create a stored procedure that returns the name and company of a customer.
SELECT * FROM customer;
CREATE OR REPLACE PROCEDURE returncustomer(lname OUT VARCHAR2, fname OUT VARCHAR2
    , comcast OUT VARCHAR2)
IS
BEGIN
    SELECT lastname INTO lname FROM customer WHERE lastname = 'Martins';
    SELECT firstname INTO fname FROM customer WHERE firstname = 'Eduardo';
    SELECT company INTO comcast FROM customer WHERE company = 'Woodstock Discos';
END;
/
BEGIN
    returncustomer(lname, fname, comcast);
    DBMS_OUTPUT.PUT_LINE(fname || ' ' || lname || ' works at ' || comcast || '!');
END;
/

----Task 5!
--Create a transaction that given a invoiceId will delete that invoice.
--(There may be constraints that rely on this, find out how to resolve them.)
SELECT * FROM invoice;
--ALTER TABLE invoice;
--DISABLE CONSTRAINT FK_INVOICEINVOICEID;  
DELETE FROM invoice WHERE invoiceid = 1;

--Create a transaction nested within a stored procedure that inserts a new
--record in the Customer table.
SELECT * FROM customer;
CREATE OR REPLACE PROCEDURE insertrecord
IS
BEGIN
INSERT INTO customer VALUES(62, 'Googly', 'Bear', NULL, '99 Pookie Poo Lane', 'Sully''s Place'
    , 'Sully''s Place', 'Sully''s Place', '98', '+420 (224) 941-2319', NULL, 'mikeythebigmike@gmail.com', '4');
END;
/
BEGIN
    insertrecord;
END;
/

----Task 6.1!
--Create an after insert trigger on the employee table fired after a
--new record is inserted into the table.
SELECT * FROM employee;

INSERT INTO employee VALUES(11, 'May', 'Rin', 'Secretary', NULL, '12-APR-27'
    ,'01-APR-77','15 Deadman''s Wonderland', 'Heck', 'Heck', 'Heck', '666'
    , '+1 (666) 666-6669' ,'+1 (666) 420-4200', 'Rin@chinookcorp.com');

CREATE OR REPLACE TRIGGER afterinsert
AFTER INSERT ON employee
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('Someone was hired!');
END;
/

--Create an after update trigger on the album table that fires after a row is
--inserted in the table.
SELECT * FROM album;
INSERT INTO album VALUES(348, 'Monsters Inc. (Soundtrack from the Motion Picture', 270);

CREATE OR REPLACE TRIGGER afterinsert2
AFTER INSERT ON album
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('A new album has dropped!!');
END;
/

--Create an after delete trigger on the customer table that fires after a row is deleted
--from the table.
SELECT * FROM customer;

CREATE OR REPLACE TRIGGER afterdelete
AFTER DELETE ON customer
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('A customer left us!');
END;
/
DELETE customer WHERE lastname = 'Wazowski';
----Task 7.1!
--Create an inner join that joins customers and orders and specifies the name
--of the customer and the invoiceId.
SELECT * FROM customer;
SELECT * FROM invoice;
SELECT * FROM customer a, invoice b WHERE a.customerid = b.invoiceid;

----Task 7.2!
--Create an outer join that joins the customer and invoice table, specifying the
--CustomerId, firstname, lastname, invoiceId, and total.
SELECT * FROM customer a FULL OUTER JOIN invoice b ON a.customerid = b.invoiceid;

----Task 7.3!
--Create a right join that joins album and artist specifying artist name and title.
SELECT * FROM album a RIGHT OUTER JOIN artist b ON a.artistid = b.artistid;

----Task 7.4!
--Create a cross join that joins album and artist and sorts by artist name in ascending order.
SELECT * FROM album CROSS JOIN artist ORDER BY name ASC;

----Task 7.5!
--Perform a self-join on the employee table, joining on the reportsto column.
SELECT * FROM employee a INNER JOIN employee b ON a.employeeid = b.reportsto;

COMMIT;