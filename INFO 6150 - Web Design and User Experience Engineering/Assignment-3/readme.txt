Assignment 3

In this assignment, Javascipt have been used to add functionality to student table. 

In checkboxes, check(this) have been used to check whether a checkbox has been clicked - on change or not. If so, then the color of row changes to orange. If multiple checkboxes are clicked, the color of rows changes to yellow. Each row along with checkboxes also consists of a download image which enables a drop down menu with details of that row, using hide() function  which takes each specific row as argument in o'clock property. The image tag is used inside anchor link tag that consists of table row that by default has display set to none, and upon clicking the drop down image, the display toggles.

Each row also consists of two buttons edit and delete. Edit button has onclick property set to editPrompt() function in javascript which simply displays a prompt with message "Edit details".
Delete button has o'clock property set to DeleteRowFunction() which deletes the particular row from table with checkbox enabled.

The interface also consists of button to add a new student which dynamically adds student and teacher with number allotted by default based on the row in which it is being added in the table. Its onclick property is set to newEntry function which inserts two rows, one for student details and one for drop down detail, and all the cells are added in respective rows with above mentioned functionalities.
