package com.spy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spy.entity.User;
import com.spy.entity.demo.PageRet;
import com.spy.util.page.PageUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shipy
 * @since 2019-01-06
 */

public interface UserService extends IService<User> {

    PageRet getUsersByPage(PageUtil pageUtil);

}
