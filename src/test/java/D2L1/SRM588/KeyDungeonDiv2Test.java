package D2L1.SRM588;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KeyDungeonDiv2Test {

    private KeyDungeonDiv2 kd;
    
    @Before
    public void setUp() throws Exception{
        kd = new KeyDungeonDiv2();
    }
    
    @Test
    public void countDoorsは例0の時3を返す() {
        int[] doorR = {2, 0, 5, 3};
        int[] doorG = {1, 4, 0, 2};
        int[] keys = {2, 3, 1};
        
        assertThat(kd.countDoors(doorR, doorG, keys), is(3));
    }
    @Test
    public void countDoorsは例1の時1を返す() {
        int[] doorR = {0, 1, 2, 0};
        int[] doorG = {0, 2, 3, 1};
        int[] keys = {0, 0, 0};
        
        assertThat(kd.countDoors(doorR, doorG, keys), is(1));
    }
    @Test
    public void countDoorsは例2の時5を返す() {
        int[] doorR = {3, 5, 4, 2, 8};
        int[] doorG = {4, 2, 3, 8, 1};
        int[] keys = {0, 0, 10};
        
        assertThat(kd.countDoors(doorR, doorG, keys), is(5));
    }
    @Test
    public void countDoorsは例3の時0を返す() {
        int[] doorR = {4, 5, 4, 6, 8}; 
        int[] doorG = {2, 1, 2, 3, 5};
        int[] keys = {1, 2, 1};
        
        assertThat(kd.countDoors(doorR, doorG, keys), is(0));
    }
    @Test
    public void countDoorsは例4の時17を返す() {
        int[] doorR = {41,44,41,57,58,74,84,100,58,2,43,32,82,97,44,13,35,98,96,81,43,77,18,51,27,
                27,39,39,45,82,59,20,28,93,6,39,64,78,28,85,17,56,3,68,4,0,36,80,41,77};
        int[] doorG = {67,15,53,36,88,29,26,57,68,99,97,27,51,70,3,49,65,75,35,92,66,0,23,96,38,86,
                98,31,26,75,30,2,92,78,100,99,38,26,85,74,77,15,16,48,100,88,55,93,99,54};
        int[] keys = {39,31,34};
        
        assertThat(kd.countDoors(doorR, doorG, keys), is(17));
    }

}
