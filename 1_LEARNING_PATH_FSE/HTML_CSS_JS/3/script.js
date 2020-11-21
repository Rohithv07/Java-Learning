var arrayForStoring = [];
function addFeedback(){
    // check if the feedback is not empty
    var feedback = document.getElementById("feedback").value;
    if (feedback !== "") {
        arrayForStoring.push(feedback);
        document.getElementById("result").innerHTML = "<h2>Feedback Details</h2><h3>Successfully Added Feedback Details!</h3>";
    }
}

function displayFeedback(){
    var displayResult = "<h2>Feedback Details</h2>";
    for (var i=0; i<arrayForStoring.length; i++) {
        displayResult += "Feedback " + (i+1) + "<br>";
        displayResult += arrayForStoring[i] + "<br>";
    }
    document.getElementById("result").innerHTML = displayResult;
    arrayForStoring = [];
}


