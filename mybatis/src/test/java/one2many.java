import com.learn.dao.AccountImp;
import com.learn.dao.UserImp;
import com.learn.domain.Account;
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

public class one2many {

    @Test
    public void findaccount() throws Exception{
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        AccountImp account = sqlSession.getMapper(AccountImp.class);
        List<Account> acs = account.findAll();
        for(Account ac : acs){
            System.out.println(ac);
            System.out.println(ac.getUser());
        }

        in.close();
        sqlSession.close();
    }

}
