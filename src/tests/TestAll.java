package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import arrays.*;
import linkedlists.*;


@RunWith(Suite.class)
@SuiteClasses({ IsUniqueTest.class, 
        PalindromPermutationTest.class, 
        URLifyTest.class, 
        NodeTest.class })
public class TestAll {

}
