package cn.itcast.service.user;

import cn.itcast.domain.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();
}
