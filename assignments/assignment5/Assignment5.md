# Assignment 5 

## Instructions
* Max score is 10.
* Deadline is 11:59PM, Oct 14, Saturday.
* Extra credits are added only if score is less than 10.
* Try to attempt every question and keep practising from other online sites. 
* Upload all assignments to a single repository named ‘Assignments’.
* Contact us if any assistance is needed.  

## Question

You will be writing code in support of a __Dessert Shoppe__ which sells candy by pound, cookies by the dozen, ice cream, and sundaes (ice cream with a topping). Your software will be used for the checkout system.  

To do this, you will implement an inheritance hierarchy of classes derived from a DessertItem abstract superclass.

The __Candy__, __Cookie__, and __IceCream__ classes will be derived from the DessertItem class.
	
The __Sundae__ class will be derived from the __IceCream__ class.
	
You will also write a Checkout class which maintains a list (Vector) of DessertItem's.

### The DessertItem Class

The __DessertItem class__ is an abstract superclass from which specific types of DessertItems can be derived. It contains only one data member, a name. It also defines a number of methods. All of the __DessertItem class__ methods except the _getCost()_ method are defined in a generic way in the file Class-DessertItem, provided for you along with the other homework specific files in the directory. The _getCost()_ method is an abstract method that is not defined in the DessertItem class because the method of determining the costs varies based on the type of item. Tax amounts should be rounded to the nearest cent. For example, the calculating the tax on a food item with a cost of 199 cents with a tax rate of 2.0% should be 4 cents. The complete specifications for the __DessertItem class__ are provided in the file Class-DessertItem.  


### The DessertShoppe Class

The __DessertShoppe class__  contains constants such as the tax rate as well the name of the store, the maximum size of an item name and the width used to display the costs of the items on the receipt. Your code should use these constants wherever necessary! The __DessertShoppe class__ also contains the _cents2dollarsAndCentsmethod_ which takes an integer number of cents and returns it as a String formatted in dollars and cents. For example, 105 cents would be returned as "1.05".

### The Derived Classes 

All of the classes which are derived from the __DessertItem__ class must define a constructor. The __TestCheckout__ class determine the parameters for the various constructors. Each derived class should be implemented by creating a file with the correct name, eg., Candy.java.

###
The __Candy__ class should be derived from the __DessertItem__ class. A __Candy__ item has a _weight_ and a _price per pound_ which are used to determine its _cost_. For example, 2.30 lbs.of fudge @ .89 /lb. = 205 cents. The cost should be rounded to the nearest cent.  

The __Cookie__ class should be derived from the __DessertItem__ class. A __Cookie__ item has a _number_ and a _price per dozen_ which are used to determine its _cost_. For example, 4 cookies @ 399 cents /dz. = 133 cents. The cost should be rounded to the nearest cent.  

The __IceCream__ class should be derived from the __DessertItem__ class. An __IceCream__ item simply has a _cost_.  

The __Sundae__ class should be derived from the __IceCream__ class. The _cost_ of a Sundae is the _cost_ of the IceCream plus the _cost of the topping_.

### The Checkout Class

The __Checkout class__, provides methods to enter dessert items into the cash register, clear the cash register, get the number of items, get the total cost of the items (before tax), get the total tax for the items, and get a String representing a receipt for the dessert items. The __Checkout__ class must use a Vector to store the DessertItem's. The total tax should be rounded to the nearest cent. The complete specifications for the __Checkout__ class are provided in the file Class-Checkout.

### Testing

A simple testdriver, TestCheckout.java along with its expected output, are provided for you to test your class implementations. You can add additional tests to the driver to more thoroughly test your code. 

### TestCheckOut

```java
public class TestCheckOut {

    public static void main(String[] args) {

        Checkout checkout = new Checkout();

        checkout.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
        checkout.enterItem(new IceCream("Vanilla Ice Cream", 105));
        checkout.enterItem(new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50));
        checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));

        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
        System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
        System.out.println("\nCost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
        System.out.println(checkout);

        checkout.clear();

        checkout.enterItem(new IceCream("Strawberry Ice Cream", 145));
        checkout.enterItem(new Sundae("Vanilla Ice Cream", 105, "Caramel", 50));
        checkout.enterItem(new Candy("Gummy Worms", 1.33, 89));
        checkout.enterItem(new Cookie("Chocolate Chip Cookies", 4, 399));
        checkout.enterItem(new Candy("Salt Water Taffy", 1.5, 209));
        checkout.enterItem(new Candy("Candy Corn", 3.0, 109));

        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
        System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
        System.out.println("\nCost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
        System.out.println(checkout);
    }
}

```

### Output

```
Number of items: 4  

Total cost: 1331 

Total tax: 87

Cost + Tax: 1418

	
	M & M Dessert Shoppe 
	--------------------
    
2.25 lbs. @ 3.99 /lb.
Peanut Butter Fudge       	8.98 
Vanilla Ice Cream         	1.05 
Hot Fudge Sundae with
Choc. Chip Ice Cream 		1.95 
4 @ 3.99 /dz.
Oatmeal Raisin Cookies 		1.33

Tax 				 .87 
Total Cost 		       14.18


Number of items: 6 

Total cost: 1192 

Total tax: 77

Cost + Tax: 1269

	
	M & M Dessert Shoppe 
	--------------------

Strawberry Ice Cream 		1.45 
Caramel Sundae with
Vanilla Ice	Cream		1.55
1.33 lbs. @ .89 /lb.
Gummy Worms			1.18
4 @ 3.99 /dz.
Chocolate Chip Cookies 		1.33
1.50 lbs. @ 2.09 /lb. 
Salt Water Taffy 		3.14
3.00 lbs. @ 1.09 /lb.
Candy Corn			3.27

Tax				 .77
Total Cost		       12.69


```

## Extra Credit

Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.  (Score 2)
 
	
	For example, Given the following matrix: 
    {{1,2,3},
  	{4,5,6},
  	{7,8,9}}
    You should return {1,2,3,6,9,8,7,4,5}.
    
    public List<Integer> spiralOrder(int[][] matrix) {
             //write your code here
	}

 	
 
