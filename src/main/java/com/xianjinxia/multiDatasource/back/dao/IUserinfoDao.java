package com.xianjinxia.multiDatasource.back.dao;



import com.xianjinxia.multiDatasource.back.domain.Userinfo;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserinfoDao {
//    int deleteByPrimaryKey(Long id);
//
//    int insert(Userinfo record);
//
//    int insertSelective(Userinfo record);
//
    Userinfo selectByPrimaryKey(@Param("id") Long id);
//
//    int updateByPrimaryKeySelective(Userinfo record);
//
//    int updateByPrimaryKey(Userinfo record);
//
//    List<Userinfo> selectPage(Map<String, Object> paramMap);
//
//    int selectCount(HashMap<String, Object> paramMap);
//
//    Userinfo selectByLoginName(@Param("loginName") String loginName);
//
//    Userinfo select4Login(@Param("loginName") String loginName, @Param("pwd") String pwd);

//    List<Long> selectAllChannelYoumiUserIds();
//
//    List<Long> selectAllChannelUserIds();


}