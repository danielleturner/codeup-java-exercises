mysql> pager less -~SFX;
PAGER set to 'less -~SFX'

mysql> pager less -~SFX;
PAGER set to 'less -~SFX'
mysql> SELECT * FROM mysql.user;

-- to login in mySQL --
mysql -v root -p
password: --doesn't show while being typed

-- help menu --
help;

-- to navigate to a specific topic in help menue --
help contents; -- example

--Exercises--
danielleturner@Danielles-MacBook-Pro-2 ~ % mysql.server start
Starting MySQL
 SUCCESS!
danielleturner@Danielles-MacBook-Pro-2 ~ % 2022-03-15T18:40:29.6NZ mysqld_safe A mysqld process already exists
mysql -u joe -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 16
Server version: 8.0.27 Homebrew

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql>

--2b--
mysql -u joe -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 16
Server version: 8.0.27 Homebrew

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

--2c--
mysql> SELECT user,host FROM mysql.user;
ERROR 1142 (42000): SELECT command denied to user 'joe'@'localhost' for table 'user'
mysql>

--2d--
danielleturner@Danielles-MacBook-Pro-2 ~ % mysql.server status
 SUCCESS! MySQL running (12731)
danielleturner@Danielles-MacBook-Pro-2 ~ % mysql -u root -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 18
Server version: 8.0.27 Homebrew

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql>

-- 3 Create a new user named anne. Give anne her own password.

--3a
mysql> CREATE user 'anna'@'localhost' IDENTIFIED BY 'password';
Query OK, 0 rows affected (0.00 sec)
mysql>
mysql> GRANT ALL ON *.* TO 'anna'@'localhost';
Query OK, 0 rows affected (0.01 sec)

mysql>

--3b
danielleturner@Danielles-MacBook-Pro-2 ~ % mysql -u anna -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 19
Server version: 8.0.27 Homebrew

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> SELECT current_user;
+----------------+
| current_user   |
+----------------+
| anna@localhost |
+----------------+
1 row in set (0.00 sec)

mysql>

--3c--
danielleturner@Danielles-MacBook-Pro-2 ~ % mysql -u anna -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 23
Server version: 8.0.27 Homebrew

Copyright (c) 2000, 2021, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> SELECT user,host FROM mysql.user;
+------------------+-----------+
| user             | host      |
+------------------+-----------+
| anna             | localhost |
| joe              | localhost |
| mysql.infoschema | localhost |
| mysql.session    | localhost |
| mysql.sys        | localhost |
| root             | localhost |
+------------------+-----------+
6 rows in set (0.00 sec)


--3d--

mysql> SELECT current_user;
+----------------+
| current_user   |
+----------------+
| anna@localhost |
+----------------+
1 row in set (0.00 sec)

mysql> CREATE user 'sally'@"localhost' IDENTIFIED BY 'password';
    ">
    "> CREATE USER 'sally'@'loclhost' IDENTIFIED BY 'password';
    "> CREATE user 'sally'A'localhost' IDENTIFIED BY 'password';

--4--
--a--
mysql> GRANT ALL ON mydb.* TO 'jean'@'localhost';
Query OK, 0 rows affected (0.00 sec)

--5--
+------------------+-----------+
| user             | host      |
+------------------+-----------+
| mysql.infoschema | localhost |
| mysql.session    | localhost |
| mysql.sys        | localhost |
| root             | localhost |
+------------------+-----------+
4 rows in set (0.00 sec)

--6--