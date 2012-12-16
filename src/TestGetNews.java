import com.whut.WiseAgriAjax.*;
public class TestGetNews {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebService ws = new WebService();
		//System.out.println(ws.GetNewsList(1, 3, "2010-01-01", "2013-01-01"));
		//ws.GetSupplyList(1, 2, "2010-01-01", "2013-01-01");
		//System.out.println(ws.GetSupplyList(1, 3, "2010-01-01", "2013-01-01"));
		//System.out.println();
		//System.out.println(ws.GetBuyList(1, 3, 1,"2010-01-01", "2013-01-01"));
		ws.GetQuestionList(1, 2, 1,"2010-01-01", "2013-01-01");
		//ws.GetAnswer(292);
		//System.out.println(ws.GetQuestionList(1, 3, 1,"2010-01-01", "2013-01-01"));

	}

}
