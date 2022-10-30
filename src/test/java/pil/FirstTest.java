package pil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static pil.First.*;

public class FirstTest {

    @Test
    public void twoSumFound(){
        int[] arr = {2,5,1};
        int target = 7;
        int[] result = twoSum(arr, target);
        int[] expected = {0, 1};
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }

    @Test
    public void twoSumNotFound(){
        int[] arr = {1,4,9,10};
        int target = 6;
        int[] result = twoSum(arr,target);
        int[] expected = {0,0};
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }

    //The function TwoSum returns the first values founded.
    @Test
    public void twoSumManyValues(){
        int[] arr = {1,3,10,9,13,20,3};
        int target = 23;
        int[] result = twoSum(arr,target);
        int[] expected = {1,5};
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }

    @Test
    public void twoSumSingleValue(){
        int[] arr = {5};
        int target = 5;
        int[] result = twoSum(arr,target);
        int[] expected = {0,0};
        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }
}