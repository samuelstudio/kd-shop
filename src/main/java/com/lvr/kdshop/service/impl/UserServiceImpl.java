package com.lvr.kdshop.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lvr.kdshop.entity.User;
import com.lvr.kdshop.entity.vo.UserVo;
import com.lvr.kdshop.mapper.UserMapper;
import com.lvr.kdshop.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lvr
 * @since 2020-05-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Override
    public Page<UserVo> getUsersList(Page<UserVo> page, String username) {
        return page.setRecords(this.baseMapper.getUsersList(page, username));
    }
}
