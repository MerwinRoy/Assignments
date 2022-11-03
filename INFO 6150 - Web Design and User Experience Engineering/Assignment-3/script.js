//Title constructor function that creates a Title object
function Title(t1) 
{ this.mytitle = t1;
}

Title.prototype.getName = function () 
{ 
return (this.mytitle);
}

var socialMedia = {
  facebook : 'http://facebook.com',
  twitter: 'http://twitter.com',
  flickr: 'http://flickr.com',
  youtube: 'http://youtube.com'
};

var t = new Title("CONNECT WITH ME!");

var btn = document.getElementById("button");
btn.disabled = true;
btn.style.backgroundColor = "GRAY";
btn.style.border = "GRAY";

var checked=0;

function check(checkbox)
{
    if(checkbox.checked == true)
    {
      btn.disabled = false;
      checkbox.parentElement.parentElement.bgColor = "Orange";
      btn.style.backgroundColor = "Orange";
      btn.style.border = "Orange";
      checked=checked+1;
    }
    else{
      checkbox.parentElement.parentElement.bgColor = "WHITE";
      btn.disabled = false;
      btn.style.backgroundColor = "GRAY";
      btn.style.border = "GRAY";
      checked=checked-1;
    }
    if (
      document.querySelectorAll('input[type=checkbox]').checked=false
    ) {
      document.getElementById("button").disabled = true;
      btn.style.backgroundColor = "GRAY";
      btn.style.border = "GRAY";
    }
  if(checked>1)
  {
    btn.disabled = false;
    checkbox.parentElement.parentElement.bgColor = "Yellow";
    btn.style.backgroundColor = "Orange";
    btn.style.border = "Orange"; 
  }
}


function hide(row) {
  if (document.getElementById(row).style.display == "") {
    document.getElementById(row).style.display = "none";
  } else {
    document.getElementById(row).style.display = "";
  }
}

function DeleteRowFunction() {
  // event.target will be the input element.
  var td = event.target.parentNode; 
  var tr = td.parentNode; // the row to be removed
  tr.parentNode.removeChild(tr);
  document.getElementsByClassName('dropDownTextArea').style.display="none";
}

function removeDetails(row){
  if(document.getElementById(row).style.display == ""){
    document.getElementById(row).style.display = "none";
  }
}

function editPrompt(){
  alert('Edit details');
}

var counter = 3;

function newEntry(){
  var tr = document.getElementById('myTable').getElementsByTagName('tr');
  var rowCount = tr.length;
  var table = document.getElementById('myTable');
  var rowInsert  = table.insertRow(rowCount);
  var rowInsert2 = table.insertRow(rowCount+1);
  var newId = "row"+(rowCount-counter);
  var newIdString ="'"+newId+"'";
  rowInsert2.id = newId;
  rowInsert2.className = "dropDownTextArea"
  rowInsert2.setAttribute('style','display:none');
  var cell1 = rowInsert.insertCell(0);
  cell1.innerHTML = '<input type="checkbox" onchange="check(this)" /><br /><br /><a href="#" onclick="hide('+newIdString+');"><img src="down.png" width="25px"/></a>'
  var cell2 = rowInsert.insertCell(1);
  cell2.innerHTML = 'Student '+(rowCount-counter);
  var cell3 = rowInsert.insertCell(2);
  cell3.innerHTML = 'Teacher '+(rowCount-counter);
  var cell4 = rowInsert.insertCell(3);
  cell4.innerHTML = 'Approved';
  var cell5 = rowInsert.insertCell(4);
  cell5.innerHTML = 'Fall';
  var cell6 = rowInsert.insertCell(5);
  cell6.innerHTML = 'TA';
  var cell7 = rowInsert.insertCell(6);
  cell7.innerHTML = '98765';
  var cell8 = rowInsert.insertCell(7);
  cell8.innerHTML = '100%';
  var cell9 = rowInsert.insertCell(8);
  cell9.innerHTML = '<input type="button" value="Edit" onclick="editPrompt()" />';
  var cell10 = rowInsert.insertCell(9);
  cell10.innerHTML = ' <input type="button" value="Delete" onclick="DeleteRowFunction()" />';
  var cell11 = rowInsert2.insertCell(0);
  cell11.colspan = 10;
  cell11.innerHTML = 'Advisor:<br /><br />Award Details<br />Summer 1-2014(TA)<br />Budget Number: <br />Tuition Number: <br />Comments:<br /><br /><br />Award Status:<br /><br /><br />';
  alert("New User Added Successfully!");
  counter=counter+1;
  
}


