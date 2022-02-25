package com.crawlling.common;

/* api url 정의 */
public final class Url {
	public static final String TILES_ROOT = "/tiles/view";
	public static final String TILES_SINGLE = "/tiles/single";
	public static final String TILES_AJAX = "/tiles/ajax";
	
	/* 로그인 */
	public static final class AUTH {
		
		/* 로그인 url */
		public static final String LOGIN = "/auth/login";
		
		/* 로그인 jsp */
		public static final String LOGIN_JSP = TILES_SINGLE + "/auth/login";
		
		/* 회원가입 url */
		public static final String JOIN = "/auth/join";
		
		/* 회원가입 jsp */
		public static final String JOIN_JSP = TILES_SINGLE + "/auth/join";
	  
		/* 사용자 등록 */
		public static final String INSERT_USER = "/auth/insertUser";
		 
		/* 로그인 인증 요청 */
		public static final String LOGIN_PROC = "/auth/login-proc";
		  
		/* 로그아웃 요청 */
		public static final String LOGOUT_PROC = "/auth/logout-proc";
	}
	
	/** 공통 */
	public static final class COMMON {
		
		/* 파일 업로드 */
		public static final String FILE_UPLOAD = "/file-upload";
		
		/** 파일 다운로드 */
		public static final String FILE_DOWNLOAD = "/file-download";
		
	}
	
	/* 메인 화면 */
	public static final class MAIN {
	
		public static final String _MAIN_AJAX_ROOT_PATH = "/main/ajax";
		
		/* main url */
		public static final String MAIN = "/";
		
		/* main jsp */
		public static final String MAIN_JSP = TILES_ROOT + "/main/main-list";
	}
	
	/** 크롤링 */
	public static final class CRAWLING {
		
		/** 터미널 사이트 크롤링 */
		public static final String TEMINAL = "/terminal";
	}
	
}