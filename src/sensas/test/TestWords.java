package sensas.test;

import junit.framework.TestCase;
import sensas.logic.BlockManagement;

public class TestWords extends TestCase {

	
	private BlockManagement blockManagement;
	
	public void TestWords() {
		this.blockManagement = new BlockManagement();
		blockManagement.loadBlocks();
	}
	
	public void testA() {
		TestWords();
		assertEquals(true, blockManagement.canIGetWord("A"));
	}
	public void testLibro() {
		TestWords();
		assertEquals(true, blockManagement.canIGetWord("libro"));
	}
	public void testBozo() {
		TestWords();
		assertEquals(false, blockManagement.canIGetWord("BOZO"));
	}
	public void testTraje() {
		TestWords();
		assertEquals(true, blockManagement.canIGetWord("TRAJE"));
	}
	public void testComun() {
		TestWords();
		assertEquals(true, blockManagement.canIGetWord("COMUN"));
	}
	public void testCampana() {
		TestWords();
		assertEquals(false, blockManagement.canIGetWord("CAMPANA"));
	}
	public void testDorito() {
		TestWords();
		assertEquals(true, blockManagement.canIGetWord("DORITO"));
	}
	public void testArlequin() {
		TestWords();
		assertEquals(true, blockManagement.canIGetWord("ARLEQUIN"));
	}
	
	
}
