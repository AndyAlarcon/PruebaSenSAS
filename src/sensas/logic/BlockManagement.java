package sensas.logic;

import java.util.ArrayList;
import java.util.Iterator;

import sensas.models.BlockModel;

public class BlockManagement {

	private ArrayList<BlockModel> blocks;
	
	public BlockManagement() {
		this.blocks = new ArrayList<BlockModel>();
	}
	
	public void loadBlocks() {
		//Primer fila 
		
		blocks.add(new BlockModel('B','O',true, 0));
		blocks.add(new BlockModel('X','K',true, 0));
		blocks.add(new BlockModel('D','Q',true, 0));
		blocks.add(new BlockModel('C','P',true, 0));
		blocks.add(new BlockModel('N','A',true, 0));
		blocks.add(new BlockModel('G','T',true, 0));
		blocks.add(new BlockModel('R','E',true, 0));
		blocks.add(new BlockModel('T','G',true, 0));
		blocks.add(new BlockModel('Q','D',true, 0));
		blocks.add(new BlockModel('F','S',true, 0));
		
		//Segunda fila 
		blocks.add(new BlockModel('H','U',true, 0));
		blocks.add(new BlockModel('V','I',true, 0));
		blocks.add(new BlockModel('A','T',true, 0));
		blocks.add(new BlockModel('O','B',true, 0));
		blocks.add(new BlockModel('E','R',true, 0));
		blocks.add(new BlockModel('F','S',true, 0));
		blocks.add(new BlockModel('L','Y',true, 0));
		blocks.add(new BlockModel('P','C',true, 0));
		blocks.add(new BlockModel('Z','M',true, 0));
		blocks.add(new BlockModel('J','W',true, 0));
		
		
	}


	public boolean canIGetWord(String word) {
		
		int characters = word.length();
		int found = 0;
		int pair = 0, repeat = 0, index = 0;
		
		for (int i = 0; i < word.length(); i++) {
			
			char inputLetter = word.toUpperCase().charAt(i);
			
			// Se marca el nodo que contiene las 2 letras de la palabra
			index = 0;
			for (BlockModel blockModel : blocks) {
				
				if(blockModel.getFirstLetter() == inputLetter) {
					
					blockModel.setBoth(blockModel.getBoth() + 1);
					
					if(blockModel.getBoth() == 2) {
						pair = index;
					}
					break;
				}
				else if (blockModel.getSecondLetter() == inputLetter) {
					blockModel.setBoth(blockModel.getBoth() + 1);
					
					if(blockModel.getBoth() == 2) {
						pair = index;
					}
					break;
				}
				index++;
				
			}
			
		}
		for (BlockModel blockModel : blocks) {
			
			if(blockModel.getBoth() != 2 && blocks.get(pair).getBoth() == 2) {
				
				if(Character.compare(blocks.get(pair).getFirstLetter(),blockModel.getFirstLetter()) == 0) {
					blockModel.setAvailable(false);
					found++;
				}
				else if(Character.compare(blockModel.getSecondLetter() , blocks.get(index).getFirstLetter()) == 0) {
					blockModel.setAvailable(false);
					found++;
				}
				else if(Character.compare(blockModel.getFirstLetter(), blocks.get(index).getSecondLetter()) == 0) {
					blockModel.setAvailable(false);
					found++;
				}
				else if(Character.compare(blockModel.getSecondLetter(), blocks.get(index).getSecondLetter()) == 0) {
					blockModel.setAvailable(false);
					found++;
				}
			}
			
		}
		
		for (int i = 0; i < word.length(); i++) {
			
			char inputLetter = word.toUpperCase().charAt(i);
			
			for (BlockModel blockModel : blocks) {
				
				if(blockModel.getFirstLetter() == inputLetter && blockModel.isAvailable() == true ) { //&& blockModel.getBoth() == 1) {
					blockModel.setAvailable(false);
					found++;
					break;
				}
				else if(blockModel.getSecondLetter() == inputLetter && blockModel.isAvailable() == true) { //&& blockModel.getBoth() == 1 ) {
					blockModel.setAvailable(false);
					found++;
					break;
				}
			}
			
			for (BlockModel blockModel : blocks) {
				if(blockModel.getBoth() == 2 ) {
					if(blockModel.getFirstLetter() == inputLetter && blockModel.isAvailable() == true ) {
						blockModel.setAvailable(false);
						found++;
						break;
					}
					else if(blockModel.getSecondLetter() == inputLetter && blockModel.isAvailable() == true ) {
						blockModel.setAvailable(false);
						found++;
						break;
					}
				}
			}
			
		}
		if(found == characters) {
			return true;
		}
		else {
			return false;
		}
	}


}
