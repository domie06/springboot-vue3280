package com.entity.vo;

import com.entity.GoodsEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商品信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("goods")
public class GoodsVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 农户
     */

    @TableField(value = "shangjia_id")
    private Integer shangjiaId;


    /**
     * 商品名称
     */

    @TableField(value = "goods_name")
    private String goodsName;


    /**
     * 商品类型
     */

    @TableField(value = "goods_types")
    private Integer goodsTypes;


    /**
     * 商品照片
     */

    @TableField(value = "goods_photo")
    private String goodsPhoto;


    /**
     * 商品库存
     */

    @TableField(value = "goods_kucun_number")
    private Integer goodsKucunNumber;


    /**
     * 商品原价
     */

    @TableField(value = "goods_old_money")
    private Double goodsOldMoney;


    /**
     * 现价
     */

    @TableField(value = "goods_new_money")
    private Double goodsNewMoney;


    /**
     * 点击次数
     */

    @TableField(value = "goods_clicknum")
    private Integer goodsClicknum;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "goods_delete")
    private Integer goodsDelete;


    /**
     * 商品简介
     */

    @TableField(value = "goods_content")
    private String goodsContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：农户
	 */
    public Integer getShangjiaId() {
        return shangjiaId;
    }


    /**
	 * 获取：农户
	 */

    public void setShangjiaId(Integer shangjiaId) {
        this.shangjiaId = shangjiaId;
    }
    /**
	 * 设置：商品名称
	 */
    public String getGoodsName() {
        return goodsName;
    }


    /**
	 * 获取：商品名称
	 */

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    /**
	 * 设置：商品类型
	 */
    public Integer getGoodsTypes() {
        return goodsTypes;
    }


    /**
	 * 获取：商品类型
	 */

    public void setGoodsTypes(Integer goodsTypes) {
        this.goodsTypes = goodsTypes;
    }
    /**
	 * 设置：商品照片
	 */
    public String getGoodsPhoto() {
        return goodsPhoto;
    }


    /**
	 * 获取：商品照片
	 */

    public void setGoodsPhoto(String goodsPhoto) {
        this.goodsPhoto = goodsPhoto;
    }
    /**
	 * 设置：商品库存
	 */
    public Integer getGoodsKucunNumber() {
        return goodsKucunNumber;
    }


    /**
	 * 获取：商品库存
	 */

    public void setGoodsKucunNumber(Integer goodsKucunNumber) {
        this.goodsKucunNumber = goodsKucunNumber;
    }
    /**
	 * 设置：商品原价
	 */
    public Double getGoodsOldMoney() {
        return goodsOldMoney;
    }


    /**
	 * 获取：商品原价
	 */

    public void setGoodsOldMoney(Double goodsOldMoney) {
        this.goodsOldMoney = goodsOldMoney;
    }
    /**
	 * 设置：现价
	 */
    public Double getGoodsNewMoney() {
        return goodsNewMoney;
    }


    /**
	 * 获取：现价
	 */

    public void setGoodsNewMoney(Double goodsNewMoney) {
        this.goodsNewMoney = goodsNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getGoodsClicknum() {
        return goodsClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setGoodsClicknum(Integer goodsClicknum) {
        this.goodsClicknum = goodsClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getGoodsDelete() {
        return goodsDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setGoodsDelete(Integer goodsDelete) {
        this.goodsDelete = goodsDelete;
    }
    /**
	 * 设置：商品简介
	 */
    public String getGoodsContent() {
        return goodsContent;
    }


    /**
	 * 获取：商品简介
	 */

    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
