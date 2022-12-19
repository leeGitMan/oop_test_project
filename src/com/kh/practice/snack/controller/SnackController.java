package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	
	private Snack s = new Snack();
	public SnackController() {
		
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장 완료 했습니다." + 
					"\n저장한 정보를 확인하겠습니까?(y/n)";
		
		
		
		
	}
	
	public String confirmData() {
		
		return s.information();
	}
	

}
