package com.johnamata.parrvm;

public class VM {
    int[] data; //data memory
    int[] code; //code memory
    int[] stack;

    //registers
    int ip; //instruction pointer
    int sp; //stack pointer
    int fp; //frame

    public VM(int[] code, int main) {
        this.code = code;
        this.ip = main;
    }
}
