# Assignment 8

## Instructions
*  Max score is 10.
*  Deadline is 11:59PM, Nov 20, Monday.
*  Extra credits are added only if score is less than 10.
*  Try to attempt every question and keep practising from other online sites.
*  Upload all assignments to a single repository named ‘Assignments’.
*  Contact us if any assistance is needed.

## Questions

**Q1**. (Score 3)Write a program that asks a user for a file name and prints the number of characters, words, and lines in that file.Use the following class as your main class:  

```java

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileAnalyzer
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("Filename: ");
      Scanner in = new Scanner(System.in);
      String name = in.nextLine();
      FileCounter counter = new FileCounter();
      FileReader reader = new FileReader(name);
      Scanner fileIn = new Scanner(reader);
      counter.read(fileIn);
      fileIn.close();
      System.out.println("Characters: " + counter.getCharacterCount());
      System.out.println("Words: " + counter.getWordCount());
      System.out.println("Lines : " + counter.getLineCount());
   }
}

```  
Complete the following class in your solution:

```java
public class FileCounter{

   private int characterCount, wordCount, lineCount;
   
   public FileCounter(){
      . . .
   }

   /**
      Processes an input source and adds its character, word, and line
      counts to the respective variables.
      @param in the scanner to process
   */
   private void read(Scanner in) throws IOException {
    // your code
   }

```  

**Q2**.(Score 4) Since the lyrics of most pop music contains words that repeat a number of times, a simple way to compress a lyric file is to create a map that stores each word once along with the positions of each word in the file.  

For example, suppose the lyric consists of the lines:
```
What have I  
  1   2   3                         <-- word position in lyrics
What have I  
  4   5   6                         <-- word position in lyrics  
What have I done to deserve this  
  7   8   9  10  11   12     13     <-- word position in lyrics  
```  

We would form a map that maps each unique word to a list of word positions in the lyric. 
NOTE: The word position for a word at the end of a line is stored as a negative integer rather than a positive integer so you can recreate the lyrics later when you iterate through the words in the map.  

Sample map for the lyric above (order of words may vary):

```
Word       Word Position(s)
===========================
WHAT       1, 4, 7
HAVE       2, 5, 8
I          -3, -6, 9
DONE       10 
TO         11
DESERVE    12
THIS       -13
```

Create a java class **LyricAnalyzer** with the following methods.

This class will have a private variable to store the lyrics as mentioned above.

```java
private HashMap<String, ArrayList<Integer>> map;
```

* Write a readLyrics method with the following signature:
```java
public void read(File file)
```  
This method will read the lyrics from file and adds to the map.

* Write an add method with the following signature:  
```java
private void add(String lyricWord, int wordPosition)
```
This method will determine if the given lyric word is in the map. If the word is not in the map, then a mapping is added that maps that word to a list containing the position of the word in the lyric. If the word is already in the map, then its word position is added to the list of word positions for this word. Do not create a new mapping if the lyric word is already in the map. Use the one that is already there and just update its list. Remember to negate the word position if the word is at the end of a line in the lyrics.  

* Write a displayWords method with the following signature:  
```java
public void displayWords()
```
This method should display the words of the song along with the word positions of the word, one word per line, **in alphabetical order**. You should do this **without creating another map**. Instead, get a set of all the words stored in the map. Sort this set using one of the sort methods from the Java API. Then iterate over this sorted set and print out each word along with the word positions associated with each word. You may leave the negative integers in the word position list. (see sample output below) **Iterate through the array of words using the for loop**. 

```

DESERVE: 12
DONE: 10
HAVE: 2,5,8
I: -3,-6,9
THIS: -13
TO: 11
WHAT: 1,4,7

```

* Write a writeLyrics method with the following signature:  
```java
public void writeLyrics(File file)
```
This method will write the lyrics for the song (in uppercase) stored in the map to the file. Start with an empty array of strings whose size is the number of words in the lyric plus 1 (don't use cell 0). Initialize this array with empty strings (not null). Then, get a set of all of the words stored in the map. For each word, store the word in the array cells corresponding to its word position(s). If a word position is negative, add on an extra newline character to the word when you store the word in the array. Once you finish processing all words that are in the map, iterate through the array and write out each string, and you should see the lyrics appear, line by line in the passed file. **Iterate through the array of words using the for loop**.  

* Write a method with the following signature:
```java
public int count()
```
This method will return the total number of **unique** words in the lyric by analyzing the map.

*  Write a method with the following signature:

```java
public String mostFrequentWord()
```
This method will return the word that occurs most frequently in the lyric. Do this by getting a set of all the words in the map and then for each word, find the one that has the largest set of word positions. Do not create any additional data structures to solve this problem. If there is a tie for the most frequent word, print out the most frequent word that comes first alphabetically.    

Test with these test files given in the package

[test1](https://github.com/sivadosapati/neu-sep17/blob/master/assignments/Assignment_8/Question2_test1.txt)    
[test2](https://github.com/sivadosapati/neu-sep17/blob/master/assignments/Assignment_8/Question2_test2.txt)  
[test3](https://github.com/sivadosapati/neu-sep17/blob/master/assignments/Assignment_8/Question2_test3.txt)  
[test4](https://github.com/sivadosapati/neu-sep17/blob/master/assignments/Assignment_8/Question2_test2.txt)  

**Q3**.(Score 3) Write a java class **MyJson** in which you will have the following methods

* Write a method with the following signature

```java
private static ArrayList<Vehicle> readAndGetVehicles(File file)
```
this method should read from the file, create vehicle objects, add them to an arrayList and return the arrayList.  

* write a method with the following signature

```java
public static String getJsonString(ArrayList<Vehicle> vehicles)
```
this method should take the vehicle objects of the particular dealer (stated as webId in the input file) and convert its content to a json string and return it. you can try and display it in pretty format.  

* Write a method with the following signature

```java
public static void writeToFile(String inputToWrite, String filePath)
```
this method should write the input string to the file created in the path given.

sample output:

```
{
"gmps-camino" : [
{
"id" : "2903315183"
"category" : "NEW"
"year" : "2016"
"make" : "Chevrolet"
"model" : "4500 Gas"
"trim" : "2WD Reg Cab 150&quot;"
"type" : ""
"price" : "56001.0"
"photo" : "http://inventory-dmg.assets-cdk.com/chrome_jpgs/2016/24174x90.jpg"
},
{
"id" : "2774517143"
"category" : "NEW"
"year" : "2016"
"make" : "Chevrolet"
"model" : "Cruze"
"trim" : "Sedan L"
"type" : "CAR"
"price" : "17495.0"
"photo" : "http://inventory-dmg.assets-cdk.com/RTT/Chevrolet/2016/3077853/default/ext_GAZ_deg01x90.jpg"
},
.
. 
.
..
{
"id" : "2963103683"
"category" : "USED"
"year" : "2016"
"make" : "Toyota"
"model" : "Corolla"
"trim" : "4dr Sdn CVT Auto S (SE)"
"type" : "CAR"
"price" : "15995.0"
"photo" : "http://inventory-dmg.assets-cdk.com/2/2/1/14136058122x90.jpg"
}
]
}
```

* your main method should follow the following signature
```java
public static void main(String[] args) throws IOException{
    File file = new File("your file path");
    ArrayList<Vehicle> vehicles = readAndGetVehicles(file);
    String s = getJsonString(vehicles);
    writeToFile(s, file.getParent());
}
```  

Here is the Vehicle class, Category enum and [input text file](https://github.com/sivadosapati/neu-sep17/blob/master/assignments/Assignment_8/Question3_camino.txt)

```java
class Vehicle{

    String id;
    String webId;
    Category category;
    Year year;
    String make;
    String model;
    String trim;
    String type;
    double price;
    URL photo;

    Vehicle(String[] arr){
        this.id = arr[0];
        this.webId = arr[1];
        this.category = Category.getCategory(arr[2].toLowerCase());
        this.year = Year.parse(arr[3]);
        this.make = arr[4];
        this.model = arr[5];
        this.trim = arr[6];
        this.type = arr[7];
        this.price = Double.parseDouble(arr[8]);
        try {
            this.photo = new URL(arr[9]);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}

enum Category{
    NEW , USED, CERTIFIED;

    public static Category getCategory(String cat){
       switch (cat){
           case "used": return USED;
           case "new": return NEW;
           case "certified": return CERTIFIED;
           default: throw new IllegalArgumentException();
       }
    }

    @Override
    public String toString() {
        switch (this){
            case NEW: return "NEW";
            case USED: return "USED";
            case CERTIFIED: return "CERTIFIED";
            default: throw new IllegalArgumentException();
        }
    }
}

```

Extra Credit: (Score 2)

Create the original text file from the json text file you have created in question 3


