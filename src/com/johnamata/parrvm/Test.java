package com.johnamata.parrvm;
import static com.johnamata.parrvm.Bytecode.*;
public class Test {
    static int[] hello = { //for testing
            HALT
    };
    public static void main(String[] args) {
        VM vm = new VM(hello, 0, 0); //get a VM, pass code starting at address 0 with data elements of 0
        vm.cpu();
    }
}
