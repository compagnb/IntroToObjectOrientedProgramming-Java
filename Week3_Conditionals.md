# Conditional (Control Flow) Statements

![Conditionals](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/conditionals.png)

## If Statement
  * The **if** statement checks if something is **true** or **false**.
  * The result of the if will either run a piece of code, or will skip past it to the else code.
  * We can use **relational, logical & conditional operators** to compare values with in these conditions. 
  * Here is the syntax of a conditional statement using **if**:
  ```java
  if (condition1){
    statements that are to be executed if condition1 is satisfied
  }else{
    statements that are to be executed if condition1 is not satisfied
  } 
  ```
  
  ![If Example](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/if.jpg)
  
## Else If
  * There can be multiple conditions within an **if** statement, these use **else if** and use this syntax:
  ```java
  if (condition1){
    statements that are to be executed if condition1 is satisfied
  } else if(condition2){
    statements that are to be executed if condition2 is satisfied and condition1 is not satisfied
  } else if(condition3){
    statements that are to be executed if condition3 is satisfied and condition1 and condition2 are not satisfied
  }else {
    statements that are to be executed if none of the above conditions are true
  } 
  ```
  
  ![If Else Example](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/ifelseif.gif)
  * The conditions will be checked in the same order the are written in. 
  * There can be as many conditions as you would like to code. 
  * The computer will only reach the else statement if non of the other conditions listed are met. 
  
## Switch
  * Can sometimes be used as an alternative to **if**.
  * It evaluates the keyword after **switch** and the program only follows on if the cases.
  * The keyword **break** is used at the end of each case statement to make the code jump out of the switch, if you do not do this, the program will just continue to read through.
  * Here is a sample of its syntax:
  ```java
  switch (yourGrade){

   case 'A':
     System.out.println("Excellent Job!");
     break;
   case 'B':
     System.out.println("Good Job!");
     break;
   case 'C':
     System.out.println("Need to work more!");
     break;
   case 'D':
     System.out.println("Change your attitude!");
   break;
 }
 ```
 ![Switch Example](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/switch.gif)
 
 # Week 3: Guess The Number
Building a **command-line** (text only) program that will ask the user to guess a number between 1 and 100. When the user guesses, the program will tell the user if it is too high, low, or correct. 

![Guess The Number](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/guessnum.jpg)

## Making Our Checklist:
* Generate a random number between 1 and 100 (for the user to guess).
* Display message asking the user to guess a number (from 1 to 100).
* Accept the user’s guess as a variable we can use in our program.
* Compare the user’s guess to the computer’s number to see if the guess is too high, too low, or correct.
* Display a message "too high", "too low", or "correct".
* Prompt the user to guess another number until they match.
* Ask the user if they’d like to play again.


## Generating A Random Number
* Before we can generate a random number, first we need to create a variable to store the value in. 
* The number we want to generate will be a **whole number** between 1 and 100, this variable should be declared as an **int**.
* To generate a random number it requires the use of the **Math** class that is built into Java.
* Within the **Math** Class the method **Math.random()** generates a random decimal number between 0.0 and 1.0. 
* Because our game requires a random whole number to be generated, we need to convert this decimal into a number between 1 and 100. We can do this by multipling the decimal generated by 100.  
* By doing this the number will range from 0.0 to 99.9 Storing it as an int, the number after the decimal point will drop. To ensure the number is never 0 and reaches 100, we will add 1. 
* **(int)** is added before our random function to **cast** , or change, the decimal number as an integer. 
* This statement should read as the following:

![math.random()](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/mathRandom.png)

* Add a **println** to ensure your number generator is running correctly. This program should print out a different number each time it is run. 

![math.random() result](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/mathRandomResult.png)

* Here are some other useful methods of the **Math** class:

![Math Methods](https://raw.githubusercontent.com/compagnb/IntroToObjectOrientedProgramming-Java/master/imgs/mathMethods.jpg)

 
