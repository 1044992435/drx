package com.jk.service;

import com.jk.mapper.MainMapper;
import com.jk.model.AdminUser;
import com.jk.model.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

/**
 * <pre>com.jk.service
 * 类名称：MainServiceImpl
 * 类描述：
 * 创建人：王震
 * 创建时间：2018/10/31  14:07
 * 修改人：王震
 * 修改时间：2018/10/31  14:07
 * 修改备注：
 * @version </pre>
 */
@Service("mainService")
public class MainServiceImpl implements MainService {
    @Autowired
    private MainMapper mainMapper;
    //树形菜单
    @Override
    public List<Tree> finMenuTree() {
        String pid = "0";
        return getChild(pid);
    }

    //验证是否有pid
    private List<Tree> getChild(String pid) {
        List<Tree> menuTreeList = mainMapper.findMenuTreeByid(pid);
        for (Tree menuTree : menuTreeList) {
            String id = menuTree.getId();
            List<Tree> child = getChild(id);
            if (child.size()>0) {
                menuTree.setNodes(child);
            }

        }

        return menuTreeList;
    }

    //验证是否用户名是否存在
    @Override
    public boolean userName(String username) {
        AdminUser login=mainMapper.userName(username);
        if(login!=null){
            return true;
        }else{
            return false;
        }
    }
    //验证用户名，密码是否能登录
    @Override
    public AdminUser login(AdminUser adminUser) {
        AdminUser login= mainMapper.login(adminUser);
        return login;

    }

    @Override
    public boolean regUser(AdminUser adminUser) {
        AdminUser login= mainMapper.userName(adminUser.getUsername());
        if(login!=null){

            return false;
        }
        mainMapper.addUser(adminUser);
        return true;
    }
    }

