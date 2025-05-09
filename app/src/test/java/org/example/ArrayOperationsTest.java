
package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ArrayOperationsTest {
    @Test
    public void testMaximumUsingForLoop() {
        int[] nums = {5, 3, 8, 1, 7};
        assertEquals(8, ArrayOperations.maximumUsingForLoop(nums));
        
        int[] negativeNums = {-5, -3, -8, -1, -7};
        assertEquals(-1, ArrayOperations.maximumUsingForLoop(negativeNums));
        
        int[] singleElement = {42};
        assertEquals(42, ArrayOperations.maximumUsingForLoop(singleElement));
        
        int[] emptyArray = {};
        assertEquals(Integer.MIN_VALUE, ArrayOperations.maximumUsingForLoop(emptyArray));
        
        assertEquals(Integer.MIN_VALUE, ArrayOperations.maximumUsingForLoop(null));
    }
    
    @Test
    public void testMaximumUsingStream() {
        int[] nums = {5, 3, 8, 1, 7};
        assertEquals(8, ArrayOperations.maximumUsingStream(nums));
        
        int[] negativeNums = {-5, -3, -8, -1, -7};
        assertEquals(-1, ArrayOperations.maximumUsingStream(negativeNums));
        
        int[] singleElement = {42};
        assertEquals(42, ArrayOperations.maximumUsingStream(singleElement));
        
        int[] emptyArray = {};
        assertEquals(Integer.MIN_VALUE, ArrayOperations.maximumUsingStream(emptyArray));
        
        assertEquals(Integer.MIN_VALUE, ArrayOperations.maximumUsingStream(null));
    }
    
    @Test
    public void testMinimumUsingForLoop() {
        int[] nums = {5, 3, 8, 1, 7};
        assertEquals(1, ArrayOperations.minimumUsingForLoop(nums));
        
        int[] negativeNums = {-5, -3, -8, -1, -7};
        assertEquals(-8, ArrayOperations.minimumUsingForLoop(negativeNums));
        
        int[] singleElement = {42};
        assertEquals(42, ArrayOperations.minimumUsingForLoop(singleElement));
        
        int[] emptyArray = {};
        assertEquals(Integer.MAX_VALUE, ArrayOperations.minimumUsingForLoop(emptyArray));
        
        assertEquals(Integer.MAX_VALUE, ArrayOperations.minimumUsingForLoop(null));
    }
    
    @Test
    public void testMinimumUsingStream() {
        int[] nums = {5, 3, 8, 1, 7};
        assertEquals(1, ArrayOperations.minimumUsingStream(nums));
        
        int[] negativeNums = {-5, -3, -8, -1, -7};
        assertEquals(-8, ArrayOperations.minimumUsingStream(negativeNums));
        
        int[] singleElement = {42};
        assertEquals(42, ArrayOperations.minimumUsingStream(singleElement));
        
        int[] emptyArray = {};
        assertEquals(Integer.MAX_VALUE, ArrayOperations.minimumUsingStream(emptyArray));
        
        assertEquals(Integer.MAX_VALUE, ArrayOperations.minimumUsingStream(null));
    }
    
    @Test
    public void testSumUsingForLoop() {
        int[] nums = {5, 3, 8, 1, 7};
        assertEquals(24, ArrayOperations.sumUsingForLoop(nums));
        
        int[] negativeNums = {-5, -3, -8, -1, -7};
        assertEquals(-24, ArrayOperations.sumUsingForLoop(negativeNums));
        
        int[] singleElement = {42};
        assertEquals(42, ArrayOperations.sumUsingForLoop(singleElement));
        
        int[] emptyArray = {};
        assertEquals(0, ArrayOperations.sumUsingForLoop(emptyArray));
        
        assertEquals(0, ArrayOperations.sumUsingForLoop(null));
    }
    
    @Test
    public void testSumUsingStream() {
        int[] nums = {5, 3, 8, 1, 7};
        assertEquals(24, ArrayOperations.sumUsingStream(nums));
        
        int[] negativeNums = {-5, -3, -8, -1, -7};
        assertEquals(-24, ArrayOperations.sumUsingStream(negativeNums));
        
        int[] singleElement = {42};
        assertEquals(42, ArrayOperations.sumUsingStream(singleElement));
        
        int[] emptyArray = {};
        assertEquals(0, ArrayOperations.sumUsingStream(emptyArray));
        
        assertEquals(0, ArrayOperations.sumUsingStream(null));
    }
    
    @Test
    public void testAverageUsingForLoop() {
        int[] nums = {5, 3, 8, 1, 7};
        assertEquals(4.8, ArrayOperations.averageUsingForLoop(nums), 0.001);
        
        int[] negativeNums = {-5, -3, -8, -1, -7};
        assertEquals(-4.8, ArrayOperations.averageUsingForLoop(negativeNums), 0.001);
        
        int[] singleElement = {42};
        assertEquals(42.0, ArrayOperations.averageUsingForLoop(singleElement), 0.001);
        
        int[] emptyArray = {};
        assertEquals(0.0, ArrayOperations.averageUsingForLoop(emptyArray), 0.001);
        
        assertEquals(0.0, ArrayOperations.averageUsingForLoop(null), 0.001);
    }
    
    @Test
    public void testAverageUsingStream() {
        int[] nums = {5, 3, 8, 1, 7};
        assertEquals(4.8, ArrayOperations.averageUsingStream(nums), 0.001);
        
        int[] negativeNums = {-5, -3, -8, -1, -7};
        assertEquals(-4.8, ArrayOperations.averageUsingStream(negativeNums), 0.001);
        
        int[] singleElement = {42};
        assertEquals(42.0, ArrayOperations.averageUsingStream(singleElement), 0.001);
        
        int[] emptyArray = {};
        assertEquals(0.0, ArrayOperations.averageUsingStream(emptyArray), 0.001);
        
        assertEquals(0.0, ArrayOperations.averageUsingStream(null), 0.001);
    }
   
   
    }

