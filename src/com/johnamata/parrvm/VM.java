package com.johnamata.parrvm;

public class VM {
    int[] data; //data memory
    int[] code; //code memory
    int[] stack;

    //registers
    int ip; //instruction pointer
    int sp = -1; //stack pointer, start at -1 so on increment we start at 0
    int fp; //frame

    public VM(int[] code, int main, int datasize) {
        //when executing, we create VM that has code, and it starts with main, also memory to use
        this.code = code;
        this.ip = main;
        data = new int[datasize];
        stack = new int[100];
    }

    public void cpu(){
        //function to execute it
        int opcode = code[ip]; //fetch
    }
}
