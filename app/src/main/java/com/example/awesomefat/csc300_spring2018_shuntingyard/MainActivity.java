package com.example.awesomefat.csc300_spring2018_shuntingyard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.soap.Text;

// Assignment: Add an EditText to your app and have something like "123+4-2" entered in,
// then your program should parse that string and add the elements as OpNodes and NumNodes
// to a Queue and display the contents of the Queue to LogCat for testing purposes.

public class MainActivity extends AppCompatActivity
{
    private TextView shuntingYardInput;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.shuntingYardInput = (TextView)this.findViewById(R.id.shuntingYardInput);

        char[] shuntingYardInputArray = new char[shuntingYardInput.length()];
        //Fills the array with the characters
        for(int i = 0; i < shuntingYardInput.length(); i++)
        {
            shuntingYardInputArray[i] = shuntingYardInput.charAt(i);
        }

        this.scanThroughInput(shuntingYardInputArray);

        //"10+3-2" -> turn into a queue of NumNodes and OpNodes
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue('+');
        q.enqueue(3);
        System.out.println(q.dequeue() instanceof NumNode);
        System.out.println(q.dequeue() instanceof OpNode);
        System.out.println(q.dequeue() instanceof OpNode);
    }

    public void scanThroughInput(char[] ar)
    {
        String numbers = "1234567890";
        ar = onCreate().shuntingYardInputArray;

        for(int i = 0; i < shuntingYardInput.length(); i++)
        {
            for(int j = 0; j < numbers.length(); j++)
            {
                //this is for numnodes
                if(ar[i] == numbers.charAt(j))
                {
                    q.enqueue(ar[i]);
                }

                //this is for opnodes
                else
                {
                    q.enqueue(ar[i]);
                }
            }

        }
    }
}
