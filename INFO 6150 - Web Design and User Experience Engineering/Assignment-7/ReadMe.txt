Assignment - 7

Part A
Part A consists of calc_home.html home page which consists of a login form page containing email, username and password input. The form fields are validated by calc_input.js javascript file where jQuery is implemented that adds or removes classes 'valid'/'invalid' based on which regex pattern for the form inputs are matched and error prompts are displayed or hidden accordingly. The password in the form must be at least 7 characters with at least 1 special symbol or character and 1 number. The email address must have @northeastern.edu domain for the input to be valid.

Upon successful form validation and submission, the user is redirected to calculator page (calc_operation.html) page which consists of username displayed on top, two textfields for numeral input and 4 buttons for addition, subtraction, multiplication, division operations respectively. The result is then shown upon the click of the button in a separate textfield with the help of jQuery (calc_operation.js). A calculate arrow function executes a switch operation to check for operation to be implemented on user number input and then the result is displayed accordingly.

Validations are also implemented where only numbers are allowed in calculator's user input based on class 'valid'/'invalid' added or removed to the two input fields.


calc.css is the file used to style the login and calculator page.
Part B
Part- B consists of stopwatch.html document which contains a div class with 00:00:00 text which is the default value of stopwatch. Stopwatch.css file is used for styling the html document. 
stopwatch.js file consists of variables for the time-element to display stopwatch time, start button, stop button and reset button and event listeners have been added to the buttons based on 'click' function.

The JavaScript file consists of various functions such as timer() which when called, increments seconds. Sets Hours(hrs), Minutes(mins) and Seconds (secs variable) based on seconds incremented. Since the timer function is a promise, it is resolved.

Start() function is also a resolved promise that sets an interval to call and execute timer function after every 1 second interval as per which, the seconds variable inside timer() is incremented accordingly.

Stop() function is a resolved promise which clears the interval set by start function and sets the interval to null value.

reset() is a async function that consists of stop() promise that is awaited to be resolved after which the seconds is set to 0, and the time element of stopwatch is set to default 00:00:00.
