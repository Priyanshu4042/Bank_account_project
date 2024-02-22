var accountBalance = 0
var userChoice = 0 

fun withdraw(userChoice : Int ){
  println("Enter the amount you want to withdraw ")
  var amount = readln().toInt()

  while(userChoice == 1 && amount>accountBalance)
  {
    println("error balance not enough")
    println("Account balance is $accountBalance")
    println("please enter valid amount")
    amount = readln().toInt()
  }
    
  accountBalance -= amount
  println("$amount withdrawn from the account")
  println("Account balance is $accountBalance")

  }
  

/*fun deposit(var amount : Int){
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

  userChoice = readln().toInt()

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

  accountBalance = (1..1000).random()

  println("Current account balance is $accountBalance")
  
  do {
    println("Please select the preferred option ")
    println("1. Deposit money ")
    println("2. Withdraw money ")
    println("3. Exit")
    println("Please select the operation ")
  
    var userChoice1 : Int = readln().toInt()
  
    println("The selected option is $userChoice1, ")
  
    when (userChoice1){
      //1 -> deposit(accountType)
      2 -> withdraw(userChoice)
      
    } 
    }
     while (userChoice1 !in 1..2 );




}
  
  

  



