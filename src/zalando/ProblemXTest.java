package zalando;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemXTest {

	@Test
	public void test() {
//		assertEquals(2, result.data);
//		assertEquals(4, result.next.data);
//		assertNull(result.next.next);
		
		assertEquals("", Problem2.solution("my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b"));
	}
}



//class Solution {
//    public int solution(int[] A) {
//        
//        HashSet<Integer> found = new HashSet<Integer>();
//        
//        for(int i : A){
//            if (i > 0){
//                found.add(i);
//            }   
//        }
//        
//        int result=1;    
//        while(found.contains(result)){
//            result++;
//        }
//        
//        return result;
//        // write your code in Java SE 8
//    }
//}

