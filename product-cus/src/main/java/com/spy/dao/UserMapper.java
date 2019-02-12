package com.spy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spy.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author shipy
 * @since 2019-01-06
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}
