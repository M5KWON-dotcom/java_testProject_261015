package java_Test_261015;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		//사용자가 작성한 글이 인터넷을 타고 2개의 정보도착(나머지 4개정보는 자동저장,글넘버,시간등..) 
		//6개의 정보를 받아서 각각의 변수에 저장하는 작업
		int bnum =11;
		String btitle = "안녕하세요. 가입인사드려요";
		String bcontent = "오늘은 비가 오다가 날씨가 맑아졌네요.";
		String bwriter = "T타이거12";
		String bdate = "2026-10-15";
		int bhit = 0;
		//생성자를 통해 초기화 //글 정보가 저장된 6개의 정보를 가지고 board1객체를 초기화
		Board board1 = new Board(bnum,btitle,bcontent,bwriter,bdate,bhit);
		//객체 멤버변수에 직접 접근하여 초기화
		Board board2= new Board();
	/*	board2.boardNumber = bnum;
		board2.boardTitle =btitle;
		board2.boardContent = bcontent;
		board2.boardWriter = bwriter;
		board2.boardDate = bdate;
		board2.boardHit = bhit;*/
		
		//setter를 이용하여 객체를 초기화
		board2.setBoardNumber(bnum);
		board2.setBoardTitle(btitle);
        board2.setBoardContent(bcontent);
        board2.setBoardWriter(bwriter);
        board2.setBoardDate(bdate);
        board2.setBoardHit(bhit);
		
		//해당글의 글쓰이를 가져와서 출력
        //객체의 멤버 변수값을 가져오려면 getter를 사용
        String bid = board1.getBoardWriter(); //boardWriter값을 반환
        System.out.println(bid);
        
        ArrayList<Board> boardList = new ArrayList<>();
        
        boardList.add(board1);
        boardList.add(board2);
        
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "홍길동");
        hmap.put(2, "김유신");
        hmap.put(3, "강감찬");
        
       System.out.println(hmap.get(3));
       System.out.println(hmap.get(1)); 
	}

}
