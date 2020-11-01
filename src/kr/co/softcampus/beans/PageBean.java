package kr.co.softcampus.beans;

public class PageBean {
	//최소페이지 번호
	private int min;
	//최대 페이지 번호
	private int max;
	//이번 버튼의 페이지 번호
	private int prevPage;
	//다음 버튼의 페이지 번호
	private int nextPage;
	//전체 페이지 개수
	private int pageCnt;
	//현재 페이지 개수
	private int currentPage;
	
	
	//contentCnt:전체글 개수 , currentPage: 현대 글번호, contentPageCnt: 페이지당 글의 개수, pageinationCunt:페이지 번튼 개수
	public PageBean(int contentCnt, int currentPage, int contentpageCnt, int paginationCnt) {
		this.currentPage = currentPage;
		
		pageCnt = contentCnt / contentpageCnt;
		if(contentCnt % contentpageCnt > 0) {
			pageCnt++;
		}
		
		min = ((currentPage - 1) / contentpageCnt) * contentpageCnt + 1;
		max = min + paginationCnt - 1;
		if(max > pageCnt) {
			max = pageCnt;
		}
		prevPage = min - 1;
		nextPage = max + 1;
		if(nextPage > pageCnt) {
			nextPage = pageCnt;
		}
	}
	
	public int getMin() {
		return min;
	}
	public int getMax() {
		return max;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public int getPageCnt() {
		return pageCnt;
	}
	public int getCurrentPage() {
		return currentPage;
	}
}
