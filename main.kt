/* var accountBalance = 0


fun withdraw(var amount : Int, var accountType : String){
  if (accountType == "Debit account" && amount>accountBalance){
    println("error balance not enough")
    println("Account balance is $accountBalance")
  }

  accountBalance -= amount
  println("$amount withdrawn from the account")
  println("Account balance is $accountBalance")
}

fun deposit(var amount : Int){
  accountBalance += amount
  println("$amount deposited to the account")
  println("Account balance is $accountBalance")
}
*/



fun main(){

  println("Welcome to your banking system. ")
  println("What type of account you would like to create ? ")
  println("1. Debit account")
  println("2. Credit account") 
  println("3. Checking account")
  
  
  do {
    println("Choose an option 1, 2 or 3.")

  var userChoice : Int = readln().toInt()

  println("The selected option is $userChoice, ")

  var accountType = when (userChoice){
    1 -> "Debit account"
    2 -> "Credit account"
    3 -> "Checking account"

    else -> "error invalid input"
  } 
  
  println("You have created a $accountType.")
  }
   while (userChoice !in 1..3 );


}
  
  

  



