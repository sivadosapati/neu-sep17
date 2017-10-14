# Assignment 6

## Instructions

*  Max score is 10.
*  Deadline is 11:59PM, Oct 21, Saturday.
*  Extra credits are added only if score is less than 10.
*  Try to attempt every question and keep practising from other online sites.
*  Upload all assignments to a single repository named ‘Assignments’.
*  Contact us if any assistance is needed.

## Questions

1. When a program fails due to an uncaught exception, the system automatically prints out the exception’s stack trace. If the failure is not easily reproducible, it may be difficult or impossible to get any more information. Therefore, it is critically
important that the exception’s toString() method return, as much information as possible concerning the cause of the failure. In other words, the detail message of an exception should capture the failure for subsequent analysis. To capture the failure,
the detail message of an exception should contain the values of all parameters and fields that “contributed to the exception.”
(Score 2).
 - -   Create your own **MyIndexOutOfBoundException** Class. It should contain these parameters  
      * **lowerBound** - the lowest legal index value.  
      * **upperBound** - the highest legal index value.  
      * **index** - the current index value.  
    
   Test your code in main method, by creating an indexOutOfBoundException.
   Output error message should be like this:   
    
   ``` java
    “Error Message: Index: 10, but Lower bound: 0, Upper bound: 9”   
   ```
   
2. Modify the following parse() method so that it will compile: (Score 1)  
 
    ``` java
      public static void parse(File file) {
          RandomAccessFile input = null;
          String line = null;
          
          try {
              input = new RandomAccessFile(file, &quot;r&quot;);
              while ((line = input.readLine()) != null) {
                  System.out.println(line);
              }
              return;
          } finally {
                if (input != null) {
                  input.close();
                }
            }
      }  
      ```  
      
3. Design an **Automated Teller Machine** (ATM). Write the test cases to each function of the machine in AtmTest class. (Score 7).  
  - -  Create an **User** class with attributes *name*, *age*, *address*, *phoneNumber* and *bankAccountNumber*.
  - -  Create a **Atm** class with attributes *availableAmountInMachine*, *transactionFee* and *userData*.  
    *  *userData* should store **USER**, **PASSWORD**, and other account details internally in a dataStructure of your choice. 
    *  The constructor should initialize all the attributes.
  - -  The machine should be able to perform these actions.  
    *  Ask for **NEW USER** or **CURRENT USER** as the start.
    *  Create a **NEW USER** with a unique *bankAccountNumber* and *password*.
    *  **CURRENT USER** should be able to login using phoneNumber and password.
    *  **CURRENT USER** should be able to use *FORGOT PASSWORD*.
    *  *PASSWORD* can be resetted by validating the *name*, *age* and *phoneNumber* of the user.  
    *   After loggin the user should be able to use **availableBalance**, **withDrawal**, **deposit**, **recentTransactions**, **changePassword** and **exit**.  
    *    _recentTransaction_ should display the last 10 trasactions, in a format of *transactionName* - *amount*. (*transactionName* is *withDrawal* or *deposit*).  
    *  Add a *transactionFee* for every transaction done and update the *availableAmountInMachine*.
    *  Machine should not allow user to withdrawal more amount than his *availableBalance*.
    *  You can add additional fucntions to make it pretty. UI is not required.
    
    **EXTRA CREDIT**  
    Implement the above "ATM" by storing the above data in a file, rather than in a dataStructure.   (Score 2)
