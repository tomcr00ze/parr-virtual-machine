package com.johnamata.parrvm;

/**
 * define bytecode for machine to implement it
 */
public class Bytecode {
    //bytecode instructions
    public static final short IADD = 1;     // int add
    public static final short ISUB = 2;
    public static final short IMUL = 3;
    public static final short ILT  = 4;     // int less than
    public static final short IEQ  = 5;     // int equal
    public static final short BR   = 6;     // branch
    public static final short BRT  = 7;     // branch if true
    public static final short BRF  = 8;     // branch if true
    public static final short ICONST = 9;   // push constant integer
    public static final short LOAD   = 10;  // load from local context
    public static final short GLOAD  = 11;  // load from global memory
    public static final short STORE  = 12;  // store in local context
    public static final short GSTORE = 13;  // store in global memory
    public static final short PRINT  = 14;  // print stack top
    public static final short POP  = 15;    // throw away top of stack
    public static final short HALT = 16;
}
