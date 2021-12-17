package constructor;

public class Webtoon {
	//웹툰은 읨의로 여러분들이 정보/속성을 추가해주셔도 됩니다.
	//name(제목),series(회차),painter(작가),complete(완결여부)
	//생성자에는 위 4개 정보를 입력받도록 해주시고
    //complete는 처음 생성시 false, series는 1로 자동으로 입력됩니다.
	
	//웹툰정보안내하기  getlnfo() ->"제목은 : name, 회차는 series...."
	//웹툰업로드 uploadWebtoon() -> series를 1증가
	//웹툰완결지시 completeWebton() -> complete변수를 true로 변경
	
	//웹툰을 자바내에서 구현한다.
	public String name;//제목
	public int series;//회차
	public String painter;//작가
	public String complete;//완결여부
	
	//생성자 생성
	public Webtoon(String n,String p) {
		name = n;
		series = 1;
		painter = p;
		complete = "false";
	}
		public void getInfo() {
		System.out.println("웹툰제목: " + name +",회차: " + series + ",작가: " + painter +",완결여부:" + complete);
		}
		
		//업로드 생성하기
		public void uploadWebtoon() {
			series += 1;
		}
		//완결여부	 생성(false에서 true로 변경)
			
			public void completeWebtoon() {
			 complete = "true";
			     //	int complete = 1;
			     //if((complete) > 15){
			     //	System.out.println("false");
			}    // else {
				 //System.out.println("true");
			
			
		}
		
	
	
	
	// 위 기능들을 구현해주신 다음 Main03P204에서 실행해주시면 됩니다.
	
	


