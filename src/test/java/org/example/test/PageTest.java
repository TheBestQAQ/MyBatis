package org.example.test;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.example.mapper.PersonMapper;
import org.example.pojo.Person;
import org.example.utils.SqlSessionUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class PageTest {
    @Test
    public void test() throws IOException {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        PageHelper.startPage(2,3);
        List<Person> allPerson = mapper.getAllPerson();
        allPerson.forEach(item-> System.out.println(item));
    }
}
