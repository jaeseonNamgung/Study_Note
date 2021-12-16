package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import vo.MemberVO;

/**
 * Servlet implementation class MemberInsertAction
 */
//  URL매핑 : 현재 서블릿을 호출하기 위한 키워드
@WebServlet("/insert.do")
public class MemberInsertAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, // 요청처리 객체
			HttpServletResponse response) // 응답처리 객체
			throws ServletException, IOException {
		// url 매핑이 호출되면 주된 처리로직을 수행하는 메서드

		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String addr = request.getParameter("addr");

		MemberVO vo = new MemberVO();
		
		vo.setId(id);
		vo.setName(name);
		vo.setPwd(pwd);
		vo.setEmail(email);
		vo.setAddr(addr);
		MemberDAO.getInstance().insert(vo);
	

		response.sendRedirect("list.do");

	}

}
