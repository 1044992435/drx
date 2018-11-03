package com.jk.model;

import java.io.Serializable;

/**
 * <pre>com.jk.model
 * 类名称：OrderItem
 * 类描述：订单项的实体
 * 创建人：王震
 * 创建时间：2018/10/30  18:36
 * 修改人：王震
 * 修改时间：2018/10/30  18:36
 * 修改备注：
 * @version </pre>
 */
public class OrderItem implements Serializable {

    private Integer itemid;
    private Integer count;
    private Double subtotal;
    // 商品外键:对象
    private Product product;
    // 订单外键:对象
    private Order order;
    public Integer getItemid() {
        return itemid;
    }
    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public Double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
}
