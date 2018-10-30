package com.jk.model;

/**
 * <pre>com.jk.model
 * 类名称：CartItem
 * 类描述：购物项对象
 * 创建人：王震
 * 创建时间：2018/10/30  18:31
 * 修改人：王震
 * 修改时间：2018/10/30  18:31
 * 修改备注：
 * @version </pre>
 */
public class CartItem {
    private Product product;	// 购物项中商品信息
    private int count;			// 购买某种商品数量
    private double subtotal;	// 购买某种商品小计
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    // 小计自动计算的.
    public double getSubtotal() {
        return count * product.getShop_price();
    }
	/*public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	*/
}
