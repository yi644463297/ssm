package cn.itcast.dao.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void findAll() {
        System.out.println(userDao.findAll());
    }
}
