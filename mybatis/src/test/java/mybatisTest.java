import com.learn.dao.UserImp;
import com.learn.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author ：Doug
 * @description：TODO
 * @date ：2020/12/9-8:11 下午
 */

public class mybatisTest {
    public static void main(String[] args) throws Exception {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        UserImp userImp =sqlSession.getMapper(UserImp.class);
        List<User> list = userImp.FindAll();
        for(User user : list){
            System.out.println(user);
        }

        in.close();
        sqlSession.close();
    }
    @Test
    public void findbyname() throws Exception{
        User u = new User();
        u.setUsername("%王%");
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        UserImp userImp = sqlSession.getMapper(UserImp.class);
        List<User> users = userImp.findByName(u);
        for(User user : users){
            System.out.println(user);
        }
    }
    @Test
    public void insert() throws Exception{
        User u = new User();
        u.setUsername("lisa");
        u.setAddress("泰国");
        u.setSex("女");
        u.setBirthday(new Date());
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = factory.openSession();
        UserImp userImp = sqlSession.getMapper(UserImp.class);
        userImp.insert(u);
        sqlSession.commit();
    }
}
