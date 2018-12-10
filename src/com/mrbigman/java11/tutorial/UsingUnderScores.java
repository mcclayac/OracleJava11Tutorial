package com.mrbigman.java11.tutorial;

public class UsingUnderScores {

//    The following example shows other ways you can use the underscore in numeric literals:

    long creditCardNumber = 1234_5678_9012_3456L;
    long socialSecurityNumber = 999_99_9999L;
    float pi =  3.14_15F;
    long hexBytes = 0xFF_EC_DE_5E;
    long hexWords = 0xCAFE_BABE;
    long maxLong = 0x7fff_ffff_ffff_ffffL;
    byte nybbles = 0b0010_0101;
    long bytes = 0b11010010_01101001_10010100_10010010;

    /*You can place underscores only between digits; you cannot place underscores in the following places:

    At the beginning or end of a number
    Adjacent to a decimal point in a floating point literal
    Prior to an F or L suffix
    In positions where a string of digits is expected*/


}
