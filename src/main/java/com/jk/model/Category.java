package com.jk.model;

import java.util.HashSet;
import java.util.Set;

/**
 * <pre>com.jk.model
 * 类名称：Category
 * 类描述：一级分类的实体类对象
 * 创建人：王震
 * 创建时间：2018/10/30  18:34
 * 修改人：王震
 * 修改时间：2018/10/30  18:34
 * 修改备注：
 * @version </pre>
 */
public class Category {
    private Integer cid;
    private String cname;
    // 一级分类中存放二级分类的集合:
    private Set<CategorySecond> categorySeconds = new HashSet<CategorySecond>();

    public Integer getCid() {
        return cid;
    }
    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public Set<CategorySecond> getCategorySeconds() {
        return categorySeconds;
    }
    public void setCategorySeconds(Set<CategorySecond> categorySeconds) {
        this.categorySeconds = categorySeconds;
    }
}
