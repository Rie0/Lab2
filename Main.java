import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //EX1
//        int longestLength = 0;
//        String[] dictionary = {"cat", "dog", "red", "is", "am" };
//        for (String word:dictionary){ //for loop to get the longest length
//            if (word.length()>longestLength){
//                longestLength=word.length();
//            }
//        }
//        for (String word:dictionary){ //for loop to print strings with a length equal to the longest length
//            if (word.length()==longestLength){
//                System.out.println(word);
//            }
//        }

        //EX2
//        int[] numbers = {1,1,1,3,3,5};
//        int counter=0;
//        System.out.println("Enter a number to check how many times it occurred in the array.");
//        int userNum=sc.nextInt();
//        for(int number:numbers){
//            if (number==userNum){
//                counter++;
//            }
//        }
//            if (counter>1) {
//                System.out.println(userNum + " occurs " + counter + " times");
//            }else { System.out.println(userNum + " occurs " + counter + " time");}

        //EX3
//        int[] numbers = {1, 41, 17, 7, 25, 3, 100};
//        int largest=0;
//        int secLargest=0;
//        int thdLargest=0;
//        for (int number:numbers){
//            if(number>largest){
//                largest=number;
//            }
//        }
//        for (int number:numbers){
//            if(number==largest){
//                continue;
//            }
//            if (number>secLargest) {
//                secLargest=number;
//            }
//        }
//        for (int number:numbers){
//            if(number==largest||number==secLargest){
//                continue;
//            }
//            if (number>thdLargest) {
//                thdLargest=number;
//            }
//        }
//        System.out.println("3 largest elements of the said array are:"+
//                largest+" "+secLargest+" "+thdLargest);

        //EX4 (Has a Method)
//        ArrayList<Integer> numbers=new ArrayList<>();
//        numbers.add(5);
//        numbers.add(4);
//        numbers.add(3);
//        numbers.add(2);
//        numbers.add(1);
//        System.out.println("Original"+numbers);
//        System.out.println("Reversed"+reverseArray(numbers));

        //EX5 - used a string arraylist.
//        ArrayList<String> userArray=new ArrayList<>(); //use array instead? use isInitialized to limit the use of command 1 to once.
//        System.out.println();
//
//        System.out.println(
//                "1. Add elements to the array \n" +
//                        "2. Display elements of the array \n" +
//                        "3. Search for an element within the array \n" +
//                        "4. Sort the array (Alphabetically) \n" +
//                        "5. Stop\n"+
//                        "Enter the number of the command");//start
//        int command=sc.nextInt();
//        do{
//            if (command==1){ //Accept elements of an array (the size of the array should be entered by the user)
//                System.out.println("Enter the number of elements to add to the array:");
//                int size=sc.nextInt();
//                for (int i = 0; i < size; i++) {
//                    System.out.println("Enter element number "+(i+1)+":");
//                    String element=sc.next();
//                    userArray.add(element);
//                }
//                System.out.println("Done!");
//            }
//
//            if(command==2){ //Display elements of an array
//                if(userArray.isEmpty()){
//                    System.out.println("Your array is empty.");
//                }else {
//                    System.out.println("The elements inside your array:\n" + userArray);
//                }
//            }
//            if(command==3){//Search the element within array
//                System.out.println("Enter the element you are looking for:");
//                String searchedElm=sc.next();
//                for (String element:userArray){
//                    if (element.contains(searchedElm)){
//                        System.out.println(element+" found at index number "+userArray.indexOf(element));
//                    }
//                }
//                System.out.println("Search ended.");
//            }
//            if (command==4) { //Sort the array() (alphabetically)
//                Collections.sort(userArray);
//                System.out.println("Sorting array alphabetically:");
//                System.out.println(userArray);
//            }
//
//            System.out.println("Enter the number of the command");
//            command=sc.nextInt();
//            while (command>=6||command<=0){
//                System.out.println("Command invalid. Try again.");
//                command=sc.nextInt();
//            }
//        }while (command!=5);


        //EX6 (Has a Method)
//        System.out.println("Enter the number of random numbers to generate:");
//        int arrayLength= sc.nextInt();
//        System.out.println("Enter the maximum value of the range:");
//        int maxNum= sc.nextInt();
//        System.out.println("Enter the minimum value of the range:");
//        int minNum= sc.nextInt();
//        int[] numArray=generateNumbers(minNum,maxNum,arrayLength);
//        System.out.println("Random numbers within the specified range:");
//        for (int i = 0; i < numArray.length; i++) {
//            System.out.print(numArray[i]+" ");
  //      }

        //EX7 (Has 3 Methods)
//        System.out.println("Enter your password:");
//        String password =sc.nextLine();
//        int lengthScore=checkLength(password);
//        int characterScore=checkSpecialCharacters(password);
//        int casesScore=checkUpperCaseLowerCase(password);
//        int finalPasswordScore= casesScore+characterScore+lengthScore;
//
//        if (finalPasswordScore>=8){
//            System.out.println("Password is strong.");
//        } else if (finalPasswordScore>=5) {
//            System.out.println("Password is moderately strong.");
//        }else {
//            System.out.println("Password is weak.");
//        }


        //EX8 (Has a Method)
//        System.out.println("Enter the number of Fibonacci terms to generate:");
//        int count = sc.nextInt();
//        fibonacci(count);


    }


    //EX4
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> numbers) {
        int leftPointer = 0;
        int rightPointer = numbers.size() - 1;
        while (leftPointer < rightPointer) {
            int temp = numbers.get(leftPointer);
            numbers.set(leftPointer, numbers.get(rightPointer));
            numbers.set(rightPointer,temp);
            leftPointer++;
            rightPointer--;
        }
        return numbers;
    }

    //EX6

    public static int[] generateNumbers(int minValue, int maxValue, int arrayLength) {
        Random rand = new Random();
        int[] numbers;
        numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = rand.nextInt(minValue, maxValue + 1);
        }
        return numbers;
    }

    //EX7
    public static int checkLength(String password) {
        int score = 0;
        if (password.length() >= 8) {
            score = 3;
        } else if (password.length() >= 6) {
            score = 2;
        }
        return score;
    }

    public static int checkSpecialCharacters(String password) {
        int score = 0;
        char[] passChars = password.toCharArray();
        for (char c : passChars) { //turn the password to an array of chars to check the validation of each.
            if (!Character.isLetterOrDigit(c)) {
                score = 2;
            }
        }
        return score;
    }

    public static int checkUpperCaseLowerCase(String password) {
        int score = 0;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        char[] passChars = password.toCharArray();
        for (char c : passChars) { //turn the password to an array of chars to check the validation of each.
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (hasLowerCase && hasUpperCase) {
                score = 3;
            }
        }
        return score;
    }

    //EX8
    public static void fibonacci(int count) {
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < count / 2; i++) {
            System.out.println(num1);
            System.out.println(num2);
            num1 += num2;
            num2 += num1;
        }
    }

}