package action;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class FileUploadAction
 */
@WebServlet("/upload.do")
public class FileUploadAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		//request.setCharacterEncoding("utf-8");
		
		//파일이 저장될 경로
		String web_path = "/img/";
		
		// ServletContext : 현재 프로젝트의 정보를 가지고 관리하는 객체
		ServletContext app = request.getServletContext();
		
		//상대경로 img 폴더와 연결되어 있는 절대경로 img 폴더의 위치를 얻어낸다.
		String path = app.getRealPath(web_path);
		System.out.println(path);
		
		//최대 업로드 용량(약 100mb로 지정)
		int max_size = 1024 * 1024 * 100;
		
		//파일형식을 포함하고 있는 파라미터를 수신하기 위한 클래스
		MultipartRequest mr = new MultipartRequest(
				                  request,
				                  path, // 업로드 위치
				                  max_size,
				                  "utf-8", //수신 인코딩 타입
				                  new DefaultFileRenamePolicy() // 동일 파일명 정책
				                    );
		
		File f =mr.getFile("photo"); 
		String filename = "";
		if(f != null) {
			filename = f.getName(); //업로드된 파일의 실제 이름을 가져온다.
		}
		
		// 파일 이외의 일반 파라미터도 mr를 통해서 받아와야 한다.
		String title = mr.getParameter("title");
		
		// 파일명과 title을 바인딩
		request.setAttribute("title",title);
		request.setAttribute("fn", filename);
		
		// result.jsp로 포워딩 
		RequestDispatcher disp = request.getRequestDispatcher("result.jsp");
		disp.forward(request, response);
	}

}
