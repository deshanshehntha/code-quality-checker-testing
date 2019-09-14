package services;
import model.SingleLine;


import java.util.List;

public class ComplexityProgramStatmentService {
	

	public List<SingleLine> calculateComplexityOfProgramStatment(List<SingleLine> statmentList){
		for(SingleLine line :statmentList) {
			line.setCps(line.getCs()*line.getTw());
		}
		
		return statmentList;
	}
	
}
