package noticeBoard.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class NoticeBoardDAOImple implements NoticeBoardDAO {

	@Autowired
	private SqlSessionTemplate sqlMap;

	@Override
	public List boardList() {
		List list = sqlMap.selectList("boardList");
		return list;
	}
	

}
