package com.crawlling.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.crawlling.common.Url.CRAWLING;
import com.crawlling.common.MakeExcel;
import com.crawlling.service.CrawlingService;

@Controller
public class MainController {

	/*
	 *  터미널 사이트 크롤링 후 csv 파일 떨구기
	 */
	@GetMapping(CRAWLING.TEMINAL)
	public void crawlingTerminal(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception{
		
		// 받은 데이터를 맵에 담는다.
		Map<String, Object> beans = new HashMap<String, Object>();
		
		List<Map<String, Object>> terminalList = new ArrayList<>();
		
		CrawlingService crawlingService = new CrawlingService();
		
		//서울
		terminalList = crawlingService.getTerminalDatas(terminalList, 11, 4);
		
		//부산
		terminalList = crawlingService.getTerminalDatas(terminalList, 26, 4);
		
		//대구
		terminalList = crawlingService.getTerminalDatas(terminalList, 27, 2);
		
		//인천
		terminalList = crawlingService.getTerminalDatas(terminalList, 28, 4);
		
		//광주광역시
		terminalList = crawlingService.getTerminalDatas(terminalList, 29, 2);
		
		//대전광역시
		terminalList = crawlingService.getTerminalDatas(terminalList, 30, 2);
		
		//울산광역시
		terminalList = crawlingService.getTerminalDatas(terminalList, 31, 3);
		
		//세종시
		terminalList = crawlingService.getTerminalDatas(terminalList, 40, 1);
		
		//경기도
		terminalList = crawlingService.getTerminalDatas(terminalList, 41, 46);
		
		//강원도
		terminalList = crawlingService.getTerminalDatas(terminalList, 42, 41);

		//충청북도
		terminalList = crawlingService.getTerminalDatas(terminalList, 43, 13);
		
		//충청남도
		terminalList = crawlingService.getTerminalDatas(terminalList, 44, 25);
		
		//전라북도
		terminalList = crawlingService.getTerminalDatas(terminalList, 45, 14);
		
		//전라남도
		terminalList = crawlingService.getTerminalDatas(terminalList, 46, 42);
		
		//경상북도
		terminalList = crawlingService.getTerminalDatas(terminalList, 47, 38);
		
		//경상남도
		terminalList = crawlingService.getTerminalDatas(terminalList, 48, 48);
		
		//제주도
		terminalList = crawlingService.getTerminalDatas(terminalList, 49, 1);
		
		
		
		//평균 계약서 응답 시간
		beans.put("dataList", terminalList);

		// 엑셀 다운로드 메소드가 담겨 있는 객체
		MakeExcel me = new MakeExcel();

		//엑셀 다운로드
		me.download(request, response, beans, "terminal_excelDownload.xlsx", "terminal.xlsx", null);
		
	}
	
}
