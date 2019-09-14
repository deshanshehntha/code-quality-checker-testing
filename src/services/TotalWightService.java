package services;


import model.SingleLine;

import java.util.List;

public class TotalWightService {
	

	public List<SingleLine> calculateTotalWeight(List<SingleLine> statmentList){
		for(SingleLine line :statmentList) {
			line.setTw(line.getCtc()+line.getCnc()+line.getCi());
		}
		
		return statmentList;
	}
	
}
