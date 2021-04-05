package com.zeki.mybatis.test;

import com.zeki.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.io.InputStream;

/**
 * Description:
 *
 * @author GUCHAOLONG
 * @date 2020/11/25 13:37
 */
@Component
public class Test {
    public static void main(String[] args) throws IOException {
        String source = "MyBatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(source);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    }


}
