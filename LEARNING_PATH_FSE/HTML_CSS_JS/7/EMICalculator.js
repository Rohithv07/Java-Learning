function calculateEMI() {
    var principal = document.getElementById("principalAmount").value;
    var rate = document.getElementById("interestRate").value;
    var tenure = document.getElementById("tenure").value;
    var interest = (rate / 100) / 12;
    var EMI = principal * interest * (Math.pow(1+interest, tenure) / (Math.pow(1+interest, tenure)-1));
    var roundedEMI = EMI.toFixed(2);
    document.getElementById("result").innerHTML = "EMI is Rs." + roundedEMI;
    return false;
}