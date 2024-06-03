package user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import user.bean.UserImageDTO;

@Repository
@Transactional
public class UserUploadDAOMybatis implements UserUploadDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void upload(UserImageDTO userImageDTO, List<String> fileNameList) {
		for( String fileName : fileNameList) {
			userImageDTO.setImage1(fileName);
			sqlSession.insert("userUploadSQL.upload", userImageDTO);
		}
		
	}

	@Override
	public List<UserImageDTO> getUploadList() {
		
		return sqlSession.selectList("userUploadSQL.getUploadList");
	}

}
