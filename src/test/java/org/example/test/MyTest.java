package org.example.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.DynamicSqlMapper;
import org.example.mapper.PersonMapper;
import org.example.pojo.Person;
import org.example.utils.SqlSessionUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MyTest {
    @Test
    public void test1() throws IOException {

////        1.加载核心配置文件
//        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
////        2.获取SqlSessionFactoryBuilder
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
////        3.获取SqlSessionFactory
//        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
////        4.获取SqlSession
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);//true表示自动提交事务
//        5.获取mapper接口的对象
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Person> list = mapper.getPerson(new Person(null, null, 22, "anhui"));
        list.forEach(p-> System.out.println(p));

//        6.插入数据
//        List<Person> allPerson = mapper.getAllPerson();
//        for (Person person : allPerson) {
//            System.out.println(person);
//        }
//        7.提交事务
//        sqlSession.commit();
    }
}