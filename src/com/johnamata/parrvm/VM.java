package com.johnamata.parrvm;

public class VM {
    int[] data; //data memory
    int[] code; //code memory
    int[] stack;

    //registers
    int ip; //instruction pointer
    int sp; //stack pointer
    int fp; //frame

    public VM(int[] code, int main, int datasize) {
        //when executing, we create VM that has code, and it starts with main, also memory to use
        this.code = code;
        this.ip = main;
        data = new int[datasize];
    }
}
