var accountBalance = 0
var userChoice = 0 

fun userChoice1(){
  do {
    println("Please select the preferred option ")
    println("1. Deposit money ")
    println("2. Withdraw money ")
    println("Press any other key to Exit")
  
    var userChoice1 : Int = readln().toInt()
  
    println("The selected option is $userChoice1, ")
  
    when (userChoice1){
      1 -> deposit(userChoice)
      2 -> withdraw(userChoice)
      else -> break
    } 
    }
     while (userChoice1 !in 1..2 );  
    println("Thankyou for using the banking system.")

}

fun withdraw(userChoice : Int ){
  println("Enter the amount you want to withdraw, ")
  var amount = readln().toInt()

  while(userChoice == 1 && amount>accountBalance)
  {
    println("error balance not enough")
    println("Account balance is $accountBalance")
    userChoice1()
  }
  
  if (userChoice == 2){
  accountBalance += amount
  println("$amount withdrawn from the account")
  println("Account balance is $accountBalance")
  userChoice1()
  }else {
    accountBalance -= amount
    println("$amount withdrawn from the account")
    println("Account balance is $accountBalance")
    userChoice1()
  }
  

  }
  

fun deposit(userChoice : Int){
  println("Enter the amount you want to deposit, ")
  var amount = readln().toInt()

  while(userChoice == 2 && amount>accountBalance)
  {
    println("error amount is more than the credit balance of the account ")
    println("Credit balance of the account is $accountBalance")
    userChoice1()
  }
  if (userChoice==2 && amount<=accountBalance){
    accountBalance= accountBalance - amount
    println("$amount has been payed off")
    println("Credit balance of the account is $accountBalance")
    userChoice1()
  } else {
  accountBalance += amount
  println("$amount deposited to the account")
  println("Account balance is $accountBalance")
  userChoice1()
  } 
  

  
}




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
    1 -> "Debit account" //In debit account the balance is the amount you can take out (balance can't be negative)
    2 -> "Credit account" //In credit account the balance is the amount you have to pay (you can't pay more than the credit you owe)
    3 -> "Checking account" //This is a normal account , balance can go negative

    else -> "error invalid input"
  } 
  
  println("You have created a $accountType.")
  }
   while (userChoice !in 1..3 );

  accountBalance = (1..1000).random()

  println("Current account balance is $accountBalance")
  
  userChoice1()
  




}
  
  

  



