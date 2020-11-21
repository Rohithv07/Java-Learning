var p;
var r;
var R;
var n; 
var reducedEMI;
var reducedPayment;
var reducedInterest;
var fixedEMI;
var fixedPayment;
var fixedInteres;

function EstimateReducingInterestLoan()
{
    p = document.getElementById("principalAmount").value;
    r = document.getElementById("interestRate").value;
    n = document.getElementById("tenure").value;
    R = (r / 100) / 12;
	  calculateEMI();
      totalPayment();
      totalInterest();
      EstimateFixedInterestLoan();
}

function EstimateFixedInterestLoan()
{
    fixedInterest = p * (r / 100) * (n / 12);
    document.getElementById("tInterestFixed").innerHTML = fixedInterest.toFixed(2); /*Assign total Interest value here*/
    
    fixedPayment = parseFloat(p) + parseFloat(fixedInterest);
    document.getElementById("tPaymentFixed").innerHTML = fixedPayment.toFixed(2); /*Assign total payment value here*/
    
     /* Fill with required javascript code here  */
     fixedEMI = fixedPayment / ((n / 12) * 12);
    document.getElementById("EMIFixed").innerHTML = fixedEMI.toFixed(2); /*Assign emi  value here*/
    
    
}

function calculateEMI(){
    reducedEMI = p * R * ((Math.pow(1 + R, n)) / (Math.pow(1 + R, n) - 1));
    document.getElementById("EMI").innerHTML = reducedEMI.toFixed(2);
}

function totalPayment(){
	
	reducedPayment = reducedEMI * n;
	
    document.getElementById("tPayment").innerHTML = reducedPayment.toFixed(2); /*Assign total payment value here*/
}

function totalInterest(){
	var reducedInterest = reducedPayment - p;
    document.getElementById("tInterest").innerHTML = reducedInterest.toFixed(2); /*Assign total Interest value here*/
}


