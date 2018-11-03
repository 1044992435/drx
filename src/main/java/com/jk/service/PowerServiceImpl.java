package com.jk.service;

import com.alibaba.fastjson.JSONObject;
import com.jk.mapper.PowerMapper;
import com.jk.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <pre>com.jk.service
 * 类名称：PowerServiceImpl
 * 类描述：
 * 创建人：董睿晓
 * 创建时间：2018/10/31  15:50
 * 修改人：董睿晓
 * 修改时间：2018/10/31  15:50
 * 修改备注：
 * @version </pre>
 */
@Service
public class PowerServiceImpl implements PowerService{

    @Autowired
    private PowerMapper powerMapper;

    @Override
    public JSONObject queryadmin(Integer rows, Integer page) {
        long count = powerMapper.queryadminCount();
        int start = (page-1)*rows;
        List<AdminUser> list = powerMapper.queryadmin(start,rows);
        JSONObject json = new JSONObject();
        json.put("rows", list);
        json.put("total", count);
        return json;
    }

    @Override
    public JSONObject queryrole(Integer rows, Integer page) {
        long count = powerMapper.queryroleCount();
        int start = (page-1)*rows;
        List<Role> list = powerMapper.queryrole(start,rows);
        JSONObject json = new JSONObject();
        json.put("rows", list);
        json.put("total", count);
        return json;
    }

    @Override
    public List<AdminRole> queryRole(Integer uid) {
        return powerMapper.queryRole(uid);
    }

    @Override
    public void saveRole(Integer userId, String[] roleIds) {
        powerMapper.deleteRole(userId);
        powerMapper.saveRole(userId,roleIds);
    }

    public List<Tree> querypower(int pid) {
        List<Tree> trees = powerMapper.queryTreeByPid(pid);
//	      判断查询到数据，则循环操作
        if(trees != null && trees.size()>0){
            for (int i = 0; i < trees.size(); i++) {
//	              根据当前节点id查询新的子集列表，
                List<Tree> trees2 = querypower(trees.get(i).getId());
//	              将列表set到当前树节点对象中
                trees.get(i).setChildren(trees2);
            }
        }
        return trees;
    }

    @Override
    public void addpower(Integer rid, String[] ids) {
        powerMapper.deletepower(rid);
        powerMapper.addpower(rid,ids);
    }

    @Override
    public void deleteadmin(Integer uid) {
        powerMapper.deleteadmin(uid);
    }

    @Override
    public void deleterole(Integer id) {
        powerMapper.deleterole(id);
    }

    @Override
    public void addroles(Role role) {
        powerMapper.addroles(role);
    }

    @Override
    public void updateroles(Role role) {
        powerMapper.updateroles(role);
    }

    @Override
    public Role queryRoles(Integer id) {
        return powerMapper.queryRoles(id);
    }

    @Override
    public int deletes(String ids) {
        String[] idss = ids.split(",") ;
        int n = powerMapper.deletes(idss);
        return n;
    }

    @Override
    public List<RoleTree> queryroletree(Integer rid) {
        return powerMapper.queryroletree(rid);
    }

}
