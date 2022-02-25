package com.crawlling.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class CrawlingService {
	
	public List<Map<String, Object>> getTerminalDatas(List<Map<String, Object>> terminalList, int teminalId, int page) throws IOException {
		
		for(int i=1; i<=page; i++) {
			String url = "https://www.bustago.or.kr/newweb/kr/terminalInfo/ajax/terminallist_ajax.do?terminalAbbrNm=&terminalId="+teminalId+"&terminalSearch=&page="+i+"";

			Document doc = Jsoup.connect(url).get();
			Elements contents = doc.select("table tbody tr");
			
			for(Element content : contents){
				Map<String, Object> map = new HashMap<String, Object>();
	            Elements tdContents = content.select("td");
	            map.put("boardNo", Integer.parseInt(tdContents.get(0).text()));
	            map.put("region", tdContents.get(1).text());
	            map.put("terminalNm", tdContents.get(2).text());
	            map.put("address", tdContents.get(3).text());
	            map.put("phoneNo", tdContents.get(4).text());
	            terminalList.add(map);
	        }
		}

		System.out.println("size : " + terminalList.size());
		return terminalList;
	}
	
	
}
