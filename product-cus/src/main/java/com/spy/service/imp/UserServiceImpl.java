package com.spy.service.imp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spy.dao.UserMapper;
import com.spy.entity.User;
import com.spy.entity.demo.PageRet;
import com.spy.service.UserService;
import com.spy.util.page.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shipy
 * @since 2019-01-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    @Transactional
    public PageRet getUsersByPage(PageUtil pageUtil) {
        IPage<User> listUser = userMapper.selectPage(new Page<>(pageUtil.getPageStart(),pageUtil.getPageNumber()),
                null);
        PageRet pageRet = new PageRet();
        pageRet.setData(listUser.getRecords());
        pageRet.setPageCurrent(listUser.getCurrent());
        pageRet.setPageTotal(listUser.getPages());
        pageRet.setTotalNum(listUser.getTotal());
        return pageRet;
    }
}
