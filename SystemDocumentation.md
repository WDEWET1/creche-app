Systems

MANUAL



Childcare Management System


CPUT – Software Engineering and Design


November, 2014



Revision Sheet

Release No.	Date	Revision Description
Rev. 0	16/11/2014	System Manual Template and Checklist



1)	SYSTEM OVERVIEW
A Childcare Management System. This software solution contains all the functions needed to run a crèche successfully. Functionality includes:

•	Financial Administration
•	Staff / Human Resource Administration
•	Children Registration
•	Health Care Monitor
•	Detailed Childcare Progress
•	Reports

Financial Reports includes Income and Expenditure. Manages the cash flow of the business.
Staff / Human Resources are concerned with the administration and management of employees.

Children Registration allows a user to add and manage our customers (children) together with parents and all the necessary details that’s attached to a child.

Healthcare Monitor is concerned with the overall well being of the child. Information such as allergies needs to be recorded upon registration and is important information during class time.

Detailed Childcare Progress is concerned with the progress of the child during his/her stay at the facility. Being a school, progress monitoring is of outmost importance.

Reports. A comprehensive Reporting module allows a user to view everything on the system. Financial stance, staff members and Progress to mention a few.

2)	SYSTEM ARCHITECTURE

The application uses a 3 tier system,
1)	Front end:
2)	Services layer
3)	Model

The front end only consists of the GIU’s, no business logic is used in the front end.
All the Human interface design and design manipulation is used. The Front end only speaks to the business layer which is the services.

The service layer also known as the business layer is used to get data from the front end and manipulates it accordingly. The business layer also makes use of the model to insert, get or update data in the database. the service layer acts as the mediator between the front end and the model or database.

The model is used by the business layer to persist data to the crèche database. The model conforms to the structures of the database and will have a set structure.

3)	DATA DESIGN

The data used is will be manipulated in a database, the database tables is as follows:



All primary keys is set to auto increment and is of value int in the programming language.

Date columns for tables are set to date format but can be used using string in programming language.

String in the programming language is set to varchar format in the database

Currency values is set to decimal(15.2) in all tables in the database.

The tables can be accessed using the defined methods in the services package called SQLQueries.

4)	COMPONENT DESIGN

The application is designed to emphasize on the separation of concerns. It has a service layer which communicates to the data management layer. The database management layer is the persistence layer that inserts, update, get and delete data in the database. The services layer is used entirely for business logic. It has implementations like validation methods, styles classes and SQL queries pre-written that can be used by all interfaces that will eventually contribute to software reuse,  The application is written in such a way that if the button style needs to be changed it can be changed in one class, that class is used by all the buttons in the application.

5)	HUMAN INTERFACE DESIGN


The human interface design is made as simple as possible and designed in such a way that the user doesn’t have to do a lot of typing. The interface makes used of objects such as drop down lists and radio buttons for example to simplify the user experience. The application uses a basic java interface and uses java awt components. The user interface is set to a light yellow color background, all buttons is set to look the same over all screen.


6)	REQUIREMENTS

For the Application to run you will need the following install on the computer:
1)	Mysql database
2)	Java version 1.7 32bit or 64bit







