Assignment - 4

In this assignment, functionalities have been added to form skeleton structure using javascript.
A function validateInputs() has been implemented which takes 3 inputs object, type which is the name(number) of input and nametype which is the text name assigned to name based on which a switch case is used to assign regular expression on different inputs accordingly.

hearCheckboxValidation() is a validation function used for reference checkboxes(facebook, yelp,google) which prompts an error if submit button is clicked without selecting any checkboxes.

radioValidation() is a validation function used for prompting error box message if no radio button options for title(miss, mr,mrs) have been selected before clicking submit button.

OnlyOne() function is used to ensure that at least one checkbox is checked to ensure that no error message is prompted.

A select option with 5 country options have been added as well which when selected, dynamically generates a checkbox for language selection.

showCheckbox() function is added to onChange property of select tag that dynamically displays checkbox if a select option consisting of 5 items(countries) is selected. The select checkboxes mention a language based on country option selected.

showTextBox(obj) is a function that dynamically generates a text box for user to enter message when a language checkbox is selected. It is hidden when checkbox is unselected.

onSubmit() is an onclick property function attributed to submit button which when selected will display a table consisting of form data and it resets form data from all of its fields.

Error messages are added next to each input as a div with display:none;

