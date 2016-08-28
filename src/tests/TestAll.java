package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import arraysnstrings.*;
import linkedlists.*;
import stacksnqueues.*;

@RunWith(Suite.class)
@SuiteClasses({ IsUniqueTest.class, 
        PalindromPermutationTest.class, 
        URLifyTest.class, 
        NodeTest.class, StackTest.class })
public class TestAll {

}
