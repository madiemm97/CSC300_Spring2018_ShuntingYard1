package com.example.awesomefat.csc300_spring2018_shuntingyard;

/**
 * Created by awesomefat on 2/22/18.
 */

//Number Node holds the numbers between operations

public class NumNode extends Node
{
    private int payload;

    public NumNode(int payload)
    {
        super();
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }
}
