function validateInputs(object, type, nameType) {
    var regExName = /^[a-zA-Z]+$/;
    var regExCity = /^[a-zA-Z]+$/;
    var regExState = /^[a-zA-Z]+$/;
    var regExEmail = /^[A-Za-z0-9._%+-]+@northeastern.edu$/;
    var regExPhone = /\d{3}-?\d{3}-\d{4}$/;
    var regExZip = /\d{5}$/;
    var regExComment = /^[a-zA-Z0-9_.-]*$/;
    var regExAddress = /^[a-zA-Z0-9_.-]*$/;
    var regExLanguage = /^[a-zA-Z]+$/;

    var name = "errorMsg" + nameType;

    switch (type) {
        case 1:
            if(!object.value.trim().match(regExName)){
                object.style.border = "2px solid red";
                document.getElementById(name).style.display = "block";
                object.value = "";
            }
            else {
                object.style.border = "";
                document.getElementById(name).style.display = "none";
            }
            break;
        case 2:
                if(!object.value.trim().match(regExName)){
                    object.style.border = "2px solid red";
                    document.getElementById(name).style.display = "block";
                    object.value = "";
                }
                else {
                    object.style.border = "";
                    document.getElementById(name).style.display = "none";
                }
                break;
        case 3:
            if(!object.value.trim().match(regExEmail)){
                object.style.border = "2px solid red";
                document.getElementById(name).style.display = "block";
                object.value = "";
            }
            else {
                object.style.border = "";
                document.getElementById(name).style.display = "none";
            }
            break;
        case 4:
            if(!object.value.trim().match(regExPhone)){
                object.style.border = "2px solid red";
                document.getElementById(name).style.display = "block";
                object.value = "";
            }
            else {
                object.style.border = "";
                document.getElementById(name).style.display = "none";
            }
            break;
        case 5:
            if(object.value === null || object.value.trim() === ''){
                object.style.border = "2px solid red";
                document.getElementById(name).style.display = "block";
                object.value = "";
            }
            else {
                object.style.border = "";
                document.getElementById(name).style.display = "none";
            }
            break;
        case 6:
            if(!object.value.trim().match(regExCity)){
                object.style.border = "2px solid red";
                document.getElementById(name).style.display = "block";
                object.value = "";
            }
            else {
                object.style.border = "";
                document.getElementById(name).style.display = "none";
            }
            break;
        case 7:
            if(!object.value.trim().match(regExState)){
                object.style.border = "2px solid red";
                document.getElementById(name).style.display = "block";
                object.value = "";
            }
            else {
                object.style.border = "";
                document.getElementById(name).style.display = "none";
            }
            break;
        case 8:
            if(!object.value.trim().match(regExZip)){
                object.style.border = "2px solid red";
                document.getElementById(name).style.display = "block";
                object.value = "";
            }
            else {
                object.style.border = "";
                document.getElementById(name).style.display = "none";
            }
            break;
        case 9:
            if(object.value === null || object.value.trim() === ''){
                object.style.border = "2px solid red";
                document.getElementById(name).style.display = "block";
                object.value = "";
            }
            else {
                object.style.border = "";
                document.getElementById(name).style.display = "none";
            }
            break;
        case 10:
            if(!object.value.trim().match(regExLanguage)){
                object.style.border = "2px solid red";
                document.getElementById(name).style.display = "block";
                object.value = "";
            }
            else {
                object.style.border = "";
                document.getElementById(name).style.display = "none";
            }
            break;

    }
}

function hearCheckboxValidation(){
    var checkboxes = document.getElementsByName("reference");  
    var numberOfCheckedItems = 0;  
    for(var i = 0; i < checkboxes.length; i++)  
    {  
        if(checkboxes[i].checked)  
            numberOfCheckedItems++;  
    }  
    if(numberOfCheckedItems == 0)  
    {  
        var error = document.getElementById('errorMsgReference');
        error.style.border = "2px solid red";
        error.style.display = "block";
    }   
}
function radioValidation(){
    var radios = document.getElementsByName("title");  
    var numberOfRadios = 0;  
    for(var i = 0; i < radios.length; i++)  
    {  
        if(radios[i].checked)  
            numberOfRadios++;  
    }  
    if(numberOfRadios == 0)  
    {  
        var error = document.getElementById('errorMsgRadio');
        error.style.border = "2px solid red";
        error.style.display = "block";
    }   
}

function onlyOne() {
    var checkboxes = document.getElementsByName("reference");  
    var numberOfCheckedItems = 0;  
    for(var i = 0; i < checkboxes.length; i++)  
    {  
        if(checkboxes[i].checked)  
            numberOfCheckedItems++;  
    }  
    if(numberOfCheckedItems >= 1)  
    {  
        for(var j=0;j<checkboxes.length;j++)
        {
            checkboxes[j].required=false;
        }
        
    }  


}

function showCheckbox(){
    var country = document.getElementById('country');
    var langDiv = document.getElementById('langDiv');


    
    if(country.value=="UK")
    {
 
        langDiv.innerHTML = '<label for="language">Language*:</label><input name="language" type="checkbox" id="English" value="English" onclick="showTextBox(this)" required/>English<br><br><div id="sayEng" style="display:none">Type Something in English...: <input class="required" type="altText" name="text"  placeholder ="Type something..." onblur = validateInputs(this,10,"langSay") required/></div>';
    }

    if(country.value=="India")
    {
    
        langDiv.innerHTML = '<label for="language">Language*:</label><input name="language" type="checkbox" id="Hindi" value="Hindi" onclick="showTextBox(this)" required/>Hindi<br><br><div id="sayHin" style="display:none">Type Something in Hindi...: <input class="required" type="text" name="altText"  placeholder ="Type something..." onblur = validateInputs(this,10,"langSay") required/></div>';
    }

    if(country.value=="Russia")
    {
        langDiv.innerHTML = '<label for="language">Language*:</label><input name="language" type="checkbox" id="Russian" value="Russian" onclick="showTextBox(this)" required/>Russian<br><br><div id="sayRus" style="display:none">Type Something in Russian...: <input class="required" type="text" name="altText"  placeholder ="Type something..." onblur = validateInputs(this,10,"langSay") required/></div>';
    }

    if(country.value=="France")
    {
        langDiv.innerHTML = '<label for="language">Language*:</label><input name="language" type="checkbox" id="French" value="French" onclick="showTextBox(this)" required/>French<br><br><div id="sayFr" style="display:none">Type Something in French...: <input class="required" type="text" name="altText"  placeholder ="Type something..." onblur = validateInputs(this,10,"langSay") required/></div>';
    }

    if(country.value=="Spain")
    {
        langDiv.innerHTML = '<label for="language">Language*:</label><input name="language" type="checkbox" id="Spanish" value="Spanish" onclick="showTextBox(this)" required/>Spanish<br><br><div id="saySpa" style="display:none">Type Something in Spanish...: <input class="required" type="text" name="altText"  placeholder ="Type something..." onblur = validateInputs(this,10,"langSay") required/></div>';
    }

}

function showTextBox(obj){

    if(obj.value==="English" && obj.checked===true)
    {
        var divEng = document.getElementById('sayEng');
        divEng.style.display = "block"; 
    }
    else if(obj.value==="English" && obj.checked===false)
    {
        var divEngHide = document.getElementById('sayEng');
        divEngHide.style.display = "none"; 
    }
    else if(obj.value==="Hindi" && obj.checked===true)
    {
        var divEng = document.getElementById('sayHin');
        divEng.style.display = "block"; 
    }
    else if(obj.value==="Hindi" && obj.checked===false)
    {
        var divHinHide = document.getElementById('sayHin');
        divHinHide.style.display = "none"; 
    }


   else if(obj.value==="Russian" && obj.checked===true)
   {
    var divRus = document.getElementById('sayRus');
    divRus.style.display = "block";
   }
   else if(obj.value==="Russian" && obj.checked===false)
   {
       var divRusHide = document.getElementById('sayRus');
       divRusHide.style.display = "none"; 
   }

   else if(obj.value==="French" && obj.checked===true)
   {
    var divFr = document.getElementById('sayFr');
    divFr.style.display = "block"; 
   }
   else if(obj.value==="French" && obj.checked===false)
   {
       var divFrHide = document.getElementById('sayFr');
       divFrHide.style.display = "none"; 
   }

   else if(obj.value==="Spanish" && obj.checked===true)
   {
    var divSpa = document.getElementById('saySpa');
    divSpa.style.display = "block";
   }
   else if(obj.value==="Spanish" && obj.checked===false)
   {
       var divSpaHide = document.getElementById('saySpa');
       divSpaHide.style.display = "none"; 
   }
   
}

function onSubmit(){
    var table = document.getElementById('resultTable');
    var form = document.getElementById('form');
    for(var i=0;i<document.getElementsByName('title').length;i++)
    {
        if(document.getElementsByName('title')[i].checked){
            var text = document.getElementsByName('title')[i].value;
        }
    }

    var textRef = ""
    for(var j=0;j<document.getElementsByName('reference').length;j++)
    {
        if(document.getElementsByName('reference')[j].checked)
        {
            var textRef = textRef +  document.getElementsByName('reference')[j].value + '<span>, </span>'; 
        }
    }

    var languageText = ""
    for(var k=0;k<document.getElementsByName('language').length;k++)
    {
        if(document.getElementsByName('language')[k].checked)
        {
            var languageText = document.getElementsByName('language')[k].value;
        }
    }

    var msgTxt = ""
    for(var x=0;x<document.getElementsByName('altText').length;x++)
    {
        if(document.getElementsByName('altText')[x].value.trim()!='' || document.getElementsByName('altText')[x].value!=null)
        {
            var msgTxt = document.getElementsByName('altText')[x].value;
        }
    }


    table.style.display = "block";
    var row = table.insertRow(1);
    var cell1 = row.insertCell(0);
    cell1.innerHTML = text;
    
    
    var cell2 = row.insertCell(1);
    cell2.innerHTML = document.getElementById('firstName').value;
    var cell3 = row.insertCell(2);
    cell3.innerHTML = document.getElementById('lastName').value;
    var cell4 = row.insertCell(3);
    cell4.innerHTML = document.getElementById('emailId').value;
    var cell5 = row.insertCell(4);
    cell5.innerHTML = document.getElementById('phoneNumber').value;
    var cell6 = row.insertCell(5);
    cell6.innerHTML = document.getElementById('streetAddress1').value;
    var cell7 = row.insertCell(6);
    cell7.innerHTML = document.getElementById('streetAddress2').value;
    var cell8 = row.insertCell(7);
    cell8.innerHTML = document.getElementById('city').value;
    var cell9 = row.insertCell(8);
    cell9.innerHTML = document.getElementById('state').value;
    var cell10 = row.insertCell(9);
    cell10.innerHTML = document.getElementById('zipcode').value;
    var cell11 = row.insertCell(10);
    cell11.innerHTML = textRef;
    var cell12 = row.insertCell(11);
    cell12.innerHTML = document.getElementById('country').value;
    var cell13 = row.insertCell(12);
    cell13.innerHTML = languageText;
    var cell14 = row.insertCell(13);
    cell14.innerHTML = msgTxt;
    var cell15 = row.insertCell(14);
    cell15.innerHTML = document.getElementById('Comments').value;

    document.getElementById('form').reset();

}
