package com.example.demo.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * 复合主键类，用于表示 CartItem 表的主键。
 */
public class CartItemId implements Serializable {

    private String userId; // 用户ID
    private String productId; // 商品ID

    // 默认构造函数（JPA 要求）
    public CartItemId() {}

    // 带参数的构造函数
    public CartItemId(String userId, String productId) {
        this.userId = userId;
        this.productId = productId;
    }

    // equals 方法，用于比较两个复合主键是否相等
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartItemId that = (CartItemId) o;
        return Objects.equals(userId, that.userId) && Objects.equals(productId, that.productId);
    }

    // hashCode 方法，用于生成复合主键的哈希值
    @Override
    public int hashCode() {
        return Objects.hash(userId, productId);
    }

    // Getters 和 Setters（根据需要可添加）
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}