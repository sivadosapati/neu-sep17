# Assignment 7

## Instructions

*  Max score is 10.
*  Deadline is 11:59PM, Nov 13, Monday.
*  Extra credits are added only if score is less than 10.
*  Try to attempt every question and keep practising from other online sites.
*  Upload all assignments to a single repository named ‘Assignments’.
*  Contact us if any assistance is needed.

## Questions

1. Write a program called **MaxValue.java** that finds the maximum value in an array of ints using 4 threads. Your main should be similar as the one in [SumThread example](http://www.cs.carleton.edu/faculty/dmusican/cs348/java_multi/SumThread.java), though you should construct your array of random numbers instead of increasing numbers. You may assume in your threaded code that the array has at least 4 elements.(score 2)

2. Write a program called **ReverseHello.java** that creates a thread (let's call it Thread 1). Thread 1 creates another thread (Thread 2); Thread 2 creates Thread 3; and so on, up to Thread 50. Each thread should print 
> Hello from Thread num!     

but you should structure your program such that the threads print their greetings in reverse order. (Score 2)

3. You are to implement a controller for a device which can be accessed with the following interface: 
```java
  class Device {
    public void startup() { ... } // print to console that device is starting
    public void shutdown() { ... } // print to console that device is shutting down and exit
  }
```  
There are also two sensors, one for *heat* and one for *pressure*, which can be used to monitor the device.  

```java
  class Sensor extends Thread {
      private final Device device;
      private double value;
      public Sensor(Device device) {
          this.device = device;
      }
      public double getValue() {
          return value;
      }
      public void updateValue() { 
          this.value += 0.001; // you check with other values here and see how it works
      }
      public void run() { ... }
}
```  

Write a class **Controller** (extends Thread) that can poll the sensors concurrently to running the device. You should implement its run() method such that it starts the device and then monitors it by waiting for and examining any new sensor values. The controller shuts down the device if the heat sensor exceeds the value 70 or the pressure sensor the value 100. Also complete the run() method in the class *Sensor* which calls updateValue() continuously and signals the controller if its value has changed. You can print the heat and pressure value to console in the run() method of *Controller* to check.

Here is the Root class that starts the application.(score 4)

```java
  class Root {
    public static void main(String[] args) {

        Device device = new Device();
        Sensor heat = new Sensor(device);
        Sensor pressure = new Sensor(device);

        Controller controller = new Controller(device,heat,pressure);

        controller.start();
        heat.start();
        pressure.start();
    }
}
```
Sample output  
> Device started  
> heat ->  0.00 , pressure -> 0.00  
> heat ->  0.80 , pressure -> 2.10  
> heat ->  15.50 , pressure -> 15.40  
> heat ->  30.30 , pressure -> 31.10  
> heat ->  66.40 , pressure -> 68.90  
> heat ->  68.70 , pressure -> 132.60  
> Device shutting down due to maintenance

4. Pascal’s triangle is a triangular array of the binomial coefficients. Write a function that takes an integer value n as input and prints first n lines of the Pascal’s triangle. Following are the first 6 rows of Pascal’s Triangle.(Score 2)   
> 1  
> 1 1  
> 1 2 1   
> 1 3 3 1   
> 1 4 6 4 1   
> 1 5 10 10 5 1  

Here is the prototype you can work with  
```java
  public void printPascalTriangle(int n){
        //your code
  }
```

**Extra Credit**  
5. Determine whether a given array can be partitioned into two subsets such that the sum of elements in both subsets is same.(score 2) 
Examples
> arr[] = {1, 5, 11, 5}  
> Output: true   
> The array can be partitioned as {1, 5, 5} and {11}  

> arr[] = {1, 5, 3}  
> Output: false   
> The array cannot be partitioned into equal sum sets.  
Here is the prototype you can work with  

```java
  public boolean findPartition (int arr[]) {
      //your code
  }
```
