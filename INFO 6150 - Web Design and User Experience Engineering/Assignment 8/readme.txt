Assignment - 8

Assignment 8 consists of index.js javascript file that establishes connection to mongo database using mongoose and it also makes use of express server. routes.js in routes folder consist of validations for email and password. routes.js also consist of validateInput(req) function that takes in request and validates/throws error based on email and password input. Email must have @northeastern.edu domain while password must have at least one uppercase letter, one special character, one digit, one lowercase letter and should be of minimum 8 character length for the password to be valid.

API ENDPOINTS

• The Post method is used to create user using '/user/create' API endpoint is used to create a new user in JSON format. 
• Get method is used to fetch all user details from database using 'user/getAll' API endpoint, and '/user/getOne/id API endpoint is used to fetch a specific user based on id.
• Patch method is used to edit user details using '/user/edit/id' API endpoint, where id specifies the specific user's details to update and save.
• delete method is used to delete user details using '/user/delete/id' API endpoint where id specifies the particular user's details to be deleted from the database.

bcrypt is used for password security.
.env config file is used to set mongoldb database url 
