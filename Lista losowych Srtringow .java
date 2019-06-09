import java.util.*;
import java.lang.*;
import java.io.*;


class Word {
    private String word = "";
    private int n;

    public Word() {
        Random randomGenerator = new Random();
        int randomNamber = randomGenerator.nextInt(49);
        // System.out.println("randomNamber: " + randomNamber);

        for (int n = 0; n <= randomNamber; n++) {
            this.word += "a";
            this.n += 1;
        }
        // System.out.println(" n = " + n);
    }

    @Override
    public String toString() {
        return this.word;
    }

}

class MyClass {

    private ArrayList<Word> evenArrayList = new ArrayList<>();
    private ArrayList<Word> oddArrayList = new ArrayList<>();

    public void Spliter(Deque<Word> theList) {

        while (theList.size() > 0) {
            // System.out.println(theList.peek().toString() +" "+theList.peek().toString().length());
            if (theList.peek().toString().length() % 2 == 0) {
                oddArrayList.add(theList.poll());
            } else {
                evenArrayList.add(theList.poll());
            }
            ;
        }
    }
}


class Kodilla {

    public static void main(String[] args) {
        Deque<Word> ListOfWords = new ArrayDeque<>();
        for (int n = 0; n < 50; n++) {
            ListOfWords.offer(new Word());
        }

        // The second part of the task.
        MyClass myClass = new MyClass();
        myClass.Spliter(ListOfWords);
    }
}
